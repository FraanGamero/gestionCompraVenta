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
		opcionesVapes.add("sabor");
		opcionesVapes.add("caladas");
	}

	public DefaultTableModel getTablaVapes() {
		return tablaVapes;
	}

	public ArrayList<String> getOpcionesVapes() {
		return opcionesVapes;
	}
	
	
}
