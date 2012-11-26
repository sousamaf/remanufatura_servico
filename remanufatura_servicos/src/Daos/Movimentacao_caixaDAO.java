

	
	/*
	 * To change this template, choose Tools | Templates
	 * and open the template in the editor.
	 */
	package Daos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import Bens.Caixa;
import Bens.Movimentacao_caixa;
import Conexao.Conexao;

	public class Movimentacao_caixaDAO
	{
	  @SuppressWarnings("finally")
	public boolean excluir(Movimentacao_caixa movi)
	  {
	    boolean res = false;
	    Conexao con = new Conexao();
	    String query = "DELETE FROM movi  WHERE codigo=?";
	    
	    con.preparar(query);
	    try
	    {
	      con.getPstmt().setInt(1, movi.getCodigo());
	      res = con.executeUpdate();
	    } catch (SQLException ex)
	    {
	      Logger.getLogger(Movimentacao_caixaDAO.class.getName()).log(Level.SEVERE, null, ex);
	    }
	    finally
	    {
	      con.fechar();
	      return(res);
	    }
	  }
	  @SuppressWarnings("finally")	  
	  public boolean inserir(Movimentacao_caixa movi)
	  {
	    boolean res = false;
	    Conexao con = new Conexao();
	    String query = "INSERT INTO movi (codigo, caixa, contas_pagar, contas_receber, funcionario, saida, entrada) VALUES (?, ?,?,?,?,?,?)";
	    
	    con.preparar(query);
	    try
	    {
	      con.getPstmt().setInt(1, movi.getCodigo());
	      con.getPstmt().setInt(2, movi.getCaixa().getCodigo());
	      con.getPstmt().setInt(3, movi.getConta_pagar().getCodigo());
	      con.getPstmt().setInt(4, movi.getConta_receber().getCodigo());
	      con.getPstmt().setInt(5, movi.getFuncionario().getCodigo());
	      con.getPstmt().setDouble(6, movi.getSaida());
	      con.getPstmt().setDouble(2, movi.getEntrada());
	      
	      res = con.executeUpdate();
	    } catch (SQLException ex)
	    {
	      Logger.getLogger(Movimentacao_caixaDAO.class.getName()).log(Level.SEVERE, null, ex);
	    }
	    finally
	    {
	      con.fechar();
	      return(res);
	    }
	  }
	  @SuppressWarnings("finally")
	  public boolean atualizar(Movimentacao_caixa moviatual, Movimentacao_caixa movinova)
	  {
	    boolean res = false;	    Conexao con = new Conexao();
	    String query = "UPDATE Movimentacao_caixa SET contas_pagar, contas_receber, funcionario, saida, entrada WHERE codigo=?";
	    
	    con.preparar(query);
	    try
	    {
	      con.getPstmt().setInt(1, movinova.getConta_pagar().getCodigo());
	      con.getPstmt().setInt(2, movinova.getConta_receber().getCodigo());
	      con.getPstmt().setInt(3, movinova.getFuncionario().getCodigo());
	      con.getPstmt().setDouble(4, movinova.getSaida());
	      con.getPstmt().setDouble(1, movinova.getEntrada());
	      con.getPstmt().setInt(3, moviatual.getCodigo());
	      res = con.executeUpdate();
	    } catch (SQLException ex)
	    {
	      Logger.getLogger(Movimentacao_caixaDAO.class.getName()).log(Level.SEVERE, null, ex);
	    }
	    finally
	    {
	      con.fechar();
	      return(res);
	    }
	  }
	  
	 
	
	  @SuppressWarnings("finally")
	public Movimentacao_caixa buscaPorFuncionario(String Funcionario)
	  {
		  Movimentacao_caixa res = null;
	    Conexao con = new Conexao();
	    String query = "SELECT codigo, caixa, contas_pagar, contas_receber, funcionario, saida, entrada FROM Movimentacao_caixa WHERE codigo LIKE ?";
	    
	    con.preparar(query);
	    try
	    {
	      con.getPstmt().setString(1, "%"+Funcionario+"%");
	      ResultSet rs = con.getPstmt().executeQuery();
	      if (rs.next())
	      {
	        res = new Movimentacao_caixa();
	        res.setCodigo(rs.getInt("Codigo"));
	        res.setSaida(rs.getInt("Saida"));
	        res.setEntrada(rs.getInt("Endatrada"));
	        CaixaDAO caixadao = new CaixaDAO();
	        Caixa c = caixadao.buscar(rs.getString("caixa"));
	        
	        res.setCaixa(c);
	      
	      }
	    } catch (SQLException ex)
	    {
	      Logger.getLogger(Movimentacao_caixaDAO.class.getName()).log(Level.SEVERE, null, ex);
	    }
	    finally
	    {
	      con.fechar();
	      return(res);
	    }
	  }
	}

	
