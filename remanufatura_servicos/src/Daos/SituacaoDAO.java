

	
	/*
	 * To change this template, choose Tools | Templates
	 * and open the template in the editor.
	 */
	package Daos;

	
import Conexao.Conexao;
import Bens.Situacao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

	public class SituacaoDAO
	{
	  @SuppressWarnings("finally")
	public boolean excluir(Situacao codigo)
	  {
	    boolean res = false;
	    Conexao con = new Conexao();
	    String query = "DELETE FROM codigo  WHERE codigo=?";
	    
	    con.preparar(query);
	    try
	    {
	      con.getPstmt().setInt(1, codigo.getCodigo());
	      res = con.executeUpdate();
	    } catch (SQLException ex)
	    {
	      Logger.getLogger(SituacaoDAO.class.getName()).log(Level.SEVERE, null, ex);
	    }
	    finally
	    {
	      con.fechar();
	      return(res);
	    }
	  }
	  @SuppressWarnings("finally")	  
	  public boolean inserir(Situacao codigo)
	  {
	    boolean res = false;
	    Conexao con = new Conexao();
	    String query = "INSERT INTO Situacao (codigo, tipo) VALUES (?, ?)";
	    
	    con.preparar(query);
	    try
	    {
	      con.getPstmt().setInt(1, codigo.getCodigo());
	      con.getPstmt().setString(2, codigo.getTipo());
	      res = con.executeUpdate();
	    } catch (SQLException ex)
	    {
	      Logger.getLogger(SituacaoDAO.class.getName()).log(Level.SEVERE, null, ex);
	    }
	    finally
	    {
	      con.fechar();
	      return(res);
	    }
	  }
	  @SuppressWarnings("finally")
	  public boolean atualizar(Situacao situacaoatual, Situacao situacaonova)
	  {
	    boolean res = false;
	    Conexao con = new Conexao();
	    String query = "UPDATE Situacao SET codigo=?, tipo=? WHERE codigo=?";
	    
	    con.preparar(query);
	    try
	    {
	      con.getPstmt().setInt(1, situacaonova.getCodigo());
	      con.getPstmt().setString(2, situacaonova.getTipo());
	      con.getPstmt().setInt(3, situacaoatual.getCodigo());
	      res = con.executeUpdate();
	    } catch (SQLException ex)
	    {
	      Logger.getLogger(SituacaoDAO.class.getName()).log(Level.SEVERE, null, ex);
	    }
	    finally
	    {
	      con.fechar();
	      return(res);
	    }
	  }
	  
	  @SuppressWarnings("finally")
	public ArrayList<Situacao> buscar() // busca por qual quer um
	  {
	    ArrayList<Situacao> res = new ArrayList<Situacao>();
	    Conexao con = new Conexao();
	    String query = "SELECT codigo, tipo FROM codigo ORDER BY codigo";
	    
	    con.preparar(query);
	    try
	    {
	      ResultSet rs = con.getPstmt().executeQuery();
	      while (rs.next())
	      {
	    	  Situacao situacao = new Situacao();
	        situacao.setCodigo(rs.getInt("codigo"));
	        situacao.setTipo(rs.getString("Tipo"));
	        res.add(situacao);
	      }
	    } catch (SQLException ex)
	    {
	      Logger.getLogger(SituacaoDAO.class.getName()).log(Level.SEVERE, null, ex);
	    }
	    finally
	    {
	      con.fechar();
	      return(res);
	    }
	  }
	  @SuppressWarnings("finally")
	  public Situacao buscar(String tipo)
	  {
		  Situacao res = null;
	    Conexao con = new Conexao(); //Abrindo Conecção
	    String query = "SELECT codigo, tipo FROM tipo WHERE tipo=?";
	    
	    con.preparar(query);
	    try
	    {
	      con.getPstmt().setString(1, tipo);
	      ResultSet rs = con.getPstmt().executeQuery();
	      if (rs.next()) // passa para proxima linha do rs.net "tabela de resultados
	      {
	        res = new Situacao();
	        res.setCodigo(rs.getInt("Codigo"));
	        res.setTipo(rs.getString("Tipo"));
	      }
	    } catch (SQLException ex)
	    {
	      Logger.getLogger(SituacaoDAO.class.getName()).log(Level.SEVERE, null, ex);
	    }
	    finally
	    {
	      con.fechar();
	      return(res);
	    }
	  }
	  
	  @SuppressWarnings("finally")
	public Situacao buscarPorCodigo(String codigo)
	  {
		  Situacao res = null;
	    Conexao con = new Conexao();
	    String query = "SELECT codigo, tipo FROM codigo WHERE codigo LIKE ?";
	    
	    con.preparar(query);
	    try
	    {
	      con.getPstmt().setString(1, "%"+codigo+"%");
	      ResultSet rs = con.getPstmt().executeQuery();
	      if (rs.next())
	      {
	        res = new Situacao();
	        res.setCodigo(rs.getInt("codigo"));
	        res.setTipo(rs.getString("Tipo"));
	      }
	    } catch (SQLException ex)
	    {
	      Logger.getLogger(SituacaoDAO.class.getName()).log(Level.SEVERE, null, ex);
	    }
	    finally
	    {
	      con.fechar();
	      return(res);
	    }
	  }
	}

	
