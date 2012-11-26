

	
	/*
	 * To change this template, choose Tools | Templates
	 * and open the template in the editor.
	 */
	package Daos;

	
	import Conexao.Conexao;
import Bens.Endereco;
import Bens.Cidade;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

	public class EnderecoDAO
	{
	  @SuppressWarnings("finally")
	public boolean excluir(Endereco end)
	  {
	    boolean res = false;
	    Conexao con = new Conexao();
	    String query = "DELETE FROM Endereco  WHERE codigo=?";
	    
	    con.preparar(query);
	    try
	    {
	      con.getPstmt().setInt(1, end.getCodigo());
	      res = con.executeUpdate();
	    } catch (SQLException ex)
	    {
	      Logger.getLogger(EnderecoDAO.class.getName()).log(Level.SEVERE, null, ex);
	    }
	    finally
	    {
	      con.fechar();
	      return(res);
	    }
	  }
	  @SuppressWarnings("finally")	  
	  public boolean inserir(Endereco end)
	  {
	    boolean res = false;
	    Conexao con = new Conexao();
	    String query = "INSERT INTO Endereco (rua, mumero, complemeto, cidade_codigo) VALUES (?, ,?,?, ?)";
	    
	    con.preparar(query);
	    try
	    {
	      con.getPstmt().setString(1, end.getRua());
	      con.getPstmt().setInt(2, end.getNumero());
	      con.getPstmt().setString(3, end.getComplemento());
	      con.getPstmt().setInt(4,end.getCidade().getCodigo());
	      res = con.executeUpdate();
	    } catch (SQLException ex)
	    {
	      Logger.getLogger(EnderecoDAO.class.getName()).log(Level.SEVERE, null, ex);
	    }
	    finally
	    {
	      con.fechar();
	      return(res);
	    }
	  }
	  @SuppressWarnings("finally")
	  public boolean atualizar(Endereco endatual, Endereco endnova)
	  {
	    boolean res = false;
	    Conexao con = new Conexao();
	    String query = "UPDATE Endereco SET rua=?, numero=?, complemento=?, cidade_codigo=? WHERE codigo=?";
	    
	    con.preparar(query);
	    try
	    {
		      con.getPstmt().setString(1, endnova.getRua());
		      con.getPstmt().setInt(2, endnova.getNumero());
		      con.getPstmt().setString(3, endnova.getComplemento());
		      con.getPstmt().setInt(4, endatual.getCodigo());
		      res = con.executeUpdate();
		  
	    } catch (SQLException ex)
	    {
	      Logger.getLogger(EnderecoDAO.class.getName()).log(Level.SEVERE, null, ex);
	    }
	    finally
	    {
	      con.fechar();
	      return(res);
	    }
	  }
	  
	  @SuppressWarnings("finally")
	public ArrayList<Endereco> buscar()
	  {
	    ArrayList<Endereco> res = new ArrayList<Endereco>();
	    Conexao con = new Conexao();
	    String query = "SELECT cidade_codigo, rua, numero, complemento  FROM Endereco ";
	    
	    con.preparar(query);
	    try
	    {
	      ResultSet rs = con.getPstmt().executeQuery();
	      while (rs.next())
	      {
	        Endereco end = new Endereco();
	        
	       CidadeDAO cidadedao = new CidadeDAO();
	        Cidade cidade = cidadedao.buscar(rs.getInt("cidade"));
	        
	        end.setCidade(cidade);
	        res.add(end);
	        
	        end.setRua(rs.getString("Rua"));
	        end.setNumero(rs.getInt("Numero"));
	        end.setComplemento(rs.getString("Complemento"));
	        res.add(end);
	      }
	    } catch (SQLException ex)
	    {
	      Logger.getLogger(EnderecoDAO.class.getName()).log(Level.SEVERE, null, ex);
	    }
	    finally
	    {
	      con.fechar();
	      return(res);
	    }
	  }
	}