import java.util.Scanner;

import data.FuncionarioData;
import model.Funcionario;
import model.Mensagens;

public class App {
    public static void main(String[] args) {
        //Scanner entrada = new Scanner(System.in);
        // System.out.println("Digite seu e-mail:");
        // String email = entrada.nextLine();
        // System.out.println("Digite a senha");
        // String senha = entrada.nextLine();
        // Funcionario objFuncionario = new Funcionario();
        // objFuncionario.setEmail(email);
        // objFuncionario.setSenha(senha);
        // System.out.println(objFuncionario.validarLogin());
        try{
            Funcionario objFuncionario = new Funcionario(100,"Joaquim","joaquim@fatec",
                "321654","atendente");
            FuncionarioData DAO = new FuncionarioData();
            if(DAO.incluir(objFuncionario))
                System.out.println(Mensagens.MENSAGEM_SALVO);
            else
                System.out.println(Mensagens.MENSAGEM_ERRO);
        } catch(Exception erro){
            System.out.println("Erro: "+ erro.getMessage());
        }
    }
}
