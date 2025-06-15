package conexion;

import java.awt.Taskbar.State;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class ConexionDB {

	Connection conn;
	ArrayList<ResultSet> rs;
	ArrayList<Statement> st;

	public ConexionDB(String host, String user, String pass) {
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			conn = DriverManager.getConnection(host, user, pass);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		crearSt();
	}

	public void crearRs(Statement st, String sql) {
		// TODO Auto-generated method stub
		try {
			rs.add(st.executeQuery(sql));
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public void crearSt() {
		// TODO Auto-generated method stub
		try {
			st.add(conn.createStatement());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public Connection getConn() {
		return conn;
	}

	public void setConn(Connection conn) {
		this.conn = conn;
	}

	public ArrayList<ResultSet> getRs() {
		return rs;
	}

	public void setRs(ArrayList<ResultSet> rs) {
		this.rs = rs;
	}

	public ArrayList<Statement> getSt() {
		return st;
	}

	public void setSt(ArrayList<Statement> st) {
		this.st = st;
	}
	
	
}
