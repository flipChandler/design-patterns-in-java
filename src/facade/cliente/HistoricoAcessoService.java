package facade.cliente;

public class HistoricoAcessoService {

    private Cliente cliente;

    public HistoricoAcessoService(Cliente cliente) {
        this.cliente = cliente;
    }

    public void remove() {
        System.out.println("Os históricos de acesso do(a) " + cliente.getNome() + " foram removidos(as)!");
    }
}
