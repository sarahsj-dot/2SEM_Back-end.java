//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    Carro car = new Carro("Honda", "Civic", "prata");
    Veiculos v1 = new Veiculos("", "", "");

        Veiculos v2 = v1;
        v2.iniciarVeiculo();

        System.out.println("    ");
        System.out.println(car.getMarca() + "  " + car.getModelo() + "  " + car.getCor());
        car.iniciarVeiculo();

    }
}