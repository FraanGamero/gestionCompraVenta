package vista;

import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.border.TitledBorder;

import paneles.VPanelForm;
import paneles.VPanelMenu;
import paneles.VPanelTablaClientes;
import paneles.VPanelTablaCompras;
import paneles.VPanelTablaMarcas;
import paneles.VPanelTablaOfertas;
import paneles.VPanelTablaProveedores;
import paneles.VPanelTablaVapes;
import paneles.VPanelTablaVentas;

public class Vista extends JFrame {

	private ArrayList<VPanelMenu> panelBotonesMenu;
	private ArrayList<VPanelForm> panelForm;

	public Vista() {
		panelBotonesMenu = new ArrayList<VPanelMenu>();
		panelForm = new ArrayList<VPanelForm>();

	}

	private void propiedadesVentanas() {
		// TODO Auto-generated method stub

		setSize(600, 600);
		setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	private void propiedadesOtrasVentanas() {
		setSize(600, 600);
		setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		setVisible(false);

	}

	public void crearPanelMenu(String texto) {
		VPanelMenu pMenu = new VPanelMenu(texto);
		panelBotonesMenu.add(pMenu);
		add(panelBotonesMenu.get(panelBotonesMenu.size() - 1));
		propiedadesVentanas();
//		setVisible(true);
	}

	public void crearPanelCliente(String textoLabels) {
		VPanelForm formCliente = new VPanelForm(textoLabels);
		panelForm.add(formCliente);
		add(panelForm.get(panelForm.size() - 1));
		propiedadesOtrasVentanas();
	}

	public void crearPanelCliente(String textoLabels, int tamano) {
		VPanelForm formCliente = new VPanelForm(textoLabels, tamano);
		panelForm.add(formCliente);
		add(panelForm.get(panelForm.size() - 1));
	}

	public void crearPanelTablaCompras() {
		VPanelTablaCompras panelTablaCompras = new VPanelTablaCompras();

		add(panelTablaCompras);
		revalidate();
		propiedadesOtrasVentanas();

	}

	public void crearPanelTablaCliente() {
		VPanelTablaClientes panelTabla = new VPanelTablaClientes();
		add(panelTabla);
		revalidate();
		propiedadesOtrasVentanas();
	}

	public void crearPanelTablaMarcas() {
		VPanelTablaMarcas panelTablaMarcas = new VPanelTablaMarcas();
		add(panelTablaMarcas);
		revalidate();
		propiedadesOtrasVentanas();
	}

	public void crearPanelTablaOferta() {
		VPanelTablaOfertas panelTablaOfertas = new VPanelTablaOfertas();
		add(panelTablaOfertas);
		revalidate();
		propiedadesOtrasVentanas();
	}

	public void crearPanelTablaProveedor() {
		VPanelTablaProveedores panelTablaProveedores = new VPanelTablaProveedores();
		add(panelTablaProveedores);
		revalidate();
		propiedadesOtrasVentanas();
	}

	public void crearPanelTablaVapes() {
		VPanelTablaVapes panelTablaVapes = new VPanelTablaVapes();
		add(panelTablaVapes);
		revalidate();
		propiedadesOtrasVentanas();
	}

	public void crearPaneTablaVentas() {
		VPanelTablaVentas panelTablaVentas = new VPanelTablaVentas();
		add(panelTablaVentas);
		revalidate();
		propiedadesOtrasVentanas();
	}

	public ArrayList<VPanelMenu> getPanelBotonesMenu() {
		return panelBotonesMenu;
	}

	public void setPanelBotonesMenu(ArrayList<VPanelMenu> panelBotonesMenu) {
		this.panelBotonesMenu = panelBotonesMenu;
	}

}