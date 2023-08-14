package data;

import java.util.ArrayList;

import model.Funcionario;

public class FuncionarioData extends Conexao implements CRUD{

    public FuncionarioData() throws Exception {
        super();
        //TODO Auto-generated constructor stub
    }

    @Override
    public boolean incluir(Funcionario obj) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'incluir'");
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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listar'");
    }

    @Override
    public ArrayList<Funcionario> listar(String pesquisa) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listar'");
    }
    
}
