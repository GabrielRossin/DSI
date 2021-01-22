package br.edu.ifsp.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.edu.ifsp.conexao.Conexao;
import br.edu.ifsp.modelo.Pessoa;

public class PessoaDAO {
	
	public Conexao con = null;

	public void salvarPessoa(Pessoa pessoa) {
		
		try {
		
			this.con = Conexao.getInstance();
		
			String sql = "insert into pessoa (id ,nomecompleto, idade) values (pessoa_seq.nextval ,?, ?)";
			PreparedStatement pstm = con.getConnection().prepareStatement(sql);
			pstm.setInt(2, pessoa.getIdade());
			pstm.setString(1, pessoa.getNome());
			pstm.executeUpdate();
			
			System.out.println("Foi inserido com sucesso");
			
		} catch(SQLException e) {
			
			System.out.println("Problema ao inserir uma pessoa");
			e.printStackTrace();
		}	
	}
	
	public ArrayList<Pessoa> consultarTodos() {
		
		ArrayList<Pessoa> listaPessoas = new ArrayList<Pessoa>();
		
		try {
			
			this.con = Conexao.getInstance();
			
			String sql = "SELECT * FROM pessoa";
			
			PreparedStatement pstm = con.getConnection().prepareStatement(sql);
			ResultSet rs = pstm.executeQuery();
			
			while(rs.next()) {
				
				Pessoa p = new Pessoa();
				p.setId(rs.getInt("id"));
				p.setNome(rs.getString("nomecompleto"));
				p.setIdade(rs.getInt("idade"));
				
				listaPessoas.add(p);
			}
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
			
		return listaPessoas;
	}
	
	public void editarPessoaPorId(int id , Pessoa pessoa) 
	{
		try {
			
			this.con = Conexao.getInstance();
		
			String sql = "Update pessoa set nomecompleto = ? , idade = ? where id = ?";
			PreparedStatement pstm = con.getConnection().prepareStatement(sql);
			pstm.setString(1,pessoa.getNome());
			pstm.setInt(2, pessoa.getIdade());
			pstm.setInt(3 , id);
			pstm.executeUpdate();
			
			System.out.println("Foi alterado com sucesso");
			
		} catch(SQLException e) {
			
			System.out.println("Problema ao alterar uma pessoa");
			e.printStackTrace();
		}	
		
		
	}
	
	public void removerPessoaPorId(int id) 
	{
			
		try {
			
				this.con = Conexao.getInstance();
		
				String sql = "Delete from pessoa where id = ?";
				PreparedStatement pstm = con.getConnection().prepareStatement(sql);
				pstm.setInt(1 , id);
				pstm.executeUpdate();
			
			System.out.println("Foi removido com sucesso");
			
			
		} catch(SQLException e) {
			
			System.out.println("Problema ao remover uma pessoa");
			e.printStackTrace();
		}	
		
	}
	
	public Pessoa  consultarPessoaPorId(int id) 
	{
		
		
		Pessoa p = new Pessoa();
		try 
		
		{
			
			this.con = Conexao.getInstance();
			
			String sql = "SELECT * FROM pessoa where id = ?";
			PreparedStatement pstm = con.getConnection().prepareStatement(sql);
			
			pstm.setInt(1 , id);
			ResultSet rs = pstm.executeQuery();
			
		
			
			
            String nomeCompleto = "";
            int idade = 0;

            if(rs.next()) {
                id = rs.getInt("id");
                nomeCompleto = rs.getString("nomecompleto");
                idade = rs.getInt("idade");
                p = new Pessoa(id, nomeCompleto, idade);
            }
						
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
			
		return p;
		
	}
	
	

	
}
