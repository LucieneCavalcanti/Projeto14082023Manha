package data;

import java.util.ArrayList;

import model.Funcionario;

public interface CRUD {
    public boolean incluir(Funcionario obj) throws Exception;
    public boolean alterar(Funcionario obj) throws Exception;
    public boolean excluir(int id) throws Exception;
    public Funcionario obter(int id) throws Exception;
    public ArrayList<Funcionario> listar() throws Exception;
    public ArrayList<Funcionario> listar(String pesquisa) throws Exception;
}
