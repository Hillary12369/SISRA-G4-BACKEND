package pe.edu.upeu.SISRA.entity;

public class Documento {

	private int id_docu;
	private String f_registro;
	private String url;
	private String estado;
	private String codigo;
	private int tipo_documento_id_doc_tipo;
	private int asociacion_id_asc;
	private int id_ult_rev;
	private String categoria;
	
	
	
	
	public Documento() {
		super();
		// TODO Auto-generated constructor stub
	}




	public Documento(int id_docu, String f_registro, String url, String estado, String codigo,
			int tipo_documento_id_doc_tipo, int asociacion_id_asc, int id_ult_rev, String categoria) {
		super();
		this.id_docu = id_docu;
		this.f_registro = f_registro;
		this.url = url;
		this.estado = estado;
		this.codigo = codigo;
		this.tipo_documento_id_doc_tipo = tipo_documento_id_doc_tipo;
		this.asociacion_id_asc = asociacion_id_asc;
		this.id_ult_rev = id_ult_rev;
		this.categoria = categoria;
	}




	public int getId_docu() {
		return id_docu;
	}




	public void setId_docu(int id_docu) {
		this.id_docu = id_docu;
	}




	public String getF_registro() {
		return f_registro;
	}




	public void setF_registro(String f_registro) {
		this.f_registro = f_registro;
	}




	public String getUrl() {
		return url;
	}




	public void setUrl(String url) {
		this.url = url;
	}




	public String getEstado() {
		return estado;
	}




	public void setEstado(String estado) {
		this.estado = estado;
	}




	public String getCodigo() {
		return codigo;
	}




	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}




	public int getTipo_documento_id_doc_tipo() {
		return tipo_documento_id_doc_tipo;
	}




	public void setTipo_documento_id_doc_tipo(int tipo_documento_id_doc_tipo) {
		this.tipo_documento_id_doc_tipo = tipo_documento_id_doc_tipo;
	}




	public int getAsociacion_id_asc() {
		return asociacion_id_asc;
	}




	public void setAsociacion_id_asc(int asociacion_id_asc) {
		this.asociacion_id_asc = asociacion_id_asc;
	}




	public int getId_ult_rev() {
		return id_ult_rev;
	}




	public void setId_ult_rev(int id_ult_rev) {
		this.id_ult_rev = id_ult_rev;
	}




	public String getCategoria() {
		return categoria;
	}




	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	
	
	
	
}
