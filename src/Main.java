import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean run = true; //var de início do programa

        //programa com modo interativo (while + switch) e
        //modo comparativo (ArrayList)

        while (run) {
            System.out.println("\nSistema de Transporte de Veiculos");
            System.out.println("1 - Para calcular o tempo de viagem de um veículo por vez " +
                    "\n2 - Para calcular todos os veículos de uma vez" +
                    "\n0 - Encerrar programa");
            int menu = sc.nextInt();

        switch (menu) {
           case 1://modo interativo
           boolean runing = true;
             while (runing) {
             System.out.println("\nDigite a distância do percurso (km): ");
             float dist = sc.nextFloat();

             System.out.println("Veículos: " +
                                "\n1- Carro;" +
                                "\n2- Bicicleta;" +
                                "\n3- Ônibus;" +
                                "\n0- Voltar"); //volta para o menu
             int option = sc.nextInt();
             Veiculo v = null; //var para armazenar a opção do user

              switch (option) {
              case 1:
              v = new Carro("Honda Civic", dist);
              break;
              case 2:
              v = new Bicicleta("Oggi", dist);
              break;
              case 3:
              System.out.println("Informe o número de paradas do ônibus: ");
              int paradas = sc.nextInt();
              v = new Onibus("Mercedes", dist, paradas);
              break;
              case 0:
              runing = false;
              continue;//instrução de controle de loop, diferente do break,
              // tudo o que tiver depois do continue dentro do loop, é ignorado
              default:
              System.out.println("Opção incorreta, tente novamente");
              continue;//vai fazer o loop reiniciar imediatamente e
              // voltar ao menu sem rodar nada a mais
              }
              if (v != null) {
              System.out.printf("\nTempo de viagem com %s: %.2f\n",
                                    v.getModelo(), v.calcularTempo());
              }

           }
           break;

        case 2://Modo comparativo com ArrayList
            System.out.println("Digite a distancia do percurso (km): ");
            float distCompare = sc.nextFloat();
            System.out.println("Digite quantas paradas do onibus: ");
            int paradas = sc.nextInt();

            ArrayList<Veiculo> v2 = new ArrayList<>();
            v2.add(new Carro("Honda Civic", distCompare));
            v2.add(new Bicicleta("Oggi", distCompare));
            v2.add(new Onibus("Mercedes", distCompare, paradas));

            System.out.println("\nCalculo do Tempo de Viagem");
            for (Veiculo v : v2) {
                System.out.printf("%s: %.2f\n", v.getModelo(), v.calcularTempo());
            }
            break;

        case 0:
            run = false;
            break;
            default:
                System.out.println("Opção incorreta, tente novamente");
        }
    }
        //considerações:
        //achei que o código ficou muito extenso e repetitivo, e estou ciente de que o uso dos dois modos foi desnecessário,
        //mas foi com intuito de praticar a interação com o user. Em um sistema real, acho que seria mais interessante
        //usar só o ArrayList.
        sc.close();
    }
}