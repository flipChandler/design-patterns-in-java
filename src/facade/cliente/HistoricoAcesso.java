package facade.cliente;

public class HistoricoAcesso {

    private Cliente cliente;

    public HistoricoAcesso(Cliente cliente) {
        this.cliente = cliente;
    }

    public void remove() {
        System.out.println("Os históricos de acesso do(a) " + cliente.getNome() + " foram removidos(as)!");
    }
}
