package templatemethod.bebida;

public class Application {

    public static void main(String[] args) {
        Suco suco = new Suco();
        suco.preparar();
        System.out.println("----------------------------");
        Cha cha = new Cha();
        cha.preparar();
    }
}
