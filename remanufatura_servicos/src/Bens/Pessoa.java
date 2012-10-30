package Bens;

public class Pessoa {
	int codigo;
	String nome;
	String email;
	int telefone;
	int   data_cadastro;
	Endereco endereco;
	/**
	 * @return the codigo
	 */
	public Pessoa() {
		
	}
	public int getCodigo() {
		return codigo;
	}
	
	public Pessoa(int codigo, String nome, String email, int telefone,
			int data_cadastro, Endereco endereco) {
		
		this.codigo = codigo;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.data_cadastro = data_cadastro;
		this.endereco = endereco;
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
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the telefone
	 */
	public int getTelefone() {
		return telefone;
	}
	/**
	 * @param telefone the telefone to set
	 */
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	/**
	 * @return the data_cadastro
	 */
	public int getData_cadastro() {
		return data_cadastro;
	}
	/**
	 * @param data_cadastro the data_cadastro to set
	 */
	public void setData_cadastro(int data_cadastro) {
		this.data_cadastro = data_cadastro;
	}
	/**
	 * @return the endereco
	 */
	public Endereco getEndereco() {
		return endereco;
	}
	/**
	 * @param endereco the endereco to set
	 */
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}
