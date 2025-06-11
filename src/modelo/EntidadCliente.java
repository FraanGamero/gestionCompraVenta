package modelo;

public class EntidadCliente {

	private int id_cliente;
	private String nombre_cliente;
	private String primer_apellido;
	private String segundo_apellido;

	public EntidadCliente(int id_cliente, String nombre_cliente, String primer_apellido, String segundo_apellido) {
		super();
		this.id_cliente = id_cliente;
		this.nombre_cliente = nombre_cliente;
		this.primer_apellido = primer_apellido;
		this.segundo_apellido = segundo_apellido;
	}

//	getters y setters

	public int getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}

	public String getNombre_cliente() {
		return nombre_cliente;
	}

	public void setNombre_cliente(String nombre_cliente) {
		this.nombre_cliente = nombre_cliente;
	}

	public String getPrimer_apellido() {
		return primer_apellido;
	}

	public void setPrimer_apellido(String primer_apellido) {
		this.primer_apellido = primer_apellido;
	}

	public String getSegundo_apellido() {
		return segundo_apellido;
	}

	public void setSegundo_apellido(String segundo_apellido) {
		this.segundo_apellido = segundo_apellido;
	}

}
