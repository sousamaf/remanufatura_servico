package Bens;

public class Movimentacao_caixa {

	int codigo;
	double entrada;
	double saida;
	Funcionario funcionario;
	Caixa caixa;
	Contas_Receber conta_receber;
	Contas_Pagar conta_pagar;
	
	
	
	public Movimentacao_caixa() {
		
	}
	
	public Movimentacao_caixa(int codigo, double entrada, double saida,
			Funcionario funcionario, Caixa caixa, Contas_Receber conta_receber,
			Contas_Pagar conta_pagar) {
		super();
		this.codigo = codigo;
		this.entrada = entrada;
		this.saida = saida;
		this.funcionario = funcionario;
		this.caixa = caixa;
		this.conta_receber = conta_receber;
		this.conta_pagar = conta_pagar;
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
	 * @return the entrada
	 */
	public double getEntrada() {
		return entrada;
	}
	/**
	 * @param entrada the entrada to set
	 */
	public void setEntrada(double entrada) {
		this.entrada = entrada;
	}
	/**
	 * @return the saida
	 */
	public double getSaida() {
		return saida;
	}
	/**
	 * @param saidada the saidada to set
	 */
	public void setSaida(double saida) {
		this.saida = saida;
	}
	/**
	 * @return the funcionario
	 */
	public Funcionario getFuncionario() {
		return funcionario;
	}
	/**
	 * @param funcionario the funcionario to set
	 */
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	/**
	 * @return the caixa
	 */
	public Caixa getCaixa() {
		return caixa;
	}
	/**
	 * @param caixa the caixa to set
	 */
	public void setCaixa(Caixa caixa) {
		this.caixa = caixa;
	}
	/**
	 * @return the conta_receber
	 */
	public Contas_Receber getConta_receber() {
		return conta_receber;
	}
	/**
	 * @param conta_receber the conta_receber to set
	 */
	public void setConta_receber(Contas_Receber conta_receber) {
		this.conta_receber = conta_receber;
	}
	/**
	 * @return the conta_pagar
	 */
	public Contas_Pagar getConta_pagar() {
		return conta_pagar;
	}
	/**
	 * @param conta_pagar the conta_pagar to set
	 */
	public void setConta_pagar(Contas_Pagar conta_pagar) {
		this.conta_pagar = conta_pagar;
	}

}
