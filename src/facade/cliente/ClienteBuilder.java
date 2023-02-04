package facade.cliente;

public class ClienteBuilder {

    private Cliente cliente;

    public ClienteBuilder() {
        this.cliente = new Cliente();
    }

    public ClienteBuilder nome(String nome) {
        cliente.setNome(nome);
        return this;
    }

    public ClienteBuilder usuario(String usuario) {
        cliente.setUsuario(usuario);
        return this;
    }

    public ClienteBuilder email(String email) {
        cliente.setEmail(email);
        return this;
    }

    public Cliente build() {
        return this.cliente;
    }
}
