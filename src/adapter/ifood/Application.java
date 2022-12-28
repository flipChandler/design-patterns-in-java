package adapter.ifood;

public class Application {

    public static void main(String[] args) {
        var ifood = new Ifood();
        ifood.adicionarItens(new Comida());
        ifood.adicionarItens(new Comida());

        // adapter Doce em adicionar em Ifood
        ifood.adicionarItens(new DoceriaComidaAdapter(new Doce()));
    }
}
