package controlador;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

import modelo.ListaCliente;
import modelo.ListaCompras;
import modelo.ListaMarcas;
import modelo.ListaOfertas;
import modelo.ListaProveedores;
import modelo.ListaVapes;
import modelo.ListaVentas;
import modelo.ModeloMenu;
import paneles.VPanelMenu;
import vista.Vista;

public class Controlador {

	private ArrayList<Vista> ventanas;
//	private ArrayList<Vista> ventanaTablaCliente;
//	private ArrayList<Vista> ventanaTablaCompras;
//	private ArrayList<Vista> ventanaTablaC;
	private Vista ventanaTablaCliente;
	private Vista ventanaTablaCompras;
	private Vista ventanaTablaMarcas;
	private Vista ventanaTablaOfertas;
	private Vista ventanaTablaProveedor;
	private Vista ventanaTablaVapes;
	private Vista ventanaTablaVentas;

	private ModeloMenu datosMenu;
	private ListaCliente datosClientes;
	private ListaCompras datosCompras;
	private ListaMarcas datosMarcas;
	private ListaOfertas datosOfertas;
	private ListaProveedores datosProveedores;
	private ListaVapes datosVapes;
	private ListaVentas datosVentas;
//	private 

	public Controlador() {
		ventanas = new ArrayList<>();
		ventanaTablaCliente = new Vista();
		ventanaTablaCompras = new Vista();
		ventanaTablaMarcas = new Vista();
		ventanaTablaOfertas = new Vista();
		ventanaTablaProveedor = new Vista();
		ventanaTablaVapes = new Vista();
		ventanaTablaVentas = new Vista();

		datosMenu = new ModeloMenu();
		datosClientes = new ListaCliente();
		datosCompras = new ListaCompras();
		datosMarcas = new ListaMarcas();
		datosOfertas = new ListaOfertas();
		datosProveedores = new ListaProveedores();
		datosVapes = new ListaVapes();
		datosVentas= new ListaVentas();

		crearVentanaMenu();

		crearVentanaClientes();
		crearTablaCliente();

		crearVentanaCompras();
		crearTablaCompras();

		crearTablaMarcas();
		crearVentanaMarcas();

		crearTablaOfertas();
		crearVentanaOfertas();

		crearTablaProveedor();
		crearVentanaProveedor();

		crearTablaVapes();
		crearVentanaVapes();

		crearTablaVentas();
		crearVentanaVentas();

	}



	private void crearTablaVentas() {
		// TODO Auto-generated method stub
		ventanaTablaVentas.crearPaneTablaVentas();
	}

	private void crearTablaVapes() {
		// TODO Auto-generated method stub
		ventanaTablaVapes.crearPanelTablaVapes();
	}

	private void crearTablaProveedor() {
		// TODO Auto-generated method stub
		ventanaTablaProveedor.crearPanelTablaProveedor();
	}

	private void crearTablaOfertas() {
		// TODO Auto-generated method stub
		ventanaTablaOfertas.crearPanelTablaOferta();
	}

	private void crearTablaMarcas() {
		// TODO Auto-generated method stub
		ventanaTablaMarcas.crearPanelTablaMarcas();
	}

	private void crearTablaCompras() {
		// TODO Auto-generated method stub
		ventanaTablaCompras.crearPanelTablaCompras();

	}

	private void crearTablaCliente() {
		ventanaTablaCliente.crearPanelTablaCliente();
	}

	private void crearVentanaMenu() {
		// TODO Auto-generated method stub

		ventanas.add(new Vista());

		for (int i = 0; i < datosMenu.getOpcionesMenu().size() - 1; i++) {
			ventanas.get(ventanas.size() - 1).crearPanelMenu(datosMenu.getOpcionesMenu().get(i));
		}
	}

	private void crearVentanaClientes() {
		// TODO Auto-generated method stub
		ventanas.add(new Vista());
		for (int i = 0; i < datosClientes.getOpcionesClientes().size(); i++) {
//			ventanas.get(ventanas.size() - 1).crearPanelCliente(datosClientes.getOpcionesClientes().get(i));
			ventanas.get(ventanas.size() - 1).crearPanelCliente(datosClientes.getOpcionesClientes().get(i));
		}
		ventanas.get(ventanas.size() - 1).crearPanelCliente(datosMenu.getOpcionesMenu().get(7), 0);

	}

	private void crearVentanaCompras() {
		// TODO Auto-generated method stub
		ventanas.add(new Vista());
		for (int i = 0; i < datosCompras.getOpcionesCompra().size(); i++) {
			ventanas.get(ventanas.size() - 1).crearPanelCliente(datosCompras.getOpcionesCompra().get(i));
		}
		ventanas.get(ventanas.size() - 1).crearPanelCliente(datosMenu.getOpcionesMenu().get(7), 0);

	}

	private void crearVentanaMarcas() {
		// TODO Auto-generated method stub
		ventanas.add(new Vista());
		for (int i = 0; i < datosMarcas.getOpcionesMarcas().size(); i++) {
			ventanas.get(ventanas.size() - 1).crearPanelCliente(datosMarcas.getOpcionesMarcas().get(i));
		}
		ventanas.get(ventanas.size() - 1).crearPanelCliente(datosMenu.getOpcionesMenu().get(7), 0);

	}

	private void crearVentanaOfertas() {
		// TODO Auto-generated method stub
		ventanas.add(new Vista());
		for (int i = 0; i < datosOfertas.getOpcionesOfertas().size(); i++) {
			ventanas.get(ventanas.size() - 1).crearPanelCliente(datosOfertas.getOpcionesOfertas().get(i));
		}
		ventanas.get(ventanas.size() - 1).crearPanelCliente(datosMenu.getOpcionesMenu().get(7), 0);

	}

	private void crearVentanaProveedor() {
		// TODO Auto-generated method stub
		ventanas.add(new Vista());
		for (int i = 0; i < datosProveedores.getOpcionesProveedor().size(); i++) {
			ventanas.get(ventanas.size() - 1).crearPanelCliente(datosProveedores.getOpcionesProveedor().get(i));
		}
		ventanas.get(ventanas.size() - 1).crearPanelCliente(datosMenu.getOpcionesMenu().get(7), 0);

	}

	private void crearVentanaVapes() {
		// TODO Auto-generated method stub
		ventanas.add(new Vista());
		for (int i = 0; i < datosVapes.getOpcionesVapes().size(); i++) {
			ventanas.get(ventanas.size() - 1).crearPanelCliente(datosVapes.getOpcionesVapes().get(i));
		}
		ventanas.get(ventanas.size() - 1).crearPanelCliente(datosMenu.getOpcionesMenu().get(7), 0);

	}
	private void crearVentanaVentas() {
		// TODO Auto-generated method stub
		ventanas.add(new Vista());
		for (int i = 0; i < datosVentas.getOpcionesVentas().size(); i++) {
			ventanas.get(ventanas.size() - 1).crearPanelCliente(datosVentas.getOpcionesVentas().get(i));
		}
		ventanas.get(ventanas.size() - 1).crearPanelCliente(datosMenu.getOpcionesMenu().get(7), 0);
		
	}
}