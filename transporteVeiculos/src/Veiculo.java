public class Veiculo {
    private String modelo;
    private float distancia;

    public Veiculo(String modelo, float distancia) {
        this.modelo = modelo;
        this.distancia = distancia;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getDistancia() {
        return distancia;
    }

    public void setDistancia(float distancia) {
        this.distancia = distancia;
    }

    public double calcularTempo(){
        return 0;
    }

}
