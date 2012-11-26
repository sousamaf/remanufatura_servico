

	
	/*
	 * To change this template, choose Tools | Templates
	 * and open the template in the editor.
	 */
	package Daos;

	
import Conexao.Conexao;
import Bens.Pedido_Compra;
import Bens.Uf;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

	public class Pedido_CompraDAO
	{
	  @SuppressWarnings("finally")
	public boolean excluir(Pedido_Compra pedido_compra)
	  {
	    boolean res = false;
	    Conexao con = new Conexao();
	    String query = "DELETE FROM Pedido_Compra  WHERE fornecedor=?";
	    
	    con.preparar(query);
	    try
	    {
	      con.getPstmt().setInt(1, pedido_compra.getFornecedor().getCodigo());
	      res = con.executeUpdate();
	    } catch (SQLException ex)
	    {
	      Logger.getLogger(Pedido_CompraDAO.class.getName()).log(Level.SEVERE, null, ex);
	    }
	    finally
	    {
	      con.fechar();
	      return(res);
	    }
	  }
	  @SuppressWarnings("finally")	  
	  public boolean inserir(Pedido_Compra pedido)
	  {
	    boolean res = false;
	    Conexao con = new Conexao();
	    String query = "INSERT INTO pedido (fornecedor, entrada_produto) VALUES (?, ?)";
	    
	    con.preparar(query);
	    try
	    {
	      con.getPstmt().setInt(1, pedido.getFornecedor().getCodigo());
	      con.getPstmt().setInt(2, pedido.getEntrada_produto().getCodigo());
	      res = con.executeUpdate();
	    } catch (SQLException ex)
	    {
	      Logger.getLogger(Pedido_CompraDAO.class.getName()).log(Level.SEVERE, null, ex);
	    }
	    finally
	    {
	      con.fechar();
	      return(res);
	    }
	  }
	  @SuppressWarnings("finally")
	  public boolean atualizar(Pedido_Compra pedidoatual, Pedido_Compra pedidonova)
	  {
	    boolean res = false;
	    Conexao con = new Conexao();
	    String query = "UPDATE Pedido_Compra SET fornecedor=?, entrada_produto=? WHERE fornecedor=?";
	    
	    con.preparar(query);
	    try
	    {
	      con.getPstmt().setInt(1, pedidonova.getFornecedor().getCodigo());
	      con.getPstmt().setInt(2, pedidonova.getEntrada_produto().getCodigo());
	      con.getPstmt().setInt(3, pedidoatual.getFornecedor().getCodigo());
	    		  res = con.executeUpdate();
	    } catch (SQLException ex)
	    {
	      Logger.getLogger(Pedido_CompraDAO.class.getName()).log(Level.SEVERE, null, ex);
	    }
	    finally
	    {
	      con.fechar();
	      return(res);
	    }
	  }
	  
	  @SuppressWarnings("finally")
	public ArrayList<Pedido_Compra> buscar()
	  {
	    ArrayList<Pedido_Compra> res = new ArrayList<Pedido_Compra>();
	    Conexao con = new Conexao();
	    String query = "SELECT fornecedor, entrada_produto FROM Pedido_Compra ORDER BY Pedido_Compra";
	    
	    con.preparar(query);
	    try
	    {
	      ResultSet rs = con.getPstmt().executeQuery();
	      while (rs.next())
	      {
	       Pedido_Compra pedido = new Pedido_Compra();
	      //  pedido.setFornecedor(rs.getInt("fornecedor"));
	       // pedido.setEntrada_produto((rs.getInt("estado"));
	        res.add(pedido);
	      }
	    } catch (SQLException ex)
	    {
	      Logger.getLogger(UfDAO.class.getName()).log(Level.SEVERE, null, ex);
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
	      Logger.getLogger(UfDAO.class.getName()).log(Level.SEVERE, null, ex);
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
	      Logger.getLogger(UfDAO.class.getName()).log(Level.SEVERE, null, ex);
	    }
	    finally
	    {
	      con.fechar();
	      return(res);
	    }
	  }
	}

	
