package Bens;

public class Cidade {
	int codigo;	
	String nome;
	Uf uf;
	
	public Cidade() {
		
	}
	
	public Cidade(int codigo, String nome, Uf uf) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.uf = uf;
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
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * @return the uf
	 */
	public Uf getUf() {
		return uf;
	}
	/**
	 * @param uf the uf to set
	 */
	public void setUf(Uf uf) {
		this.uf = uf;
	}

}
