public class Onibus extends Veiculo {
    private double velocidade = 60.0;
    private int num_paradas = 0;

    public Onibus(String modelo, float distancia, int num_paradas) {
        super(modelo, distancia);
        this.num_paradas = num_paradas;
    }
    @Override
    public double calcularTempo(){
        return (getDistancia()/ velocidade) * 60.0 + (num_paradas * 0.25);
    }
}
