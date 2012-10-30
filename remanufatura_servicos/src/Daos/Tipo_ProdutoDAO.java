
	package Daos;

	
	import Conexao.Conexao;
import Bens.Tipo_Produto;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

	public class Tipo_ProdutoDAO
	{
	  @SuppressWarnings("finally")
	public boolean excluir( Tipo_Produto codigo)
	  {
	    boolean res = false;
	    Conexao con = new Conexao();
	    String query = "DELETE FROM Tipo_Produto  WHERE codigo=?";
	    
	    con.preparar(query);
	    try
	    {
	      con.getPstmt().setInt(1, codigo.getCodigo());
	      res = con.executeUpdate();
	    } catch (SQLException ex)
	    {
	      Logger.getLogger(Tipo_ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
	    }
	    finally
	    {
	      con.fechar();
	      return(res);
	    }
	  }
	  @SuppressWarnings("finally")	  
	  public boolean inserir(Tipo_Produto tipo) // ok
	  {
	    boolean res = false;
	    Conexao con = new Conexao();
	    String query = "INSERT INTO tipo (codigo, nome, marca) VALUES (?, ? ,?)";
	    
	    con.preparar(query);
	    try
	    {
	      con.getPstmt().setInt(1, tipo.getCodigo()); // inserindo dentro do tipo um codigo
	      con.getPstmt().setString(2, tipo.getNome()); // inserindo dentro do tipo um nome
	      con.getPstmt().setString(3, tipo.getMarca()); // inserindo dentro do tipo uma Marca
	      res = con.executeUpdate();
	    } catch (SQLException ex)
	    {
	      Logger.getLogger(Tipo_ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
	    }
	    finally
	    {
	      con.fechar();
	      return(res);
	    }
	  }
	  @SuppressWarnings("finally")
	  public boolean atualizar(Tipo_Produto Codigoatual, Tipo_Produto Codigonova)  //ok 
	  {
	    boolean res = false;
	    Conexao con = new Conexao();
	    String query = "UPDATE Tipo_Produto SET codigo=?, nome=?, marca=? WHERE codigo=?";
	    
	    con.preparar(query);
	    try
	    {
	      con.getPstmt().setInt(1, Codigonova.getCodigo());
	      con.getPstmt().setString(2, Codigonova.getNome());
	      con.getPstmt().setString(3, Codigonova.getMarca());
	      con.getPstmt().setInt(4, Codigoatual.getCodigo());
	      res = con.executeUpdate();
	    } catch (SQLException ex)
	    {
	      Logger.getLogger(Tipo_ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
	    }
	    finally
	    {
	      con.fechar();
	      return(res);
	    }
	  }
	  
	  
	  
	  @SuppressWarnings("finally")
	  
	public ArrayList<Tipo_Produto> buscar()
	  {
	    ArrayList<Tipo_Produto> res = new ArrayList<Tipo_Produto>();
	    Conexao con = new Conexao();
	    String query = "SELECT codigo, nome , marca FROM codigo ORDER BY codigo";
	    
	    con.preparar(query);
	    try
	    {
	      ResultSet rs = con.getPstmt().executeQuery();
	      while (rs.next())
	      {
	    	  Tipo_Produto tipo = new Tipo_Produto();
	       tipo.setCodigo(rs.getInt("codigo"));
	        tipo.setNome(rs.getString("Nome"));
	        tipo.setMarca(rs.getString("Marca"));
	        res.add(tipo);
	      }
	    } catch (SQLException ex)
	    {
	      Logger.getLogger(Tipo_ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
	    }
	    finally
	    {
	      con.fechar();
	      return(res);
	    }
	  }
	  @SuppressWarnings("finally")
	  public Tipo_Produto buscar(int codigo)
	  {
		  Tipo_Produto res = null;
	    Conexao con = new Conexao(); //Abrindo Conecção
	    String query = "SELECT codigo, nome, marca FROM codigo WHERE codigo=?";
	    
	    con.preparar(query);
	    try
	    {
	      con.getPstmt().setInt(1, codigo);
	      ResultSet rs = con.getPstmt().executeQuery();
	      if (rs.next()) // passa para proxima linha do rs.net "tabela de resultados
	      {
	        res = new Tipo_Produto();
	        res.setCodigo(rs.getInt("Codigo"));
	        res.setNome(rs.getString("Nome"));
	        res.setMarca(rs.getString("Marca"));
	      }
	    } catch (SQLException ex)
	    {
	      Logger.getLogger(Tipo_ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
	    }
	    finally
	    {
	      con.fechar();
	      return(res);
	    }
	  }
	  
	  @SuppressWarnings("finally")
	public Tipo_Produto buscarPorMarca(String marca)
	  {
		  Tipo_Produto res = null;
	    Conexao con = new Conexao();
	    String query = "SELECT codigo, nome, marca FROM marca WHERE marca LIKE ?";
	    
	    con.preparar(query);
	    try
	    {
	      con.getPstmt().setString(1, "%"+marca+"%");
	      ResultSet rs = con.getPstmt().executeQuery();
	      if (rs.next())
	      {
	        res = new Tipo_Produto();
	        res.setCodigo(rs.getInt("codigo"));
	        res.setNome(rs.getString("Nome"));
	        res.setMarca(rs.getString("Marca"));
	      }
	    } catch (SQLException ex)
	    {
	      Logger.getLogger(Tipo_ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
	    }
	    finally
	    {
	      con.fechar();
	      return(res);
	    }
	  }
	}

	
