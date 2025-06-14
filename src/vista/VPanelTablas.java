package vista;

import java.awt.BorderLayout;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import modelo.ListaCliente;
import modelo.ListaCompras;

public class VPanelTablas extends JPanel {

	private ArrayList<JTable> tablas;
	private ListaCliente modeloListaCliente;
	private ListaCompras modeloListaCompras;

	public VPanelTablas() {
//		this.modeloListaCliente = modeloListaCliente;
		tablas= new ArrayList<JTable>();
		modeloListaCliente= new ListaCliente();
		modeloListaCompras= new ListaCompras();
		crearTablaCompras();
		crearTablaClientes();
	}

	private void crearTablaCompras() {
		// TODO Auto-generated method stub
		DefaultTableModel modeloCompras= new DefaultTableModel();
		JTable tablaCompras= new JTable(modeloListaCompras.crearTablaCompras());
		
		tablas.add(tablaCompras);
		add(tablas.get(tablas.size()-1));
		this.propiedades();
	}

	private void crearTablaClientes() {
		// TODO Auto-generated method stub
//		modeloListaCliente2 = new ListaCliente();

		DefaultTableModel modeloTabla = modeloListaCliente.getModeloTablaCliente();
		JTable tablaCliente = new JTable(modeloTabla);

		tablas.add(tablaCliente);
		add(tablas.get(tablas.size() - 1));
		this.propiedades();

	}

	private void propiedades() {
		// TODO Auto-generated method stub
		setLayout(new BorderLayout());
		JScrollPane scrollPane = new JScrollPane(tablas.get(tablas.size() - 1));
		add(scrollPane);
//		setVisible(false);
//		repaint();
		
	}
}
