public class Carro extends Veiculo{
    private double velocidade = 80.0;

    public Carro(String modelo, float distancia) {
        super(modelo, distancia);
    }
    @Override
    public double calcularTempo(){
    return (getDistancia() / velocidade) * 60.0; //aqui eu me inspirei (U_U) em meu amigo miguel
        // para calcular o tempo também em minutos
    }
}
