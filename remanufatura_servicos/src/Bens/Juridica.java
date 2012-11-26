package Bens;
import java.util.*;
public class Juridica {
	int Cnpj;
	int IE;
	String nome_fantasia;
	String R_social;
	Pessoa pessoa;
	Calendar Date;
	
	
	public Juridica(int cnpj, int iE, String nome_fantasia, String r_social,
			Pessoa pessoa, Calendar date) {
		super();
		Cnpj = cnpj;
		IE = iE;
		this.nome_fantasia = nome_fantasia;
		R_social = r_social;
		this.pessoa = pessoa;
		Date = date;
	}
	public Juridica() {
		
	}
	/**
	 * @return the cnpj
	 */
	public int getCnpj() {
		return Cnpj;
	}
	/**
	 * @param cnpj the cnpj to set
	 */
	public void setCnpj(int cnpj) {
		Cnpj = cnpj;
	}
	/**
	 * @return the iE
	 */
	public int getIE() {
		return IE;
	}
	/**
	 * @param iE the iE to set
	 */
	public void setIE(int iE) {
		IE = iE;
	}
	/**
	 * @return the nome_fantasia
	 */
	public String getNome_fantasia() {
		return nome_fantasia;
	}
	/**
	 * @param nome_fantasia the nome_fantasia to set
	 */
	public void setNome_fantasia(String nome_fantasia) {
		this.nome_fantasia = nome_fantasia;
	}
	/**
	 * @return the r_social
	 */
	public String getR_social() {
		return R_social;
	}
	/**
	 * @param r_social the r_social to set
	 */
	public void setR_social(String r_social) {
		R_social = r_social;
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
	/**
	 * @return the date
	 */
	public Calendar getDate() {
		return Date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(Calendar date) {
		Date = date;
	}
	
}
