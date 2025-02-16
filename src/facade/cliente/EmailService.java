package facade.cliente;

public class EmailService {

    private Cliente cliente;

    public EmailService(Cliente cliente) {
        this.cliente = cliente;
    }

    public void envioRemocaoConta() {
        System.out.println("Enviando e-mail notificando a remoção da conta do(a) " + cliente.getNome());
    }
}
