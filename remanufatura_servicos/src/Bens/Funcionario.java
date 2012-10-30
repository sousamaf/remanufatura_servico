package Bens;

import java.util.*;
public class Funcionario {
	int codigo;
	Fisica Cpf;
	Calendar  dada;
	
	
	public Funcionario() {
		
	}
	public Funcionario(int codigo, Fisica cpf, Calendar dada) {
		
		this.codigo = codigo;
		Cpf = cpf;
		this.dada = dada;
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
	 * @return the cpf
	 */
	public Fisica getCpf() {
		return Cpf;
	}
	/**
	 * @param cpf the cpf to set
	 */
	public void setCpf(Fisica cpf) {
		Cpf = cpf;
	}
	/**
	 * @return the dada
	 */
	public Calendar getDada() {
		return dada;
	}
	/**
	 * @param dada the dada to set
	 */
	public void setDada(Calendar dada) {
		this.dada = dada;
	}
	

}
