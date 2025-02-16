package facade.cliente;

public class ClienteFacade {

    private Cliente cliente;
    private AvatarService avatarService;
    private DocumentoService documentoService;
    private HistoricoAcessoService historicoAcessoService;
    private EmailService emailService;
    private ClienteService clienteService;

    public ClienteFacade(Cliente cliente) {
        cliente = cliente;
        avatarService = new AvatarService(cliente);
        documentoService = new DocumentoService(cliente);
        historicoAcessoService = new HistoricoAcessoService(cliente);
        emailService = new EmailService(cliente);
        clienteService = new ClienteService(cliente);
    }

    public void removeConta() {
        avatarService.remove();
        documentoService.delete();
        historicoAcessoService.remove();
        clienteService.delete();
        emailService.envioRemocaoConta();
    }
}
