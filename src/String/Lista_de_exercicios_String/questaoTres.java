package String.Lista_de_exercicios_String;

import java.util.Scanner;

/*
Nome na vertical. Faça um programa que solicite o nome do usuário e imprima-o na vertical.
 */
public class questaoTres {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome = scan.nextLine();

        for (int i = 0; i < nome.length(); i++){
            System.out.println(nome.charAt(i));
        }
    }
}
