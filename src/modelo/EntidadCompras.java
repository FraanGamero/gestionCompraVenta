
package modelo;

import java.util.Date;

public class EntidadCompras {

	private int id_proveedor;
	private int id_vape;
	private int cantidad_unidades_compradas;
	private Date fecha_compra;
	private int precio_unidad;
	private int coste_envio;
	private int coste_comision;

	public EntidadCompras(int id_proveedor, int id_vape, int cantidad_unidades_compradas, Date fecha_compra,
			int precio_unidad, int coste_envio, int coste_comision) {
		super();
		this.id_proveedor = id_proveedor;
		this.id_vape = id_vape;
		this.cantidad_unidades_compradas = cantidad_unidades_compradas;
		this.fecha_compra = fecha_compra;
		this.precio_unidad = precio_unidad;
		this.coste_envio = coste_envio;
		this.coste_comision = coste_comision;
	}

	public int getId_proveedor() {
		return id_proveedor;
	}

	public void setId_proveedor(int id_proveedor) {
		this.id_proveedor = id_proveedor;
	}

	public int getId_vape() {
		return id_vape;
	}

	public void setId_vape(int id_vape) {
		this.id_vape = id_vape;
	}

	public int getCantidad_unidades_compradas() {
		return cantidad_unidades_compradas;
	}

	public void setCantidad_unidades_compradas(int cantidad_unidades_compradas) {
		this.cantidad_unidades_compradas = cantidad_unidades_compradas;
	}

	public Date getFecha_compra() {
		return fecha_compra;
	}

	public void setFecha_compra(Date fecha_compra) {
		this.fecha_compra = fecha_compra;
	}

	public int getPrecio_unidad() {
		return precio_unidad;
	}

	public void setPrecio_unidad(int precio_unidad) {
		this.precio_unidad = precio_unidad;
	}

	public int getCoste_envio() {
		return coste_envio;
	}

	public void setCoste_envio(int coste_envio) {
		this.coste_envio = coste_envio;
	}

	public int getCoste_comision() {
		return coste_comision;
	}

	public void setCoste_comision(int coste_comision) {
		this.coste_comision = coste_comision;
	}

}
