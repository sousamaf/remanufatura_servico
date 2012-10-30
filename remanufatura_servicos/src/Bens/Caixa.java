package Bens;
import java.util.*;
public class Caixa {

int codigo;
Calendar aberto_feichado;
Funcionario funcionario;

	/**
	 * @return the codigo
	 */

			public int getCodigo() {
				return codigo;
		}
		public Caixa() {
		
	}
		
		public Caixa(int codigo, Calendar aberto_feichado,
				Funcionario funcionario) {
			super();
			this.codigo = codigo;
			this.aberto_feichado = aberto_feichado;
			this.funcionario = funcionario;
		}
		/**
		 * @param codigo the codigo to set
		 */
		public void setCodigo(int codigo) {
				this.codigo = codigo;
		}
		/**
		 * @return the aberto_feichado
		 */
		public Calendar getAberto_feichado() {
				return aberto_feichado;
		}
		/**
		 * @param aberto_feichado the aberto_feichado to set
		 */
		public void setAberto_feichado(Calendar aberto_feichado) {
				this.aberto_feichado = aberto_feichado;
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

}
