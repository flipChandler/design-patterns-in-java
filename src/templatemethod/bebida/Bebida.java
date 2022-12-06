package templatemethod.bebida;

public abstract class Bebida {

    // template method, faz parte do processo e outra parte ele delega para as classes filhas
    public void preparar() {
        adicionarAgua();
        adicionarSubstancia();
        
        if (colocarAcucar()) {
            adicionarAcucar();
        }
        
        mexer();
    }

    // metodos implementados pelas classes filhas
    protected abstract void adicionarAgua();
    protected abstract void adicionarSubstancia();
    protected abstract void adicionarAcucar();
    protected abstract void mexer();
    protected abstract boolean colocarAcucar();
}
