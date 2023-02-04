package facade.cliente;

public class ClienteFacade {

    private Cliente cliente;
    private Avatar avatar;
    private Documentos documentos;
    private HistoricoAcesso historicoAcesso;
    private Email email;
    private ClienteService clienteService;

    public ClienteFacade(Cliente cliente) {
        cliente = cliente;
        avatar = new Avatar(cliente);
        documentos = new Documentos(cliente);
        historicoAcesso = new HistoricoAcesso(cliente);
        email = new Email(cliente);
        clienteService = new ClienteService(cliente);
    }

    public void removeConta() {
        avatar.remove();
        documentos.delete();
        historicoAcesso.remove();
        clienteService.delete();
        email.envioRemocaoConta();
    }
}
