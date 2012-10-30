package Bens;
import java.util.Calendar;
public class Venda {
	int codigo;
	boolean orcamento;
	Funcionario funcionario;
	Situacao tipo_venda;
	Cliente cliente;
	Pedido_Busca Busca;
	Calendar data;
	
	public Venda() {
		
	}
	
	public Venda(int codigo, boolean orcamento, Funcionario funcionario,
			Situacao tipo_venda, Cliente cliente, Pedido_Busca busca,
			Calendar data) {
		super();
		this.codigo = codigo;
		this.orcamento = orcamento;
		this.funcionario = funcionario;
		this.tipo_venda = tipo_venda;
		this.cliente = cliente;
		Busca = busca;
		this.data = data;
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
	 * @return the orcamento
	 */
	public boolean getorcamento() {
		return orcamento;
	}
	/**
	 * @param orcamento the orcamento to set
	 */
	public void setorcamento(boolean orcamento) {
		this.orcamento = orcamento;
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
	 * @return the tipo_venda
	 */
	public Situacao getTipo_venda() {
		return tipo_venda;
	}
	/**
	 * @param tipo_venda the tipo_venda to set
	 */
	public void setTipo_venda(Situacao tipo_venda) {
		this.tipo_venda = tipo_venda;
	}
	/**
	 * @return the cliente
	 */
	public Cliente getCliente() {
		return cliente;
	}
	/**
	 * @param cliente the cliente to set
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	/**
	 * @return the busca
	 */
	public Pedido_Busca getBusca() {
		return Busca;
	}
	/**
	 * @param busca the busca to set
	 */
	public void setBusca(Pedido_Busca busca) {
		Busca = busca;
	}
	/**
	 * @return the data
	 */
	public Calendar getData() {
		return data;
	}
	/**
	 * @param data the data to set
	 */
	public void setData(Calendar data) {
		this.data = data;
	}
	
}
