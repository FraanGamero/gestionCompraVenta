package entidades;

import java.util.Date;

//import java.java.Date;
//import java.sql.Date;

public class EntidadVentas {

	private int id_vape;
	private int id_cliente;
	private int id_oferta;
	private Date fecha;
	private int precio_venta;
	private int cantidad_venta;

	public EntidadVentas(int id_vape, int id_cliente, int id_oferta, Date fecha, int precio_venta, int cantidad_venta) {
		super();
		this.id_vape = id_vape;
		this.id_cliente = id_cliente;
		this.id_oferta = id_oferta;
		this.fecha = fecha;
		this.precio_venta = precio_venta;
		this.cantidad_venta = cantidad_venta;
	}

	public int getId_vape() {
		return id_vape;
	}

	public void setId_vape(int id_vape) {
		this.id_vape = id_vape;
	}

	public int getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}

	public int getId_oferta() {
		return id_oferta;
	}

	public void setId_oferta(int id_oferta) {
		this.id_oferta = id_oferta;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public int getPrecio_venta() {
		return precio_venta;
	}

	public void setPrecio_venta(int precio_venta) {
		this.precio_venta = precio_venta;
	}

	public int getCantidad_venta() {
		return cantidad_venta;
	}

	public void setCantidad_venta(int cantidad_venta) {
		this.cantidad_venta = cantidad_venta;
	}

}
