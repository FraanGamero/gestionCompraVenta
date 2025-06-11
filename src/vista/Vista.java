package vista;

import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.border.TitledBorder;

public class Vista extends JFrame {

	private ArrayList<VPanelMenu> panelBotonesMenu;
	
	public Vista() {
		panelBotonesMenu = new ArrayList<VPanelMenu>();

    
		propiedadesVentanas();
	}

	private void propiedadesVentanas() {
		// TODO Auto-generated method stub
		
		setSize(600,600);
		setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void crearPanelMenu(String texto) {


		VPanelMenu pMenu= new VPanelMenu(texto);
		panelBotonesMenu.add(pMenu);
		add(panelBotonesMenu.get(panelBotonesMenu.size()-1));
	}
	
	public void crearPanelTablaCompras() {
		VPanelTablas panelTablaCompras= new VPanelTablas();
		add(panelTablaCompras);
		revalidate();
		
	}
	
	public void crearPanelTablaCliente() {
		VPanelTablas panelTabla= new VPanelTablas();
		add(panelTabla);
		revalidate();
	}


	public ArrayList<VPanelMenu> getPanelBotonesMenu() {
		return panelBotonesMenu;
	}

	public void setPanelBotonesMenu(ArrayList<VPanelMenu> panelBotonesMenu) {
		this.panelBotonesMenu = panelBotonesMenu;
	}
	
	
	
	
}
