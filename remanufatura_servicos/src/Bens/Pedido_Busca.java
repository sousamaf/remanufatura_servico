
package Bens;

import java.util.*;

public class Pedido_Busca {
int codigo;
Funcionario funcionario;
Calendar Horario;

public Pedido_Busca() {
	
}

public Pedido_Busca(int codigo, Funcionario funcionario, Calendar horario) {
	super();
	this.codigo = codigo;
	this.funcionario = funcionario;
	Horario = horario;
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
 * @return the horario
 */
public Calendar getHorario() {
	return Horario;
}
/**
 * @param horario the horario to set
 */
public void setHorario(Calendar horario) {
	Horario = horario;
}

}
