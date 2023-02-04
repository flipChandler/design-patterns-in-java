package facade.cliente;

public class Documentos {

    private Cliente cliente;

    public Documentos(Cliente cliente) {
        this.cliente = cliente;
    }

    public void delete() {
        System.out.println("Documentos do(a) " + cliente.getNome() + " foram deletados!");
    }
}
