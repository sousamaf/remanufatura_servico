package Bens;

public class Situacao {
	int codigo;
	String tipo;
	/**
	 * @return the codigo
	 */
	
	public int getCodigo() {
		return codigo;
	}
	
	
	public Situacao() {
		
	}
	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	
	public Situacao(int codigo, String tipo) {
		super();
		this.codigo = codigo;
		this.tipo = tipo;
	}
	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}
	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	

}
