package modelo;

import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

public class ListaCompras {

	private DefaultTableModel tablaCompras;
	private String[] columnas= {
		"id proveedor",
		"id vape",
		"Unidades_totales_compradas",
		"fecha de compra",
		"coste envio",
		"coste comision "
	};
	private ArrayList<String> opcionesCompra;
	
	public ListaCompras() {
		this.tablaCompras= new DefaultTableModel(columnas,0);
		
		crearOpciones();
	}
	
	public  DefaultTableModel crearTablaCompras() {
		 return new DefaultTableModel(columnas,0);
	}

	private void crearOpciones() {
		// TODO Auto-generated method stub
		opcionesCompra= new ArrayList<String>();
		
		opcionesCompra.add("proveedor");
		opcionesCompra.add("vape");
		opcionesCompra.add("unidades");
		opcionesCompra.add("fecha");
		opcionesCompra.add("coste envio");
		opcionesCompra.add("coste comision");
//		opcionesCompra.add("");
	}

	public ArrayList<String> getOpcionesCompra() {
		return opcionesCompra;
	}

	public DefaultTableModel getTablaCompras() {
		return tablaCompras;
	}
	
	
}
