package templatemethod.bebida;

public class Suco extends Bebida {

    @Override
    protected void adicionarAgua() {
        System.out.println("Adiciona agua ao suco...");
    }

    @Override
    protected void adicionarSubstancia() {
        System.out.println("Adiciona suco...");
    }

    @Override
    protected void adicionarAcucar() {
        System.out.println("Adiciona acucar ao suco...");
    }

    @Override
    protected void mexer() {
        System.out.println("Mexendo o suco...");
    }

    @Override
    protected boolean colocarAcucar() {
        return true;
    }
}
