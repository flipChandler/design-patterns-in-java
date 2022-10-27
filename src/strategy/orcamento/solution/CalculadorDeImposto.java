package strategy.orcamento.solution;

public class CalculadorDeImposto {

    private ImpostoStrategy imposto;

    public CalculadorDeImposto(ImpostoStrategy impostoStrategy) {
        this.imposto = impostoStrategy;
    }

    public void calcularImpostoSobre(Orcamento orcamento) {
        double valorImposto = imposto.calcula(orcamento);
        System.out.println(valorImposto);
    }
}
