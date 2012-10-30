package Bens;

public class Contas_Pagar {

int codigo;
Pedido_Compra compra;
/**
 * @return the codigo
 */
public int getCodigo() {
	return codigo;
	
}


public Contas_Pagar() {
	
}

public Contas_Pagar(int codigo, Pedido_Compra compra) {
	
	this.codigo = codigo;
	this.compra = compra;
}


/**
 * @param codigo the codigo to set
 */
public void setCodigo(int codigo) {
	this.codigo = codigo;
}
/**
 * @return the compra
 */
public Pedido_Compra getCompra() {
	return compra;
}
/**
 * @param compra the compra to set
 */
public void setCompra(Pedido_Compra compra) {
	this.compra = compra;
}

}
