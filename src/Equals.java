import java.util.Scanner;

public class Equals {
    public static void main(String[] args) {
        /*String nome1 = "Felippe";

        Scanner in= new Scanner(System.in);
        String nome2;

        System.out.println("Digite seu nome");
        nome2 = in.nextLine();

        if(nome1.equals(nome2)){
            System.out.println("Os nomes são iguais!\nAmbos são "+nome1);
            System.out.print("nome1.equals(nome2)="+nome2.compareTo(nome1));
            System.out.print("\nnome1.equals(nome2)="+nome1.compareTo(nome2));
        }else {
            System.out.println("Os nomes são diferentes");
            System.out.print("nome1.equals(nome2)="+nome2.compareTo(nome1));
            System.out.print("\nnome1.equals(nome2)="+nome1.compareTo(nome2));
            */
/*
        String texto = "A API de Strings é uma das mais utilizadas na linguagenm Java";
        String linguagem = texto.substring(texto.indexOf("Java"),texto.length());

        if(linguagem.compareToIgnoreCase("java")==0){//ignora se é maiúscula ou minúscula
            System.out.println("compareToIgnoreCase: Encontrei a linguagem! Ela é "+ linguagem);
        }
        if(linguagem.compareTo("Java")==0){
            System.out.println("compareTo: Encontrei a linguagem! Ela é "+linguagem);
        }*/
        double numero = 102939939.939;
        boolean booleano = true;

        System.out.println("Retorna Valor : "+String.valueOf(numero));
        System.out.println("Retorna Valor : "+String.valueOf(booleano));
    }
}
