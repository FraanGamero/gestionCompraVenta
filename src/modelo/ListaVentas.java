package modelo;

import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

public class ListaVentas {

	private DefaultTableModel tablaVentas;
	private String[] columnas= {
			"id_vape",
			"id_cliente",
			"id_oferta",
			"fecha_venta",
			"precio_venta",
			"cantidad_vendida"
	};
	private ArrayList<String> opcionesVentas;
	
	public ListaVentas() {
		this.tablaVentas= new DefaultTableModel(columnas,0);
		
		crearOpcionesVenta();
	}

	private void crearOpcionesVenta() {
		// TODO Auto-generated method stub
		opcionesVentas= new ArrayList<String>();
		
		opcionesVentas.add("vape");
		opcionesVentas.add("cliente");
		opcionesVentas.add("oferta");
		opcionesVentas.add("Fecha");
		opcionesVentas.add("precio");
		opcionesVentas.add("cantidad");
	}

	public DefaultTableModel getTablaVentas() {
		return tablaVentas;
	}

	public ArrayList<String> getOpcionesVentas() {
		return opcionesVentas;
	}
	
	
}
