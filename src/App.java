import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

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
            // Funcionario objFuncionario = new Funcionario(100,"Joaquim","joaquim@fatec",
            //     "321654","atendente");
            Funcionario objFuncionario = new Funcionario();
            FuncionarioData DAO = new FuncionarioData();
            String opcao = new String();
            do {
                opcao = JOptionPane.showInputDialog("Escolha uma opção:"+
                "\n1-Cadastrar Funcionário \n2-Listar Funcionários \n3-Excluir Funcionário \n4-Editar Funcionário \n5-Sair");
                switch (opcao) {
                    case "1":
                        objFuncionario.setId(Integer.parseInt(JOptionPane.showInputDialog("Digite o id")));
                        objFuncionario.setNome(JOptionPane.showInputDialog("Digite o nome"));
                        objFuncionario.setEmail(JOptionPane.showInputDialog("Digite o e-mail"));
                        objFuncionario.setSenha(JOptionPane.showInputDialog("Digite a senha"));
                        objFuncionario.setCargo(JOptionPane.showInputDialog("Digite o cargo"));
                        
                        if(DAO.incluir(objFuncionario))
                            System.out.println(Mensagens.MENSAGEM_SALVO);
                        else
                            System.out.println(Mensagens.MENSAGEM_ERRO);
                        break;
                    case "2":
                        System.out.println("-------------- LISTAGEM -----------------");
                        ArrayList<Funcionario> listagem = new ArrayList<>();
                        listagem = DAO.listar();
                        for (Funcionario funcionario : listagem) {
                            System.out.println("id: " + funcionario.getId() + " Nome: "+ funcionario.getNome() + 
                            " E-mail: "+funcionario.getEmail() +
                            " Senha: " + funcionario.getSenha() +
                            " Cargo: " + funcionario.getCargo());
                        }
                        break;
                    case "3":
                        int id = Integer.parseInt(JOptionPane.showInputDialog("Digite o id"));
                        if(DAO.excluir(id))
                            System.out.println("Excluído com sucesso!");
                        else
                            System.out.println("Problemas ao excluir");
                        break;
                    case "4": //primeiro estamos listando os registros
                        System.out.println("-------------- LISTAGEM -----------------");
                        ArrayList<Funcionario> listagem2 = new ArrayList<>();
                        listagem2 = DAO.listar();
                        for (Funcionario funcionario : listagem2) {
                            System.out.println("id: " + funcionario.getId() + " Nome: "+ funcionario.getNome() + 
                            " E-mail: "+funcionario.getEmail() +
                            " Senha: " + funcionario.getSenha() +
                            " Cargo: " + funcionario.getCargo());
                        }
                        int idEdicao = Integer.parseInt(JOptionPane.showInputDialog("Digite o id para editar o registro"));
                        objFuncionario = DAO.obter(idEdicao);
                        objFuncionario.setNome(JOptionPane.showInputDialog("Digite o nome",objFuncionario.getNome()));
                        objFuncionario.setEmail(JOptionPane.showInputDialog("Digite o e-mail",objFuncionario.getEmail()));      
                        objFuncionario.setSenha(JOptionPane.showInputDialog("Digite a senha",objFuncionario.getSenha()));
                        objFuncionario.setCargo(JOptionPane.showInputDialog("Digite o cargo",objFuncionario.getCargo()));
                        DAO.alterar(objFuncionario);
                        System.out.println("Alterado com sucesso!");
                        break;
                    case "5":
                        
                        break;
                    default:
                        break;
                }
            } while (!opcao.equals("5"));
            
            
        } catch(Exception erro){
            System.out.println("Erro: "+ erro.getMessage());
        }
    }
}
