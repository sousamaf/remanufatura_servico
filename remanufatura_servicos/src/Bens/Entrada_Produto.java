package Bens;

public class Entrada_Produto {
	int codigo;
	int quantidad;
	double preco_entrada;
	
	
	public Entrada_Produto() {
		
	}
	
	public Entrada_Produto(int codigo, int quantidad, double preco_entrada) {
		super();
		this.codigo = codigo;
		this.quantidad = quantidad;
		this.preco_entrada = preco_entrada;
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
	 * @return the quantidad
	 */
	public int getQuantidad() {
		return quantidad;
	}
	/**
	 * @param quantidad the quantidad to set
	 */
	public void setQuantidad(int quantidad) {
		this.quantidad = quantidad;
	}
	/**
	 * @return the preco_entrada
	 */
	public double getPreco_entrada() {
		return preco_entrada;
	}
	/**
	 * @param preco_entrada the preco_entrada to set
	 */
	public void setPreco_entrada(double preco_entrada) {
		this.preco_entrada = preco_entrada;
	}

}
