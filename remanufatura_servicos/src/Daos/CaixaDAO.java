

	
	/*
	 * To change this template, choose Tools | Templates
	 * and open the template in the editor.
	 */
	package Daos;

	import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;

import Bens.Caixa;
import Conexao.Conexao;

	public class CaixaDAO
	{
	  @SuppressWarnings("finally")
	public boolean excluir(Caixa caixa)
	  {
	    boolean res = false;
	    Conexao con = new Conexao();
	    String query = "DELETE FROM Caixa  WHERE codigo=?";
	    
	    con.preparar(query);
	    try
	    {
	      con.getPstmt().setInt(1, caixa.getCodigo());
	      res = con.executeUpdate();
	    } catch (SQLException ex)
	    {
	      Logger.getLogger(CaixaDAO.class.getName()).log(Level.SEVERE, null, ex);
	    }
	    finally
	    {
	      con.fechar();
	      return(res);
	    }
	  }
	  @SuppressWarnings("finally")	  
	  public boolean inserir(Caixa Cx)
	  {
	    boolean res = false;
	    Conexao con = new Conexao();
	    String query = "INSERT INTO Caixa (aberto_feichado, codigo, Funcionario) VALUES (?, ?,?)";
	    
	    con.preparar(query);
	    try
	    {
	    	con.getPstmt().setLong(1, Cx.getAberto_feichado().getTimeInMillis());
	      con.getPstmt().setInt(2, Cx.getCodigo());
	      con.getPstmt().setInt(3,Cx.getFuncionario().getCodigo());
	      res = con.executeUpdate();
	    } catch (SQLException ex)
	    {
	      Logger.getLogger(CaixaDAO.class.getName()).log(Level.SEVERE, null, ex);
	    }
	    finally
	    {
	      con.fechar();
	      return(res);
	    }
	  }
	  @SuppressWarnings("finally")
	  public boolean atualizar(Caixa atual, Caixa nova)
	  {
	    boolean res = false;
	    Conexao con = new Conexao();
	    String query = "UPDATE Caixa SET aberto_feichado=?, Funcionario=? WHERE codigo=?";
	    
	    con.preparar(query);
	    try
	    {
	      con.getPstmt().setLong(1, nova.getAberto_feichado().getTimeInMillis());
	      
	      con.getPstmt().setInt(2, nova.getFuncionario().getCodigo());
	    //  con.getPstmt().setInt(3, atual.getCodigo());
	    		 // res = con.executeUpdate();
	    } catch (SQLException ex)
	    {
	      Logger.getLogger(CaixaDAO.class.getName()).log(Level.SEVERE, null, ex);
	    }
	    finally
	    {
	      con.fechar();
	      return(res);
	    }
	  }
	 
	  @SuppressWarnings("finally")
	public Caixa buscar(String caixa)
	  {
	    Caixa res = null;
	    Conexao con = new Conexao(); //Abrindo Conecção
	    String query = "SELECT aberto_feichado, codigo, funcionario FROM Caixa WHERE fucionario=?";
	    
	    con.preparar(query);
	    try
	    {
	      con.getPstmt().setString(1, caixa);
	      ResultSet rs = con.getPstmt().executeQuery();
	      if (rs.next()) // passa para proxima linha do rs.net "tabela de resultados
	      {
	        res = new Caixa();
	        Calendar c = new GregorianCalendar();
	        c.setTimeInMillis(rs.getLong("aberto_feichado"));
	        res.setAberto_feichado(c);
	
	      }
	    } catch (SQLException ex)
	    {
	      Logger.getLogger(CaixaDAO.class.getName()).log(Level.SEVERE, null, ex);
	    }
	    finally
	    {
	      con.fechar();
	      return(res);
	    }

}}