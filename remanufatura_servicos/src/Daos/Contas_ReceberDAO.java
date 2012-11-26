

	
	/*
	 * To change this template, choose Tools | Templates
	 * and open the template in the editor.
	 */
	package Daos;

	
	import Conexao.Conexao;
import Bens.Uf;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

	public class Contas_ReceberDAO
	{
	  @SuppressWarnings("finally")
	public boolean excluir(Uf uf)
	  {
	    boolean res = false;
	    Conexao con = new Conexao();
	    String query = "DELETE FROM uf  WHERE uf=?";
	    
	    con.preparar(query);
	    try
	    {
	      con.getPstmt().setString(1, uf.getUf());
	      res = con.executeUpdate();
	    } catch (SQLException ex)
	    {
	      Logger.getLogger(Contas_ReceberDAO.class.getName()).log(Level.SEVERE, null, ex);
	    }
	    finally
	    {
	      con.fechar();
	      return(res);
	    }
	  }
	  @SuppressWarnings("finally")	  
	  public boolean inserir(Uf uf)
	  {
	    boolean res = false;
	    Conexao con = new Conexao();
	    String query = "INSERT INTO uf (uf, estado) VALUES (?, ?)";
	    
	    con.preparar(query);
	    try
	    {
	      con.getPstmt().setString(1, uf.getUf());
	      con.getPstmt().setString(2, uf.getEstado());
	      res = con.executeUpdate();
	    } catch (SQLException ex)
	    {
	      Logger.getLogger(Contas_ReceberDAO.class.getName()).log(Level.SEVERE, null, ex);
	    }
	    finally
	    {
	      con.fechar();
	      return(res);
	    }
	  }
	  @SuppressWarnings("finally")
	  public boolean atualizar(Uf ufatual, Uf ufnova)
	  {
	    boolean res = false;
	    Conexao con = new Conexao();
	    String query = "UPDATE Uf SET uf=?, estado=? WHERE uf=?";
	    
	    con.preparar(query);
	    try
	    {
	      con.getPstmt().setString(1, ufnova.getUf());
	      con.getPstmt().setString(2, ufnova.getEstado());
	      con.getPstmt().setString(3, ufatual.getUf());
	      res = con.executeUpdate();
	    } catch (SQLException ex)
	    {
	      Logger.getLogger(Contas_ReceberDAO.class.getName()).log(Level.SEVERE, null, ex);
	    }
	    finally
	    {
	      con.fechar();
	      return(res);
	    }
	  }
	  
	  @SuppressWarnings("finally")
	public ArrayList<Uf> buscar()
	  {
	    ArrayList<Uf> res = new ArrayList<Uf>();
	    Conexao con = new Conexao();
	    String query = "SELECT uf, estado FROM uf ORDER BY uf";
	    
	    con.preparar(query);
	    try
	    {
	      ResultSet rs = con.getPstmt().executeQuery();
	      while (rs.next())
	      {
	        Uf uf = new Uf();
	        uf.setUf(rs.getString("uf"));
	        uf.setEstado(rs.getString("estado"));
	        res.add(uf);
	      }
	    } catch (SQLException ex)
	    {
	      Logger.getLogger(Contas_ReceberDAO.class.getName()).log(Level.SEVERE, null, ex);
	    }
	    finally
	    {
	      con.fechar();
	      return(res);
	    }
	  }
	  @SuppressWarnings("finally")
	  public Uf buscar(String uf)
	  {
	    Uf res = null;
	    Conexao con = new Conexao(); //Abrindo Conecção
	    String query = "SELECT uf, estado FROM uf WHERE uf=?";
	    
	    con.preparar(query);
	    try
	    {
	      con.getPstmt().setString(1, uf);
	      ResultSet rs = con.getPstmt().executeQuery();
	      if (rs.next()) // passa para proxima linha do rs.net "tabela de resultados
	      {
	        res = new Uf();
	        res.setUf(rs.getString("uf"));
	        res.setEstado(rs.getString("estado"));
	      }
	    } catch (SQLException ex)
	    {
	      Logger.getLogger(Contas_ReceberDAO.class.getName()).log(Level.SEVERE, null, ex);
	    }
	    finally
	    {
	      con.fechar();
	      return(res);
	    }
	  }
	  
	  @SuppressWarnings("finally")
	public Uf buscarPorEstado(String estado)
	  {
	    Uf res = null;
	    Conexao con = new Conexao();
	    String query = "SELECT uf, estado FROM uf WHERE estado LIKE ?";
	    
	    con.preparar(query);
	    try
	    {
	      con.getPstmt().setString(1, "%"+estado+"%");
	      ResultSet rs = con.getPstmt().executeQuery();
	      if (rs.next())
	      {
	        res = new Uf();
	        res.setUf(rs.getString("uf"));
	        res.setEstado(rs.getString("estado"));
	      }
	    } catch (SQLException ex)
	    {
	      Logger.getLogger(Contas_ReceberDAO.class.getName()).log(Level.SEVERE, null, ex);
	    }
	    finally
	    {
	      con.fechar();
	      return(res);
	    }
	  }
	}

	
