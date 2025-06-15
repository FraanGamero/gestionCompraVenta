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
	
	

	public String[] getColumnas() {
		return columnas;
	}

	public DefaultTableModel getTablaMarcas() {
		return new DefaultTableModel(columnas,0);
	}

	public ArrayList<String> getOpcionesMarcas() {
		return opcionesMarcas;
	}

	public void setTablaMarcas(DefaultTableModel tablaMarcas) {
		this.tablaMarcas = tablaMarcas;
	}

	public void setColumnas(String[] columnas) {
		this.columnas = columnas;
	}

	public void setOpcionesMarcas(ArrayList<String> opcionesMarcas) {
		this.opcionesMarcas = opcionesMarcas;
	}
	
	
	
}
