package model;

public class Funcionario extends Pessoa {
    private String cargo;
    @Override
    public boolean validarLogin() {
        if(getEmail().equals("luciene@fatec")&&
        getSenha().equalsIgnoreCase("Fatec"))
            return LOGIN_OK;
        else
            return LOGIN_ERRO;
    }
    public Funcionario(){}
    public Funcionario(int id, String nome, 
        String email, String senha, String cargo){
            super(id, nome, email, senha);
            this.cargo = cargo;
        }
}
