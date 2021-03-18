import java.util.Scanner;

public class ConsumoMedio {
    double distanciaPercorrida;
    double combustivelGasto;

    Scanner in = new Scanner(System.in);
    /*public ConsumoMedio(){//            ** Eu tinha feito esse método como construtor e instaciado, agora ele é inútil
        this.distanciaPercorrida = distanciaPercorrida;
        this.combustivelGasto = combustivelGasto;
    }*/
    public void Continhas(){// Fiz esse método com a lógica que estava na TestaConsumo e instanciei pra classe TestaConsumo.
        //As duas entradas de Combustível e Distância
        System.out.println("Digite a Distância percorida pelo automóvel em KM: ");
        distanciaPercorrida = in.nextDouble();

        System.out.println("Digite o combustível gasto durante a viagem, em L: ");
        combustivelGasto = in.nextDouble();

        //Variável com a lógica de consumo e Km/l
        double consumo= combustivelGasto / distanciaPercorrida;
        double kml= distanciaPercorrida / combustivelGasto;

        //print final
        System.out.println("Seu consumo médio durante a viagem foi de "+ consumo +"L/Km"+" percorrendo "+kml+"Km/L");
    }
}
