package templatemethod.imposto;

public abstract class TemplateImpostoCondicional implements ImpostoStrategy {

    // template method, faz parte do processo e outra parte ele delega para as classes filhas
    @Override
    public double calcula(Orcamento orcamento) {
        return deveUsarMaximaTaxacao(orcamento)
                ? getMaximaTaxacao(orcamento)
                : getMinimaTaxacao(orcamento);
    }

    // metodos implementados pelas classes filhas
    protected abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);
    protected abstract double getMaximaTaxacao(Orcamento orcamento);
    protected abstract double getMinimaTaxacao(Orcamento orcamento);
}
