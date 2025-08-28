public class Carro extends Veiculos{

    public Carro(String marca, String modelo, String cor) {
        super(marca, modelo, cor);
    }

    @Override
    public void iniciarVeiculo(){
        System.out.println("Carro está iniciando...");
    }

}
