package facade.cliente;

public class Email {

    private Cliente cliente;

    public Email(Cliente cliente) {
        this.cliente = cliente;
    }

    public void envioRemocaoConta() {
        System.out.println("Enviando e-mail notificando a remoção da conta do(a) " + cliente.getNome());
    }
}
