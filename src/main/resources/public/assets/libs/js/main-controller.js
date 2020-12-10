
import { ObtenerBotones } from "./servidor.js"
import { _ } from "./servidor.js"
import { Servidor } from "./servidor.js"

var modal = {
    texto: _("tituloModal"),
    titulo: _("cuerpoModal"),
    aceptar: _("botonModal"),
    cerrar: _("cerrarModal"),
    establecerEstado: (e)=> e ?  _("modal").removeAttribute("hidden") : _("modal").setAttribute("hidden", "true")  
}

//Variables disponibles
var visualizarBtn = ObtenerBotones("previsualizar")
var descargarBtn = ObtenerBotones("descargar")
var subirDisplayContenedor = ObtenerBotones("subir1Display")
var archivosBtn = ObtenerBotones("archivo")
var borrarBtn = ObtenerBotones("eliminar")

var documentoNombre = ObtenerBotones("documentoNombre")

var previsualizador = _("viewer")
var fondoPrevisualizador = _("fondoView")
var disparadorCerrarVisualizador = _("visualizadorTrigger")

//Metodo incializador
function Inicializar() {
    descargarBtn.forEach((x) => x.setAttribute("disabled", "true"))
    visualizarBtn.forEach((x) => x.setAttribute("disabled", "true"))
    borrarBtn.forEach((x) =>  {x.setAttribute("disabled", "true"); x.setAttribute("hidden", "true")})
    subirDisplayContenedor.forEach((x) => x.setAttribute("hidden", "true"))
    documentoNombre.forEach((x) => x.innerText = "-")

    if (previsualizador != null)
        fondoPrevisualizador.setAttribute("hidden", "true")

    Listar();
}


function Listar() {
    Servidor.Listar((resultado) => ActualizarTabla(resultado))
}
//Disponible para actualizar la tabla
function ActualizarTabla(datos) {
    for (let j = 0; j < 5; j++) {
        let dato = datos[j]
        if (j < datos.length) {
            //Establecemos las descargas
            descargarBtn[j].onclick = () => window.location.href = Servidor.Configuracion().pdf + dato.URLX
            descargarBtn[j].removeAttribute("disabled")
            descargarBtn[j].removeAttribute("hidden")

            //Establecemos los  botones de previsualizar
            visualizarBtn[j].removeAttribute("disabled")
            visualizarBtn[j].onclick = () => {
                PDFObject.embed(Servidor.Configuracion().pdf + dato.URLX, "#viewer")
                fondoPrevisualizador.removeAttribute("hidden")
                disparadorCerrarVisualizador.onclick = () => fondoPrevisualizador.setAttribute("hidden", true)
            }

            //Establecer botones de borrar
            borrarBtn[j].onclick = () => {
                Servidor.Eliminar(dato.GLOBAL_ID, dato.URLX, (e, res)=>{
                    try {
                       var res = JSON.parse(res) 
                       if (res["resultado"] == "normal")
                       {
                           MostrarModal("Alerta", "Elemento eliminado")
                       }else{
                           MostrarModal("Alerta", "Ha ocurrido un error")
                       }
                    } catch (error) {
                        MostrarModal("Alerta", "Ha ocurrido un error")
                    }
                    Listar()
                })
            }
            borrarBtn[j].removeAttribute("disabled")
            borrarBtn[j].removeAttribute("hidden")
            subirDisplayContenedor[j].setAttribute("hidden", true)
            archivosBtn[j].setAttribute("disabled", true)
            documentoNombre[j].innerText = dato.URLX
        }
        else {
            //Aqui va la desactivacion de los botones
            //Se crean slots para poder subir nuevos archivo
            descargarBtn[j].setAttribute("disabled", "true")
            descargarBtn[j].setAttribute("hidden", true)

            visualizarBtn[j].setAttribute("disabled", "true")
            borrarBtn[j].setAttribute("disabled", "true")
            borrarBtn[j].setAttribute("hidden", "true")


            subirDisplayContenedor[j].removeAttribute("hidden")
            archivosBtn[j].onchange = () => {
                //Bloqueamos el boton actual
                archivosBtn[j].setAttribute("disabled", "true")
                Servidor.Anexar(archivosBtn[j].files[0], (e, res) => {
                    var jsonx = JSON.parse(res)
                    if (jsonx["resultado"] == "normal")
                    {
                        MostrarModal("Alerta","Se ha subido correctamente el archivo")
                        Listar()
                    }else{
                        MostrarModal("Alerta","Ha ocurrido un error");
                    }
                    archivosBtn[j].removeAttribute("disabled")
                    archivosBtn[j].value = ""
                });
            }
            archivosBtn[j].removeAttribute("disabled")
            documentoNombre[j].innerText = "-"
        }
    }
}

function MostrarModal(Mensaje, Titulo) {
    modal.establecerEstado(true)
    modal.texto.innerText = Mensaje
    modal.titulo.innerText = Titulo
    modal.aceptar.onclick = () => modal.establecerEstado(false)
    modal.cerrar.onclick = () => modal.establecerEstado(false)
}
//Iniciamos todo
Inicializar();