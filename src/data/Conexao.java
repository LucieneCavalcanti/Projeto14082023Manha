package data;

import java.sql.Connection;
import java.sql.SQLException;

public class Conexao {
    private Connection conexao;
    public Conexao() throws Exception{

    }
    public Connection getConexao(){
        return conexao;
    }
    public boolean fecharConexao() throws SQLException{
        conexao.close();
        return true;
    }
}
