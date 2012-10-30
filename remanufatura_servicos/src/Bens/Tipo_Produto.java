package Bens;



public class Tipo_Produto {
int codigo;
String nome;
String marca;
/**
 * @return the codigo
 */

public Tipo_Produto() {
	
}

public Tipo_Produto(int codigo, String nome, String marca) {
	
	this.codigo = codigo;
	this.nome = nome;
	this.marca = marca;
}

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
 * @return the marca
 */
public String getMarca() {
	return marca;
}
/**
 * @param marca the marca to set
 */
public void setMarca(String marca) {
	this.marca = marca;
}


}
