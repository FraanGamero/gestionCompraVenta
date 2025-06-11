package vista;

import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

import modelo.Modelo;
import modelo.ModeloMenu;

public class VPanelMenu extends JPanel{

	
	private ArrayList<JButton> botonesMenu;
	private ModeloMenu datosMenu;

//	private ModeloMenu datosMenu;
	
	public VPanelMenu(String textoBtn) {
//		this.datosMenu=datosMenu;
		botonesMenu= new ArrayList<JButton>();
		datosMenu= new ModeloMenu();
		
		propiedades();
		crearBotonesMenu(textoBtn);
	}

	private void propiedades() {
		// TODO Auto-generated method stub
		setLayout(new FlowLayout());
	}
	
	public void crearBotonesMenu(String texto) {
		
		
//		for (int i = 0; i < datosMenu.getOpcionesMenu().size(); i++) {
			botonesMenu.add(new JButton(texto));
			add(botonesMenu.get(botonesMenu.size()-1));
//		}
		

	}

	public ArrayList<JButton> getBotonesMenu() {
		return botonesMenu;
	}

	public void setBotonesMenu(ArrayList<JButton> botonesMenu) {
		this.botonesMenu = botonesMenu;
	}
	
	
	
	
}
