package modelo;

import java.util.ArrayList;
//import java.util.List;

import javax.swing.table.DefaultTableModel;

public class ListaMarcas {

	
	private DefaultTableModel tablaMarcas;
	private String[] columnas= {
			"id_marca",
			"nombre"
	};
	
	private ArrayList<String> opcionesMarcas;
	
	public ListaMarcas(){
		this.tablaMarcas= new DefaultTableModel(columnas,0);
		
		crearOpciones();
	}

	private void crearOpciones() {
		// TODO Auto-generated method stub
		opcionesMarcas= new ArrayList<String>();
		
		opcionesMarcas.add("Nombre marca");
	}

	public DefaultTableModel getTablaMarcas() {
		return tablaMarcas;
	}

	public ArrayList<String> getOpcionesMarcas() {
		return opcionesMarcas;
	}
	
	
}
