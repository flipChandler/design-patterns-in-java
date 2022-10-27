package strategy.pessoa;

public class Caminhar implements Movimento {

    private int distancia;

    public Caminhar(int distancia) {
        this.distancia = distancia;
    }

    @Override
    public void movimentar() throws InterruptedException {
        int distanciaAtual = 0;

        while (distanciaAtual < distancia) {
            distanciaAtual++;

            Thread.sleep(600);

            if (distanciaAtual % 20 == 0) {
                Thread.sleep(300);
                System.out.println("Parada para descanso");
            }

            System.out.printf("Distancia percorrida: %d m\n", distanciaAtual);
        }
    }
}
