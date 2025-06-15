package paneles;

import java.awt.BorderLayout;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import modelo.ListaOfertas;

public class VPanelTablaOfertas extends JPanel {

	private ArrayList<JTable> tablas;
	private ListaOfertas modeloOfertas;

	public VPanelTablaOfertas() {

		tablas= new ArrayList<JTable>();
		modeloOfertas= new ListaOfertas();
		
		crearTablaOferta();
	}

	private void crearTablaOferta() {
		// TODO Auto-generated method stub
		DefaultTableModel modeloTabla= modeloOfertas.getTablaOfertas();
		JTable tablaOfertas= new JTable(modeloTabla);
		
		tablas.add(tablaOfertas);
		add(tablas.get(tablas.size()-1));
		propiedades();
	}
	
	private void propiedades() {
		setLayout(new BorderLayout());
		JScrollPane scrollPane= new JScrollPane(tablas.get(tablas.size()-1));
		add(scrollPane);
	}
}
