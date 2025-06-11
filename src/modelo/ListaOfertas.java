package modelo;

import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

public class ListaOfertas {

	private DefaultTableModel tablaOfertas;
	private String[] columnas= {
		"id_oferta",
		"nombre_oferta",
		"descripcion_oferta",
		"precio_oferta"
		
	};
	
	private ArrayList<String> opcionesOfertas;
	
	public ListaOfertas() {

		this.tablaOfertas= new DefaultTableModel(columnas,0);
		
		crearOpcionesOfertas();
	}

	private void crearOpcionesOfertas() {
		// TODO Auto-generated method stub
		opcionesOfertas= new ArrayList<String>();
		
		opcionesOfertas.add("nombre oferta");
		opcionesOfertas.add("descripcion oferta");
		opcionesOfertas.add("precio oferta");
	}

	public DefaultTableModel getTablaOfertas() {
		return tablaOfertas;
	}

	public ArrayList<String> getOpcionesOfertas() {
		return opcionesOfertas;
	}


}

