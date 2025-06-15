package modelo;

import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

public class ListaProveedores {

	private DefaultTableModel tablaProveedores;
	private String[] columnas= {
		"id_proveedor",
		"nombre_proveedor",
		"tlf_provedor"
	};
	private ArrayList<String> opcionesProveedor;
	
	public ListaProveedores() {
		this.tablaProveedores=new DefaultTableModel(columnas,0);
		
		crearOpcionesProveedor();
	}

	private void crearOpcionesProveedor() {
		// TODO Auto-generated method stub
		opcionesProveedor= new ArrayList<String>();
		
		opcionesProveedor.add("nombre proveedor");
		opcionesProveedor.add("tlf proveedor");
	}
	
	
	
	public String[] getColumnas() {
		return columnas;
	}

	public DefaultTableModel crearTablaProveedores() {
		return tablaProveedores= new DefaultTableModel(columnas,0);
	}

	public DefaultTableModel getTablaProveedores() {
		return tablaProveedores;
	}

	public ArrayList<String> getOpcionesProveedor() {
		return opcionesProveedor;
	}
	
	
	
}
