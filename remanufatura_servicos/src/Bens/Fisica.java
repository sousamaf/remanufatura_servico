package Bens;

public class Fisica {
	int cpf;
	boolean sexo;
	Pessoa pessoa;
	
	public Fisica() {
	
	}
	
	public Fisica(int cpf, boolean sexo, Pessoa pessoa) {
		
		this.cpf = cpf;
		this.sexo = sexo;
		this.pessoa = pessoa;
	}

	/**
	 * @return the cpf
	 */
	public int getCpf() {
		return cpf;
	}
	/**
	 * @param cpf the cpf to set
	 */
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	/**
	 * @return the sexo
	 */
	public boolean isSexo() {
		return sexo;
	}
	/**
	 * @param sexo the sexo to set
	 */
	public void setSexo(boolean sexo) {
		this.sexo = sexo;
	}
	/**
	 * @return the pessoa
	 */
	public Pessoa getPessoa() {
		return pessoa;
	}
	/**
	 * @param pessoa the pessoa to set
	 */
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	

}
