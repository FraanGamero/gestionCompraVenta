package entidades;

public class EntidadOfertas {

	private int id_oferta;
	private String nombre_oferta;
	private String descripcion_oferta;
	private int precio_unidad;

	public EntidadOfertas(int id_oferta, String nombre_oferta, String descripcion_oferta, int precio_unidad) {
		super();
		this.id_oferta = id_oferta;
		this.nombre_oferta = nombre_oferta;
		this.descripcion_oferta = descripcion_oferta;
		this.precio_unidad = precio_unidad;
	}

	public int getId_oferta() {
		return id_oferta;
	}

	public void setId_oferta(int id_oferta) {
		this.id_oferta = id_oferta;
	}

	public String getNombre_oferta() {
		return nombre_oferta;
	}

	public void setNombre_oferta(String nombre_oferta) {
		this.nombre_oferta = nombre_oferta;
	}

	public String getDescripcion_oferta() {
		return descripcion_oferta;
	}

	public void setDescripcion_oferta(String descripcion_oferta) {
		this.descripcion_oferta = descripcion_oferta;
	}

	public int getPrecio_unidad() {
		return precio_unidad;
	}

	public void setPrecio_unidad(int precio_unidad) {
		this.precio_unidad = precio_unidad;
	}

}
