package model;

public abstract class Pessoa implements Usuario, Mensagens {
    private int id;
    private String nome;
    private String email;
    private String senha;
    public int getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public String getEmail() {
        return email;
    }
    public String getSenha() {
        return senha;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public Pessoa(){
        id = 0;
        nome = new String();
        email = new String();
        senha = new String();
    }
    public Pessoa(int id, String nome, String email, String senha){
        this.id=id;
        this.nome=nome;
        this.email=email;
        this.senha=senha;
    }
}
