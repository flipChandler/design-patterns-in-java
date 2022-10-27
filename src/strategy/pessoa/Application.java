package strategy.pessoa;

public class Application {

    public static void main(String[] args) throws InterruptedException {
        Pessoa pessoa = new Pessoa("Chico da Estrada");
        pessoa.movimentar(new Caminhar(40));

        Pessoa pessoa2 = new Pessoa("Chico da Estrada");
        pessoa2.movimentar(new Correr(40));
    }
}
