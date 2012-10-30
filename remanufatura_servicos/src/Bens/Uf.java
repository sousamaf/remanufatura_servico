package Bens;

public class Uf {
	private String estado;
	private String uf;
	public Uf() {
	
	}
	public Uf(String estado, String uf) {
		
		this.estado = estado;
		this.uf = uf;
	}
	/**
	 * @return the estado
	 */
	public String getEstado() {
		return estado;
	}
	/**
	 * @param estado the estado to set
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}
	/**
	 * @return the uf
	 */
	public String getUf() {
		return uf;
	}
	/**
	 * @param uf the uf to set
	 */
	public void setUf(String uf) {
		this.uf = uf;
	}
}