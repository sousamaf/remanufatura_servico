package Bens;

public class Contas_Receber {

	int codigo;
	Venda venda;
	/**
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}
	
	public Contas_Receber() {
		
	}
	

	public Contas_Receber(int codigo, Venda venda) {
		super();
		this.codigo = codigo;
		this.venda = venda;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	/**
	 * @return the venda
	 */
	public Venda getVenda() {
		return venda;
	}
	/**
	 * @param venda the venda to set
	 */
	public void setVenda(Venda venda) {
		this.venda = venda;
	}
	
}
