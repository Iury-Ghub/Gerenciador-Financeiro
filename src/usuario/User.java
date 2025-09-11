package usuario;

public class User {
    private String email;
    private String senha;
    private String nome;
    private int idade;
    private String usuario;

    public User(String email,String senha,String nome,int idade,String usuario) {
        this.email = email;
        this.senha = senha;
        this.nome = nome;
        this.idade = idade;
        this.usuario = usuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
}
