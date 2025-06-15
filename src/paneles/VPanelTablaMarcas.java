package paneles;

import java.awt.BorderLayout;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import modelo.ListaMarcas;

public class VPanelTablaMarcas extends JPanel{

	private ArrayList<JTable> tablas;
	private ListaMarcas modeloMarcas;
	
	public VPanelTablaMarcas(){
		tablas= new ArrayList<JTable>();
		modeloMarcas= new ListaMarcas();
		crearTablasMarcas();
	}

	private void crearTablasMarcas() {
		// TODO Auto-generated method stub
		DefaultTableModel modeloTabla= modeloMarcas.getTablaMarcas();
		JTable tablaMarca= new JTable(modeloTabla);
		
		tablas.add(tablaMarca);
		add(tablas.get(tablas.size()-1));
		propiedades();
	}
	
	private void propiedades() {
		// TODO Auto-generated method stub
		setLayout(new BorderLayout());
		JScrollPane scrollPane = new JScrollPane(tablas.get(tablas.size() - 1));
		add(scrollPane);

		
	}
}
