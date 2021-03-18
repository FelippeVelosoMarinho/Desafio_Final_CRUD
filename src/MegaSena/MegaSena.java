import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Random;

public class MegaSena {
    Scanner in= new Scanner(System.in);
    LinkedHashSet <Integer>exemploHashSet = new LinkedHashSet<>();
    LinkedHashSet <Integer>exemploHashSet2 = new LinkedHashSet<>();
    int quantos;
    int n1 = 0;
    int n2 = 0;
    int n3 = 0;
    int n4 = 0;
    int n5 = 0;
    int n6 = 0;

    public void recebeN(){//Recebe os números
        System.out.println("Digite o primeiro número: ");
        n1 = in.nextInt();
        System.out.println("Digite o segundo número: ");
        n2 = in.nextInt();
        System.out.println("Digite o terceiro número: ");
        n3 = in.nextInt();
        System.out.println("Digite o quarto número: ");
        n4 = in.nextInt();
        System.out.println("Digite o quinto número: ");
        n5 = in.nextInt();
        System.out.println("Digite o sexto número: ");
        n6 = in.nextInt();

        exemploHashSet.add(n1);
        exemploHashSet.add(n2);
        exemploHashSet.add(n3);
        exemploHashSet.add(n4);
        exemploHashSet.add(n5);
        exemploHashSet.add(n6);

        System.out.println("\n\n"+"Os números apostados foram: "+exemploHashSet);
    }
    public void automatico(){
        n1 = (int)(Math.random()*60)+1;
        n2 = (int)(Math.random()*60)+1;
        n3 = (int)(Math.random()*60)+1;
        n4 = (int)(Math.random()*60)+1;
        n5 = (int)(Math.random()*60)+1;
        n6 = (int)(Math.random()*60)+1;

        exemploHashSet.add(n1);
        exemploHashSet.add(n2);
        exemploHashSet.add(n3);
        exemploHashSet.add(n4);
        exemploHashSet.add(n5);
        exemploHashSet.add(n6);

        System.out.println("\n\n"+"Os números apostados foram: "+exemploHashSet);

    }
    public void comparaN(){// Embaralha os números e compara

        Random random = new Random();
        int ns1 = random.nextInt(60)+1;
        int ns2 = random.nextInt(60)+1;
        int ns3 = random.nextInt(60)+1;
        int ns4 = random.nextInt(60)+1;
        int ns5 = random.nextInt(60)+1;
        int ns6 = random.nextInt(60)+1;// Esse aqui tá diferente só pq sim

        exemploHashSet2.add(ns1);
        exemploHashSet2.add(ns2);
        exemploHashSet2.add(ns3);
        exemploHashSet2.add(ns4);
        exemploHashSet2.add(ns5);
        exemploHashSet2.add(ns6);

        System.out.println("Os números sorteados foram: "+exemploHashSet2+"\n");

        // Percorre ,compara o array e adiciona 1 à variável quantos a cada número igual nos exemploHashSet
        for(int a : exemploHashSet) {
            for(int i : exemploHashSet2) {
                if(a==i){
                    quantos = quantos+1;
                }
            }
        }
    }

    public void premio(){
        System.out.println("===================================================");
        System.out.println("Você acertou "+ quantos+" número(s).");
        if(quantos == 1) {
            System.out.println("O prêmio para 1 acerto é 1.000.000 de reais em notas falsas");
        }
        else if(quantos == 6){
            System.out.println("O prêmio para seis acertos é 1.000.000 de reais");
            System.out.println("Você ganhou o prêmio máximo!!!!!!!!!!!".toUpperCase());
        }else{
            System.out.println("O prêmio para essa quantidade de acerto é um parabéns pela tentativa");
            System.out.println("PARABÉNS PELA TENTATIVA FRUSTRADA!!!");
        }
        System.out.println("===================================================");
        exemploHashSet.clear();
        exemploHashSet2.clear();
    }
}