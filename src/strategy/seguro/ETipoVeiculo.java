package strategy.seguro;

public enum ETipoVeiculo {

    CARRO {
        public CalculadoraFranquiaSeguro getCalculadora() {
            return new FranquiaSeguroCarro();
        }
    } ,
    MOTO {
        public CalculadoraFranquiaSeguro getCalculadora() {
            return new FranquiaSeguroMoto();
        }
    };

    // abstract method in an enum class, it's mandatory to implement this method in each attribute
    public abstract CalculadoraFranquiaSeguro getCalculadora();
}
