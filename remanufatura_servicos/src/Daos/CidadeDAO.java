
package Daos;

import Bens.Cidade;
import Bens.Uf;
import Conexao.Conexao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class CidadeDAO
{
  @SuppressWarnings("finally")
public boolean excluir(Cidade cidade)
  {
    boolean res = false;
    Conexao con = new Conexao();
    String query = "DELETE FROM Cidade WHERE codigo=?";
    
    con.preparar(query);
    try
    {
      con.getPstmt().setInt(1, cidade.getCodigo());        		  
      res = con.executeUpdate();
    } catch (SQLException ex)
    {
      Logger.getLogger(CidadeDAO.class.getName()).log(Level.SEVERE, null, ex);
    }
    finally
    {
      con.fechar();
      return(res);
    }
  }
  
  @SuppressWarnings("finally")
public boolean inserir(Cidade cidade)
  {
    boolean res = false;
    Conexao con = new Conexao();
    String query = "INSERT INTO cidade (nome, uf) "
            + "VALUES (?, ?)";
    
    con.preparar(query);
    try
    {
      con.getPstmt().setString(1, cidade.getNome());
      con.getPstmt().setString(2, cidade.getUf().getUf());
      res = con.executeUpdate();
    } catch (SQLException ex)
    {
      Logger.getLogger(CidadeDAO.class.getName()).log(Level.SEVERE, null, ex);
    }
    finally
    {
      con.fechar();
      return(res);
    }
  }
  
  @SuppressWarnings("finally")
public boolean atualizar(Cidade cidade)
  {
    boolean res = false;
    Conexao con = new Conexao();
    String query = "UPDATE cidade SET nome=?, uf=? "
            + "WHERE codigo=?";
    
    con.preparar(query);
    try
    {
      con.getPstmt().setString(1, cidade.getNome());
      con.getPstmt().setString(2, cidade.getUf().getUf());
      con.getPstmt().setInt(3, cidade.getCodigo());
      res = con.executeUpdate();
    } catch (SQLException ex)
    {
      Logger.getLogger(CidadeDAO.class.getName()).log(Level.SEVERE, null, ex);
    }
    finally
    {
      con.fechar();
      return(res);
    }
  }
  
  @SuppressWarnings("finally")
public ArrayList<Cidade> buscar()
  {
    ArrayList<Cidade> res = new ArrayList<Cidade>();
    Conexao con = new Conexao();
    String query = "SELECT codigo, nome, uf "
            + "FROM cidade ORDER BY nome";
    
    con.preparar(query);
    try
    {
      ResultSet rs = con.getPstmt().executeQuery();
      while (rs.next())
      {
        Cidade cidade = new Cidade();
        cidade.setCodigo(rs.getInt("codigo"));
        cidade.setNome(rs.getString("nome"));
        
        UfDAO ufdao = new UfDAO();
        Uf uf = ufdao.buscar(rs.getString("uf"));
        
        cidade.setUf(uf);
        res.add(cidade);
      }
    } catch (SQLException ex)
    {
      Logger.getLogger(CidadeDAO.class.getName()).log(Level.SEVERE, null, ex);
    }
    finally
    {
      con.fechar();
      return(res);
    }
  }
  
  @SuppressWarnings("finally")
public ArrayList<Cidade> buscar(Uf uf)
  {
    ArrayList<Cidade> res = new ArrayList<Cidade>();
    Conexao con = new Conexao();
    String query = "SELECT codigo, nome, uf "
            + "FROM cidade WHERE uf=? ORDER BY nome";
    
    con.preparar(query);
    try
    {
      con.getPstmt().setString(1, uf.getUf());
      ResultSet rs = con.getPstmt().executeQuery();
      while (rs.next())
      {
        Cidade cidade = new Cidade();
        cidade.setCodigo(rs.getInt("codigo"));
        cidade.setNome(rs.getString("nome"));
        cidade.setUf(uf);
        res.add(cidade);
      }
    } catch (SQLException ex)
    {
      Logger.getLogger(CidadeDAO.class.getName()).log(Level.SEVERE, null, ex);
    }
    finally
    {
      con.fechar();
      return(res);
    }
  }
  
  @SuppressWarnings("finally")
public ArrayList<Cidade> buscar(String uf)
  {
    ArrayList<Cidade> res = new ArrayList<Cidade>();
    Conexao con = new Conexao();
    String query = "SELECT codigo, nome, uf "
            + "FROM cidade WHERE uf=? ORDER BY nome";
    
    con.preparar(query);
    try
    {
      con.getPstmt().setString(1, uf);
      ResultSet rs = con.getPstmt().executeQuery();
      while (rs.next())
      {
        Cidade cidade = new Cidade();
        cidade.setCodigo(rs.getInt("codigo"));
        cidade.setNome(rs.getString("nome"));
        
        UfDAO ufdao = new UfDAO();
        Uf u = ufdao.buscar(uf);
        cidade.setUf(u);
        res.add(cidade);
      }
    } catch (SQLException ex)
    {
      Logger.getLogger(CidadeDAO.class.getName()).log(Level.SEVERE, null, ex);
    }
    finally
    {
      con.fechar();
      return(res);
    }
  }
  
  @SuppressWarnings("finally")
public Cidade buscar(int codigo)
  {
    Cidade res = null;
    Conexao con = new Conexao();
    String query = "SELECT codigo, nome, uf "
            + "FROM cidade WHERE codigo=?";
    
    con.preparar(query);
    try
    {
      con.getPstmt().setInt(1, codigo);
      ResultSet rs = con.getPstmt().executeQuery();
      if (rs.next())
      {
        res = new Cidade();
        res.setCodigo(rs.getInt("codigo"));
        res.setNome(rs.getString("nome"));
        
        UfDAO ufdao = new UfDAO();
        Uf u = ufdao.buscar(rs.getString("uf"));
        
        res.setUf(u);
      }
    } catch (SQLException ex)
    {
      Logger.getLogger(CidadeDAO.class.getName()).log(Level.SEVERE, null, ex);
    }
    finally
    {
      con.fechar();
      return(res);
    }
  }
  
  @SuppressWarnings("finally")
public Cidade buscarPorNome(String nome)
  {
    Cidade res = null;
    Conexao con = new Conexao();
    String query = "SELECT codigo, nome, uf "
            + "FROM cidade WHERE nome LIKE ?";
    
    con.preparar(query);
    try
    {
      con.getPstmt().setString(1, "%"+nome+"%");
      ResultSet rs = con.getPstmt().executeQuery();
      if (rs.next())
      {
        res = new Cidade();
        res.setCodigo(rs.getInt("codigo"));
        res.setNome(rs.getString("nome"));
        
        UfDAO ufdao = new UfDAO();
        Uf u = ufdao.buscar(rs.getString("uf"));
        
        res.setUf(u);
      }
    } catch (SQLException ex)
    {
      Logger.getLogger(CidadeDAO.class.getName()).log(Level.SEVERE, null, ex);
    }
    finally
    {
      con.fechar();
      return(res);
    }
  }
}
