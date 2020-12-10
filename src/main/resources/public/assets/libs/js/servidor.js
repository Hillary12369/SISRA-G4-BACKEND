
export class Servidor {

    static Configuracion() {
        var urlBase = "requisitos"
        return {
            usuario: "Samuel",
            url: urlBase,
            listar: urlBase + "/listar",
            anexar: urlBase + "/anexar",
            borrar: urlBase + "/eliminar",
            pdf: urlBase + "/pdf?doc="
        }
    }

    static Listar(resultado) {
        var config = Servidor.Configuracion();

        Servidor.Peticion([["usuario", config.usuario]], config.listar, "POST", resultado)
    }
    static Eliminar(identificadorRequisito,archivo, resultado) {
        var config = Servidor.Configuracion();
        Servidor.Peticion([["globalid", identificadorRequisito], ["archivo", archivo]], config.borrar, "POST", (e, res) =>  resultado(e, res) )
    }
    static Anexar(archivo, resultado) {
        var config = Servidor.Configuracion();

        Servidor.Peticion([["usuario", config.usuario], ["archivo", archivo]], config.anexar, "POST", resultado)
    }
    static Peticion(parametros, url, tipo, resultado) {
        var xmlReq = new XMLHttpRequest()
        var datos = new FormData()

        for (let i in parametros) {
            datos.append(parametros[i][0], parametros[i][1])
        }

        xmlReq.onload = () => {
            var indexado = Servidor.Indexar(xmlReq.response);
            resultado(indexado, xmlReq.response)
        }
        xmlReq.open(tipo, url)
        xmlReq.send(datos)
    }

    static Indexar(Objeto) {
        var objetoJSON;
        try {
            objetoJSON = JSON.parse(Objeto).cursorurs
            var final = []

            for (const k in objetoJSON) {
                final.push(objetoJSON[k])
            }
    
            return final;
        } catch (error) {
           return ["error", error]         
        }
    }
}


export function ObtenerBotones(id) {
    let resultado = []
    for (let i = 0; i < 5; i++) {
        var elemento = _(id + i)
        if (elemento != null)
            resultado.push(elemento)
    }
    return resultado;
}

export var _ = (elemento) => {
    var resultado = document.getElementById(elemento)
    if (resultado != null)
        return resultado;
}