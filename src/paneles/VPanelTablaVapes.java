package paneles;

import java.awt.BorderLayout;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import modelo.ListaVapes;

public class VPanelTablaVapes extends JPanel{

	
	private ArrayList<JTable> tablas;
	private ListaVapes modeloVapes;
	
	public VPanelTablaVapes() {
		
		tablas= new ArrayList<JTable>();
		modeloVapes= new ListaVapes();
		
		crearTablaVapes();		
	}

	private void crearTablaVapes() {
		// TODO Auto-generated method stub
		DefaultTableModel modeloTabla= modeloVapes.getTablaVapes();
		JTable tablaVapes= new JTable(modeloTabla);
		
		tablas.add(tablaVapes);
		add(tablas.get(tablas.size()-1));
		propiedades();
	}

	private void propiedades() {
		// TODO Auto-generated method stub
		setLayout(new BorderLayout());
//		setVisible(false);
		JScrollPane scrollPane= new JScrollPane(tablas.get(tablas.size()-1));
		add(scrollPane);
	}
}
