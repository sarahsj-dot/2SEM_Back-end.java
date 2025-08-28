public class Bicicleta extends Veiculo {
    private double velocidade = 20.0;


    public Bicicleta(String modelo, float distancia) {
        super(modelo, distancia);
    }
    @Override
    public double calcularTempo(){
        return (getDistancia()/ velocidade) * 60.0;
    }
}
