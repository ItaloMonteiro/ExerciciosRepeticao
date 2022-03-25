package String.Lista_de_exercicios_String;
import java.util.Scanner;
/*
Nome ao contrário em maiúsculas. Faça um programa que permita ao usuário digitar o seu nome
e em seguida mostre o nome do usuário de trás para frente
utilizando somente letras maiúsculas. Dica: lembre−se que
ao informar o nome o usuário pode digitar letras maiúsculas ou minúsculas
 */
public class questaoDois {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nomeDoUsuario = scan.nextLine().toUpperCase();
        inverterStringComStringBuilder(nomeDoUsuario);
    }

    public static void inverterStringComStringBuilder(String texto){
        System.out.println("\t");
        StringBuilder inverterTexto = new StringBuilder(texto).reverse();
        System.out.println(inverterTexto);
    }

}
