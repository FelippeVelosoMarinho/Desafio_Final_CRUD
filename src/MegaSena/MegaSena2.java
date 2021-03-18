import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Scanner;

public class MegaSena2 {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        LinkedHashSet<Integer> repet = new LinkedHashSet<Integer>();

        int n;
        int x;
        System.out.println("Quantos jogos deseja fazer?");
        int jogos = sc.nextInt() + 1;
        for (x = 1; x < jogos; x++) {
            System.out.println("Digite a quantidade de números que deseja jogar");
            int num2 = sc.nextInt();

            int[] num = new int[num2];

            while (repet.size() < num.length) {
                /*for(int i=1; i<num.length; i++){ */
                n = random.nextInt(61);
                repet.add(n);


            }
            System.out.println(repet);
            repet.clear();

            //sc.close();
        }
    }
}