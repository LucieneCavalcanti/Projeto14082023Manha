package data;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.Funcionario;

public class FuncionarioData extends Conexao implements CRUD{

    public FuncionarioData() throws Exception {
        super();
        //TODO Auto-generated constructor stub
    }

    @Override
    public boolean incluir(Funcionario obj) throws Exception {
        CallableStatement callable = getConexao().
            prepareCall("{call cadastrarFuncionario (?,?,?,?)}");
        callable.setString(1, obj.getNome());
        callable.setString(2, obj.getEmail());
        callable.setString(3, obj.getSenha());
        callable.setString(4, obj.getCargo());
        int registros = callable.executeUpdate();
        if (registros==1) return true;
        else return false;
    }

    @Override
    public boolean alterar(Funcionario obj) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'alterar'");
    }

    @Override
    public boolean excluir(int id) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'excluir'");
    }

    @Override
    public Funcionario obter(int id) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'obter'");
    }

    @Override
    public ArrayList<Funcionario> listar() throws Exception {
        String sql="select * from Pessoas,Funcionarios where Pessoas.id=Funcionarios.idPessoa";  
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ResultSet dados = ps.executeQuery();
        ArrayList<Funcionario> lista = new ArrayList<>();
        while(dados.next()){
            Funcionario obj = new Funcionario();
            obj.setId(dados.getInt("id"));
            obj.setNome(dados.getString("nome"));
            obj.setEmail(dados.getString("email"));
            obj.setSenha(dados.getString("senha"));
            obj.setCargo(dados.getString("cargo"));
            lista.add(obj);
        }
        return lista;
    }

    @Override
    public ArrayList<Funcionario> listar(String pesquisa) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listar'");
    }
    
}
