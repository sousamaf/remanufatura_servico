
package Daos;
import Bens.Pessoa;
import Bens.Cidade;
import Conexao.Conexao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;




public class PessoaDAO
{
  @SuppressWarnings("finally")
public boolean excluir(Pessoa pessoa)
  {
    boolean res = false;
    Conexao con = new Conexao();
    String query = "DELETE FROM Pessoa WHERE codigo=?";
    
    con.preparar(query);
    try
    {
      con.getPstmt().setInt(1, pessoa.getCodigo());        		  
      res = con.executeUpdate();
    } catch (SQLException ex)
    {
      Logger.getLogger(PessoaDAO.class.getName()).log(Level.SEVERE, null, ex);
    }
    finally
    {
      con.fechar();
      return(res);
    }
  }
  
  @SuppressWarnings("finally")
public boolean inserir(Pessoa pessoa)
  {
    boolean res = false;
    Conexao con = new Conexao();
    String query = "INSERT INTO pessao (codigo, nome, email, telefone, data_cadastro, endereco) "
            + "VALUES (?, ?,?,?,?,?)";
    
    con.preparar(query);
    try
    {
      con.getPstmt().setInt(1, pessoa.getCodigo());
      con.getPstmt().setString(2, pessoa.getNome());
      con.getPstmt().setString(3, pessoa.getEmail());
      con.getPstmt().setInt(4,pessoa.getTelefone());
    //  con.getPstmt().setLong(5,pessoa.getData_cadastro());    
      con.getPstmt().setInt(6,pessoa.getEndereco().getCodigo());
      res = con.executeUpdate();
    } catch (SQLException ex)
    {
      Logger.getLogger(PessoaDAO.class.getName()).log(Level.SEVERE, null, ex);
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
      Logger.getLogger(PessoaDAO.class.getName()).log(Level.SEVERE, null, ex);
    }
    finally
    {
      con.fechar();
      return(res);
    }
  }
  
  @SuppressWarnings("finally")
public ArrayList<Pessoa> buscar()
  {
    ArrayList<Pessoa> res = new ArrayList<Pessoa>();
    Conexao con = new Conexao();
    String query = "SELECT codigo, nome, email,telefone,Data_cadastro, endereco "
            + "FROM Pessoa ORDER BY nome";
    
    con.preparar(query);
    try
    {
      ResultSet rs = con.getPstmt().executeQuery();
      while (rs.next())
      {
        Pessoa pessoa = new Pessoa();
        pessoa.setCodigo(rs.getInt("codigo"));
        pessoa.setNome(rs.getString("nome"));
        pessoa.setEmail(rs.getString("Email"));
        pessoa.setTelefone(rs.getInt("Telefone"));
        Calendar aux1 = new GregorianCalendar();
        aux1.setTimeInMillis(rs.getLong("Data de Cardastro"));
        pessoa.setData_cadastro(aux1);
       
       // EnderecoDAO enderecodao = new EnderecoDAO();
       // Endereco endereco = enderecodao.buscar(rs.getString("Endereco"));
        
        
        	res.add(pessoa);
      }
    } catch (SQLException ex)
    {
      Logger.getLogger(PessoaDAO.class.getName()).log(Level.SEVERE, null, ex);
    }
    finally
    {
      con.fechar();
      return(res);
    }
  }
  
  @SuppressWarnings("finally")
public ArrayList<Pessoa>  Pessoa_buscaNome (Pessoa pessoa)
  {
    ArrayList<Pessoa> res = new ArrayList<Pessoa>();
    Conexao con = new Conexao();
    String query = "SELECT codigo, nome, email,telefone,Data_cadastro, endereco "
            + "FROM Pessoa  WHERE Nome? ORDER BY codigo";
    
    con.preparar(query);
    try
    {
      con.getPstmt().setString(1, pessoa.getNome());
      ResultSet rs = con.getPstmt().executeQuery();
      while (rs.next())
      {
    	 Pessoa pessoa1 = new Pessoa();
         pessoa1.setCodigo(rs.getInt("codigo"));
         pessoa1.setNome(rs.getString("nome"));
         pessoa1.setEmail(rs.getString("Email"));
         pessoa1.setTelefone(rs.getInt("Telefone"));
         Calendar aux1 = new GregorianCalendar();
         aux1.setTimeInMillis(rs.getLong("Data de Cardastro"));
         pessoa.setData_cadastro(aux1);
         // EnderecoDAO enderecodao = new EnderecoDAO();
         // Endereco endereco = enderecodao.buscar(rs.getString("Endereco"));
          res.add(pessoa1);
      }
    } catch (SQLException ex)
    {
      Logger.getLogger(PessoaDAO.class.getName()).log(Level.SEVERE, null, ex);
    }
    finally
    {
      con.fechar();
      return(res);
    }
  }
  
  @SuppressWarnings("finally")
  public Pessoa busca_fisica(int cpf)  {
    Pessoa res =  null;
    Conexao con = new Conexao();
    String query = "SELECT p.codigo, p.nome, p.email,p.telefone,p.Data_cadastro, p.endereco f.cpf, f.sexo"
            + "FROM Pessoa p , Fisico  f "
            + "WHERE p.codigo=f.cpf "
            + "AND f.cpf=?";
    con.preparar(query);
    try
    {
      con.getPstmt().setInt(1, cpf);
      ResultSet rs = con.executeQuery();
      if (rs.next())
      {
        res = new Pessoa();
        res.setCpf(rs.getInt("cpf"));
        								//adicionar os outros campos
      }
    } catch (SQLException ex)
    {
      Logger.getLogger(PessoaDAO.class.getName()).log(Level.SEVERE, null, ex);
    }
    finally
    {
      con.fechar();
      return(res);
    }
  }
}
  