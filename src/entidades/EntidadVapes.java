package entidades;

public class EntidadVapes {

	private int id_vape;
	private int id_marca;
	private String sabor;
	private String caladas;

	public EntidadVapes(int id_vape, int id_marca, String sabor, String caladas) {
		super();
		this.id_vape = id_vape;
		this.id_marca = id_marca;
		this.sabor = sabor;
		this.caladas = caladas;
	}

	public int getId_vape() {
		return id_vape;
	}

	public void setId_vape(int id_vape) {
		this.id_vape = id_vape;
	}

	public int getId_marca() {
		return id_marca;
	}

	public void setId_marca(int id_marca) {
		this.id_marca = id_marca;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public String getCaladas() {
		return caladas;
	}

	public void setCaladas(String caladas) {
		this.caladas = caladas;
	}

}
