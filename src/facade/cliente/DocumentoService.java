package facade.cliente;

public class DocumentoService {

    private Cliente cliente;

    public DocumentoService(Cliente cliente) {
        this.cliente = cliente;
    }

    public void delete() {
        System.out.println("Documentos do(a) " + cliente.getNome() + " foram deletados!");
    }
}
