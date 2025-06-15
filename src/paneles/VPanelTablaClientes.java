package paneles;

import java.awt.BorderLayout;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import modelo.ListaCliente;

public class VPanelTablaClientes extends JPanel {

	private ArrayList<JTable> tablas;
	private ListaCliente modeloListaCliente;

	public VPanelTablaClientes() {
		tablas = new ArrayList<JTable>();
		modeloListaCliente = new ListaCliente();
		crearTablaClientes();
	}

	private void crearTablaClientes() {
		// TODO Auto-generated method stub
//	modeloListaCliente2 = new ListaCliente();

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
//	setVisible(false);
//	repaint();

	}
}
