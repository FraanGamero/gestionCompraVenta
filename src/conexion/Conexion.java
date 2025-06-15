package conexion;

public class Conexion {

	private ModeloConexion modeloConexion;
	
	public Conexion() {
		this.modeloConexion=new ModeloConexion();
	}
	
	public void listarCliente() {
		modeloConexion.getConn().crearRs(modeloConexion.getConn().getSt().get(0), "select * from clientes");
	}
}
