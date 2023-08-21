package data;

public class TesteConexao {
    public static void main(String[] args) {
        try {
           Conexao con = new Conexao(); 
        } catch (Exception e) {
            System.out.println("ERRO:" + e.getMessage());
        }
    }
}
