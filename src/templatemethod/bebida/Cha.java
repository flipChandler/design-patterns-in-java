package templatemethod.bebida;

public class Cha extends Bebida {

    @Override
    protected void adicionarAgua() {
        System.out.println("Adiciona agua ao cha...");
    }

    @Override
    protected void adicionarSubstancia() {
        System.out.println("Adiciona cha...");
    }

    @Override
    protected void adicionarAcucar() {

    }

    @Override
    protected void mexer() {
        System.out.println("Mexendo o cha...");
    }

    @Override
    protected boolean colocarAcucar() {
        return false;
    }
}
