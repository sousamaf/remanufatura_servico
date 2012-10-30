package Bens;

public class Pedido_Compra {
	Fornecedor fornecedor;
	Entrada_Produto entrada_produto;
	
	public Pedido_Compra() {
		
	}
	
	public Pedido_Compra(Fornecedor fornecedor, Entrada_Produto entrada_produto) {
		super();
		this.fornecedor = fornecedor;
		this.entrada_produto = entrada_produto;
	}

	/**
	 * @return the fornecedor
	 */
	public Fornecedor getFornecedor() {
		return fornecedor;
	}
	/**
	 * @param fornecedor the fornecedor to set
	 */
	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
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
