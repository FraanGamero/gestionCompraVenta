package modelo;

//import java.lang.reflect.Array;
import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

public class ListaVapes {

	
	private DefaultTableModel tablaVapes;
	
	private String[] columnas= {
		"id_vape",
		"id_marca",
		"sabor",
		"marca",
		"caladas"
	};
	
	private ArrayList<String> opcionesVapes;
	
	public ListaVapes() {
		this.tablaVapes= new DefaultTableModel(columnas,0);
		
		crearOpcionesVapes();
	}

	private void crearOpcionesVapes() {
		// TODO Auto-generated method stub
		opcionesVapes= new ArrayList<String>();
		opcionesVapes.add("Sabor");
		opcionesVapes.add("Marca");
		opcionesVapes.add("Caladas");
	}

	public DefaultTableModel getTablaVapes() {
		return new DefaultTableModel(columnas,0);
	}

	public ArrayList<String> getOpcionesVapes() {
		return opcionesVapes;
	}
	
	
}
