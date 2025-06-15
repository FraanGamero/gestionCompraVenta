package paneles;

import java.awt.BorderLayout;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import modelo.ListaProveedores;

public class VPanelTablaProveedores extends JPanel{

	private ArrayList<JTable> tablas;
	private ListaProveedores modeloProveedores;
	
	
	public VPanelTablaProveedores() {
		tablas= new ArrayList<JTable>();
		modeloProveedores= new ListaProveedores();
		
		crearTablaProveedores();
	}


	private void crearTablaProveedores() {
		// TODO Auto-generated method stub
		DefaultTableModel modeloTabla= modeloProveedores.crearTablaProveedores();
		JTable tablaProveedor= new JTable(modeloTabla);
		
		tablas.add(tablaProveedor);
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
