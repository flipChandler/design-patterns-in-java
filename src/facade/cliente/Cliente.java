package facade.cliente;

public class Cliente {

    private String nome;
    private String usuario;
    private String email;

    public Cliente() {
    }

    public Cliente(String nome, String usuario, String email) {
        this.nome = nome;
        this.usuario = usuario;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
