package facade.cliente;

public class Avatar {

    private Cliente cliente;

    public Avatar(Cliente cliente) {
        this.cliente = cliente;
    }

    public void remove() {
        System.out.println("Avatar do(a) " + cliente.getNome() + " foi removido(a)!");
    }
}
