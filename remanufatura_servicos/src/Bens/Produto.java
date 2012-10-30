package Bens;

public class Produto {
String nome;
double Preco_venda;
Tipo_Produto tipo_produto;
Entrada_Produto entrada_produto;


public Produto() {
	
}

public Produto(String nome, double preco_venda, Tipo_Produto tipo_produto,
		Entrada_Produto entrada_produto) {
	super();
	this.nome = nome;
	Preco_venda = preco_venda;
	this.tipo_produto = tipo_produto;
	this.entrada_produto = entrada_produto;
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
 * @return the preco_venda
 */
public double getPreco_venda() {
	return Preco_venda;
}
/**
 * @param preco_venda the preco_venda to set
 */
public void setPreco_venda(double preco_venda) {
	Preco_venda = preco_venda;
}
/**
 * @return the tipo_produto
 */
public Tipo_Produto getTipo_produto() {
	return tipo_produto;
}
/**
 * @param tipo_produto the tipo_produto to set
 */
public void setTipo_produto(Tipo_Produto tipo_produto) {
	this.tipo_produto = tipo_produto;
}
/**
 * @return the entrada_produto
 */
public Entrada_Produto getEntrada_produto() {
	return entrada_produto;
}
/**
 * @param entrada_produto the entrada_produto to set
 */
public void setEntrada_produto(Entrada_Produto entrada_produto) {
	this.entrada_produto = entrada_produto;
}

}
