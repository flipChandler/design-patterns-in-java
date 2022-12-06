package templatemethod.imposto;

public class Icpp extends TemplateImpostoCondicional {

    @Override
    protected boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() > 500;
    }

    @Override
    protected double getMinimaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.05;
    }

    @Override
    protected double getMaximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.07;
    }
}
