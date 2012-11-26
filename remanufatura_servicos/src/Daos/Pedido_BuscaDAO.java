

	
	/*
	 * To change this template, choose Tools | Templates
	 * and open the template in the editor.
	 */
	package Daos;

	
	import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import Bens.Pedido_Busca;
import Conexao.Conexao;

	public class Pedido_BuscaDAO
	{
	  @SuppressWarnings("finally")
	public boolean excluir(Pedido_Busca pedido_busca)
	  {
	    boolean res = false;
	    Conexao con = new Conexao();
	    String query = "DELETE FROM pedido_busca  WHERE codigo=?";
	    
	    con.preparar(query);
	    try
	    {
	      con.getPstmt().setInt(1, pedido_busca.getCodigo());
	      res = con.executeUpdate();
	    } catch (SQLException ex)
	    {
	      Logger.getLogger(Pedido_BuscaDAO.class.getName()).log(Level.SEVERE, null, ex);
	    }
	    finally
	    {
	      con.fechar();
	      return(res);
	    }
	  }
	  @SuppressWarnings("finally")	  
	  public boolean inserir(Pedido_Busca pedido_busca)
	  {
	    boolean res = false;
	    Conexao con = new Conexao();
	    String query = "INSERT INTO pedido_busca (codigo, funcionario, horario) VALUES (?,?, ?)";
	    
	    con.preparar(query);
	    try
	    {
	    
	      con.getPstmt().setInt(1, pedido_busca.getCodigo());
	      con.getPstmt().setInt(2, pedido_busca.getFuncionario().getCodigo());
	    con.getPstmt().setLong(3, pedido_busca.getHorario().getTimeInMillis());
	      res = con.executeUpdate();
	    } catch (SQLException ex)
	    {
	      Logger.getLogger(Pedido_BuscaDAO.class.getName()).log(Level.SEVERE, null, ex);
	    }
	    finally
	    {
	      con.fechar();
	      return(res);
	    }
	  }
	  @SuppressWarnings("finally")
	  public boolean atualizar(Pedido_Busca atual, Pedido_Busca nova)
	  {
	    boolean res = false;
	    Conexao con = new Conexao();
	    String query = "UPDATE Pedido_Busca SET codigo=?, funcionario=? WHERE codigo";
	    
	    con.preparar(query);
	    try
	    {
	      con.getPstmt().setInt(1, nova.getCodigo());
	      con.getPstmt().setInt(2, nova.getFuncionario().getCodigo());
	      //con.getPstmt().setDate(3,nova.getHorario());
	      con.getPstmt().setInt(3, atual.getCodigo());
	      res = con.executeUpdate();
	    } catch (SQLException ex)
	    {
	      Logger.getLogger(Pedido_BuscaDAO.class.getName()).log(Level.SEVERE, null, ex);
	    }
	    finally
	    {
	      con.fechar();
	      return(res);
	    }
	  }
	}
	
	 