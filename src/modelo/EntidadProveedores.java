package modelo;

public class EntidadProveedores {

	private int id_proveedor;
	private String nombre_proveedor;
	private String tlf_proveedor;
	
	public EntidadProveedores(int id_proveedor, String nombre_proveedor, String tlf_proveedor) {
		super();
		this.id_proveedor = id_proveedor;
		this.nombre_proveedor = nombre_proveedor;
		this.tlf_proveedor = tlf_proveedor;
	}
	public int getId_proveedor() {
		return id_proveedor;
	}
	public void setId_proveedor(int id_proveedor) {
		this.id_proveedor = id_proveedor;
	}
	public String getNombre_proveedor() {
		return nombre_proveedor;
	}
	public void setNombre_proveedor(String nombre_proveedor) {
		this.nombre_proveedor = nombre_proveedor;
	}
	public String getTlf_proveedor() {
		return tlf_proveedor;
	}
	public void setTlf_proveedor(String tlf_proveedor) {
		this.tlf_proveedor = tlf_proveedor;
	}
	
	
	
}
