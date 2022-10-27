package strategy.seguro;

public enum ETipoVeiculo {

    CARRO {
        public CalculadoraFranquiaSeguro getCalculadora() {
            return new CalculadoraFranquiaSeguroCarro();
        }
    } ,
    MOTO {
        public CalculadoraFranquiaSeguro getCalculadora() {
            return new CalculadoraFranquiaSeguroMoto();
        }
    };

    // abstract method in an enum class, it's mandatory to implement this method in each attribute
    public abstract CalculadoraFranquiaSeguro getCalculadora();
}
