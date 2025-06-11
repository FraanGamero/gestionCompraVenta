	package modelo;
	
	import java.util.ArrayList;
	
	public class ModeloMenu {
	
		
		private ArrayList<String> opcionesMenu;
		
		public ModeloMenu() {
			crearOpcionesMenu();
		}
	
		private void crearOpcionesMenu() {
			// TODO Auto-generated method stub
			opcionesMenu= new ArrayList<String>();
			
			opcionesMenu.add("1 - Ingresar Cliente nuevo y mostrar tabla");
			opcionesMenu.add("2 - Ingresar Oferta nueva y mostrar tabla");
			opcionesMenu.add("3 - Ingresar Vape nuevo y mostrar tabla");
			opcionesMenu.add("4 - Ingresar Proveedor nuevo y mostrar tabla");
			opcionesMenu.add("5 - Ingresar Marca nuevo y mostrar tabla");
			opcionesMenu.add("6 - Ingresar Compra nuevo y mostrar tabla");
			opcionesMenu.add("7 - Ingresar Venta nuevo y mostrar tabla");
		}
	
		public ArrayList<String> getOpcionesMenu() {
			return opcionesMenu;
		}
	
		public void setOpcionesMenu(ArrayList<String> opcionesMenu) {
			this.opcionesMenu = opcionesMenu;
		}
		
		
	}
