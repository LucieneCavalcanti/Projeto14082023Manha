package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    private Connection conexao;
    public Conexao() throws Exception{
        String url="jdbc:sqlserver://localhost:1433;databaseName=bdExemploManha";
        String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String usuarioBanco="UsuarioJava";
        String senhaBanco = "Fatec2023";
        Class.forName(driver);
        conexao = DriverManager.getConnection(url, usuarioBanco, senhaBanco);
        System.out.println("Conectado");
    }
    public Connection getConexao(){
        return conexao;
    }
    public boolean fecharConexao() throws SQLException{
        conexao.close();
        return true;
    }
}
