package facade.cliente;

public class ClienteService {

    private Cliente cliente;

    public ClienteService(Cliente cliente) {
        this.cliente = cliente;
    }

    public boolean delete() {
        System.out.println(cliente.getNome() + " foi removido(a) do banco de dados com sucesso!");
        return true;
    }
}
