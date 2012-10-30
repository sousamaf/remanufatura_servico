package Bens;

public class Fornecedor {
	int codigo;
	Juridica juridica;
	public Fornecedor() {
		
	}
	public Fornecedor(int codigo, Juridica juridica) {
		super();
		this.codigo = codigo;
		this.juridica = juridica;
	}
	/**
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}
	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	/**
	 * @return the juridica
	 */
	public Juridica getJuridica() {
		return juridica;
	}
	/**
	 * @param juridica the juridica to set
	 */
	public void setJuridica(Juridica juridica) {
		this.juridica = juridica;
	}

}
