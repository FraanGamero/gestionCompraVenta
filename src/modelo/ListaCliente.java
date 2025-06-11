package modelo;

import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class ListaCliente {

	
//	private DefaultTableModel tablaCliente;
	private String[] columnas= {
			"Id cliente",
			"nombre",
			"primer apellido",
			"segundo apellido"
	};
	
	private ArrayList<String> opcionesClientes;
	
	
	public ListaCliente() {
//		this.tablaCliente= new DefaultTableModel(columnas,0);
		
		crearTextosLabel();
//		crearTablaCliente();
	}

//	private void crearTablaCliente() {
//		// TODO Auto-generated method stub
//		try {
//			
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//	}

	private void crearTextosLabel(){
		// TODO Auto-generated method stub
		opcionesClientes= new ArrayList<String>();
		
		opcionesClientes.add("Nombre: ");
		opcionesClientes.add("primer apellido: ");
		opcionesClientes.add("segundo apellido: ");
	}

//	public DefaultTableModel getTablaCliente() {
//		return tablaCliente;
//	}


//	public TableModel getColumnas() {
//		return columnas;
//	}

	public DefaultTableModel getModeloTablaCliente() {
		return new DefaultTableModel(columnas,0);
	}
	
	public void setColumnas(String[] columnas) {
		this.columnas = columnas;
	}

	public void setOpcionesClientes(ArrayList<String> opcionesClientes) {
		this.opcionesClientes = opcionesClientes;
	}
	
	
	
}
