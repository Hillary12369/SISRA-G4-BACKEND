package pe.edu.upeu.SISRA.entity;

public class Asociacion {

	private int id_asoc;
	private String estado;
	private String nom_asc;
	private String imf_adicional;
	private String n_miembros;
	private String f_constitucion;
	private int tipo_asociacion_id_asc_tipo;
	private int casa_vecinal_id_asc_cv;
	private String ubicacion;
	
	public Asociacion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Asociacion(int id_asoc, String estado, String nom_asc, String imf_adicional, String n_miembros,
			String f_constitucion, int tipo_asociacion_id_asc_tipo, int casa_vecinal_id_asc_cv, String ubicacion) {
		super();
		this.id_asoc = id_asoc;
		this.estado = estado;
		this.nom_asc = nom_asc;
		this.imf_adicional = imf_adicional;
		this.n_miembros = n_miembros;
		this.f_constitucion = f_constitucion;
		this.tipo_asociacion_id_asc_tipo = tipo_asociacion_id_asc_tipo;
		this.casa_vecinal_id_asc_cv = casa_vecinal_id_asc_cv;
		this.ubicacion = ubicacion;
	}

	public int getId_asoc() {
		return id_asoc;
	}

	public void setId_asoc(int id_asoc) {
		this.id_asoc = id_asoc;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getNom_asc() {
		return nom_asc;
	}

	public void setNom_asc(String nom_asc) {
		this.nom_asc = nom_asc;
	}

	public String getImf_adicional() {
		return imf_adicional;
	}

	public void setImf_adicional(String imf_adicional) {
		this.imf_adicional = imf_adicional;
	}

	public String getN_miembros() {
		return n_miembros;
	}

	public void setN_miembros(String n_miembros) {
		this.n_miembros = n_miembros;
	}

	public String getF_constitucion() {
		return f_constitucion;
	}

	public void setF_constitucion(String f_constitucion) {
		this.f_constitucion = f_constitucion;
	}

	public int getTipo_asociacion_id_asc_tipo() {
		return tipo_asociacion_id_asc_tipo;
	}

	public void setTipo_asociacion_id_asc_tipo(int tipo_asociacion_id_asc_tipo) {
		this.tipo_asociacion_id_asc_tipo = tipo_asociacion_id_asc_tipo;
	}

	public int getCasa_vecinal_id_asc_cv() {
		return casa_vecinal_id_asc_cv;
	}

	public void setCasa_vecinal_id_asc_cv(int casa_vecinal_id_asc_cv) {
		this.casa_vecinal_id_asc_cv = casa_vecinal_id_asc_cv;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

}
