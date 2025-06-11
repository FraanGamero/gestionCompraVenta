package controlador;

import java.util.ArrayList;
import java.util.Iterator;

import modelo.ModeloMenu;
import vista.VPanelMenu;
import vista.Vista;

public class Controlador {

	private ArrayList<Vista> ventanas;

	private ModeloMenu datosMenu;
//	private 
	
	
	public Controlador() {
		ventanas= new ArrayList<>();
		datosMenu=new ModeloMenu();
				
		crearVentanaMenu();
		crearVentanaTablaClientes();
		crearVentanaTablaCompras();
	}

	private void crearVentanaTablaCompras() {
		// TODO Auto-generated method stub
		Vista v = new Vista();
		v.crearPanelTablaCompras();
		ventanas.add(v);
	}

	private void crearVentanaTablaClientes() {
		// TODO Auto-generated method stub
		Vista v = new Vista();
		v.crearPanelTablaCliente();
		ventanas.add(v);
	}

	private void crearVentanaMenu() {
		// TODO Auto-generated method stub

		ventanas.add(new Vista());
		
		for (int i = 0; i < datosMenu.getOpcionesMenu().size(); i++) {
			ventanas.get(ventanas.size()-1).crearPanelMenu(datosMenu.getOpcionesMenu().get(i));
		}
	}
}
