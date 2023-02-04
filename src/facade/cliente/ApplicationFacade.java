package facade.cliente;

public class ApplicationFacade {

    public static void main(String[] args) {
        Cliente cliente = new ClienteBuilder()
                .nome("Felipe")
                .usuario("flipChandler")
                .email("felipe.santos11@hotmail.com")
                .build();

        ClienteFacade facade = new ClienteFacade(cliente);
        facade.removeConta();
    }
}
