package templatemethod.imposto;

public class Icms implements ImpostoStrategy {

    @Override
    public double calcula(Orcamento orcamento) {
        return orcamento.getValor() * 0.1;
    }
}
