package conexion;

import java.util.ArrayList;

import entidades.EntidadCliente;

public class ModeloConexion {

	ConexionDB conn;
	private ArrayList<EntidadCliente> entidadCliente;
	
	public ModeloConexion() {
		this.conn = new ConexionDB("jdbc:mysql://localhost/gestionclientesvapes?serverTimezone=UTC", "root", "");
		entidadCliente= new ArrayList<EntidadCliente>();
	}

	public void agregarCliente(int id,String nombre,String apellido1,String apellido2) {
		entidadCliente.add(new EntidadCliente(id++, nombre, apellido1, apellido1));
	}
	
	public ConexionDB getConn() {
		return conn;
	}

	public void setConn(ConexionDB conn) {
		this.conn = conn;
	}

	public ArrayList<EntidadCliente> getEntidadCliente() {
		return entidadCliente;
	}

	public void setEntidadCliente(ArrayList<EntidadCliente> entidadCliente) {
		this.entidadCliente = entidadCliente;
	}
	
	
	
	
}
