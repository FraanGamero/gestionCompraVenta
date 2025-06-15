package paneles;

import java.awt.BorderLayout;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import modelo.ListaVentas;

public class VPanelTablaVentas extends JPanel{

	private ArrayList<JTable> tablas;
	private ListaVentas modeloVentas;
	
	public VPanelTablaVentas() {
		tablas= new ArrayList<JTable>();
		modeloVentas= new ListaVentas();
		
		crearTablaVentas();
	}

	private void crearTablaVentas() {
		// TODO Auto-generated method stub
		DefaultTableModel modeloTabla= modeloVentas.getTablaVentas();
		JTable tablaVentas= new JTable(modeloTabla);
		
		tablas.add(tablaVentas);
		add(tablas.get(tablas.size()-1));
		propiedades();
	}

	private void propiedades() {
		// TODO Auto-generated method stub
		setLayout(new BorderLayout());
		JScrollPane scrollPane= new JScrollPane(tablas.get(tablas.size()-1));
		add(scrollPane);
		
	}
	
}
