package facade.cliente;

public class AvatarService {

    private Cliente cliente;

    public AvatarService(Cliente cliente) {
        this.cliente = cliente;
    }

    public void remove() {
        System.out.println("Avatar do(a) " + cliente.getNome() + " foi removido(a)!");
    }
}
