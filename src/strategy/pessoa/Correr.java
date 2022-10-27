package strategy.pessoa;

public class Correr implements Movimento {

    private int distancia;

    public Correr(int distancia) {
        this.distancia = distancia;
    }

    @Override
    public void movimentar() throws InterruptedException {
        int distanciaAtual = 0;

        while (distanciaAtual < distancia) {
            distanciaAtual++;

            Thread.sleep(150);

            System.out.printf("Distancia percorrida: %d m\n", distanciaAtual);
        }
    }
}
