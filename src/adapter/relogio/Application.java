package adapter.relogio;

public class Application {

    // adater => adapta interfaces antigas a interfaces novas
    public static void main(String[] args) {

        var relogio = new RelogioDoSistema();
        var dataAtual = relogio.hoje();
        System.out.println(dataAtual);
    }
}
