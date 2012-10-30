

	
	/*
	 * To change this template, choose Tools | Templates
	 * and open the template in the editor.
	 */
	package Daos;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import Bens.Venda;
import Conexao.Conexao;
	public class VendaDAO
	{
	  @SuppressWarnings("finally")
	public boolean excluir(Venda venda)
	  {
	    boolean res = false;
	    Conexao con = new Conexao();
	    String query = "DELETE FROM venda  WHERE codigo=?";
	    
	    con.preparar(query);
	    try
	    {
	      con.getPstmt().setInt(1, venda.getCodigo());
	      res = con.executeUpdate();
	    } catch (SQLException ex)
	    {
	      Logger.getLogger(VendaDAO.class.getName()).log(Level.SEVERE, null, ex);
	    }
	    finally
	    {
	      con.fechar();
	      return(res);
	    }
	  }
	  @SuppressWarnings("finally")	  
	  public boolean inserir(Venda venda)
	  {
	    boolean res = false;
	    Conexao con = new Conexao();
	    String query = "INSERT INTO Venda (codigo,funcionario_codigo, tipo_venda_codigo, cliente_codigo, orcamento, pedido_de_busca_codigo, data) VALUES (?,?,?,?,?,?,?)";
	    
	    con.preparar(query);
	    try
	    {
	      con.getPstmt().setInt(1, venda.getCodigo());
	      con.getPstmt().setInt(2, venda.getFuncionario().getCodigo());
	      con.getPstmt().setInt(3,venda.getTipo_venda().getCodigo());
	      con.getPstmt().setInt(4,venda.getCliente().getCodigo());
	      con.getPstmt().setBoolean(5,venda.getorcamento());
	      con.getPstmt().setInt(6,venda.getBusca().getCodigo());
	      //con.getPstmt().setLong(7,venda.setData());  ainda verificar função data
	      
	    
	      
	      res = con.executeUpdate();
	    } catch (SQLException ex)
	    {
	      Logger.getLogger(VendaDAO.class.getName()).log(Level.SEVERE, null, ex);
	    }
	    finally
	    {
	      con.fechar();
	      return(res);
	    }
	  }
	  @SuppressWarnings("finally")
	  public boolean atualizar(Venda tipoatual, Venda tiponovo)
	  {
	    boolean res = false;
	    Conexao con = new Conexao();
	    String query = "UPDATE Venda SET tipo_venda_codigo=?, cliente_codigo=?, orcamento=? WHERE codigo=?";
	    
	    con.preparar(query);
	    try
	    {
	      con.getPstmt().setInt(1, tipoatual.getTipo_venda().getCodigo());
	      con.getPstmt().setInt(2, tiponovo.getCliente().getCodigo());
	      con.getPstmt().setBoolean(3, tiponovo.getorcamento());
	      con.getPstmt().setInt(4,tipoatual.getCodigo());
	    		  res = con.executeUpdate();
	    } catch (SQLException ex)
	    {
	      Logger.getLogger(VendaDAO.class.getName()).log(Level.SEVERE, null, ex);
	    }
	    finally
	    {
	      con.fechar();
	      return(res);
	    }
	  }
	  @SuppressWarnings("finally")
	public ArrayList<Venda> buscar()
	  {
	    ArrayList<Venda> res = new ArrayList<Venda>();
	    Conexao con = new Conexao();
	    String query = "SELECT codigo, clinte, date "
	            + "FROM Venda ORDER BY Codigo";
	    
	    con.preparar(query);
	    try
	    {
	      ResultSet rs = con.getPstmt().executeQuery();
	      while (rs.next())
	      {
	        Venda venda = new Venda();
	        venda.setCodigo(rs.getInt("codigo"));
	       
	        
	        //VendaDAO Vendadao = new VendaDAO();
	      //  Cliente cliente = Vendadao.buscar(rs.getString("cliente"));   nao esta funcionando
	      //  codigo.setData(codigo);
	      //  res.add(codigo);
	      }
	    } catch (SQLException ex)
	    {
	      Logger.getLogger(VendaDAO.class.getName()).log(Level.SEVERE, null, ex);
	    }
	    finally
	    {
	      con.fechar();
	      return(res);
	    }
	  }
	/*  public ArrayList<Venda> buscar(Cliente cliente)
	  {
	    ArrayList<Venda> res = new ArrayList<Venda>();
	    Conexao con = new Conexao();
	    String query = "SELECT codigo,funcionario_codigo, tipo_venda_codigo, cliente_codigo, orcamento, pedido_de_busca_codigo, data "
	            + "FROM venda WHERE cliente =? ORDER BY codigo";
	
	    con.preparar(query);
	    try
	    {
	      con.getPstmt().setInt(1, cliente.getCodigo());
	      con.getPstmt().setInt(2, cliente.   
	      ResultSet rs = con.getPstmt().executeQuery();
	      while (rs.next())
	      {
	        Venda venda = new Venda();
	        venda.setCodigo(rs.getInt("codigo"));
	        venda.setFuncionario(funcionario)
	       
	        cliente.setCodigo(cliente.getCodigo());
	        res.add(cliente.getCodigo());
	      }
	    } catch (SQLException ex)
	    {
	      Logger.getLogger(VendaDAO.class.getName()).log(Level.SEVERE, null, ex);
	    }
	    finally
	    {
	      con.fechar();
	      return(res);
	    }
	  }
	  */
	}
	

	