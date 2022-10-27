package strategy.pessoa;

public class Pessoa {

    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public void movimentar(Movimento movimento) throws InterruptedException {
        System.out.printf("%s iniciou o movimento\n", nome );
        movimento.movimentar();
        System.out.printf("%s terminou o trajeto", nome );
    }
}
