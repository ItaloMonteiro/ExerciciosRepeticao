package String.Lista_de_exercicios_String;

import java.util.Scanner;

/*
Tamanho de strings. Faça um programa que leia 2 strings e
informe o conteúdo delas seguido do seu comprimento.
 Informe também se as duas strings possuem o mesmo
  comprimento e são iguais ou diferentes no conteúdo.
 */
public class questaoUm {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String informacao1 = scan.nextLine();
        String informacao2 = scan.nextLine();

        System.out.println(informacao1 + ": " + informacao1.length() + " caracteres.");
        System.out.println(informacao2 + ": " + informacao2.length() + " caracteres.");
        if (informacao1.length() != informacao2.length()){ // se o tamanho da string 1 for diferente do tamanho da string 2
            System.out.println("As duas Strings são de tamanhos diferentes."); // irá imprimir essas mensagens
            System.out.println("As duas Strings possuem conteúdos diferentes.");
        }else if (informacao1.length() == informacao2.length() && informacao1.compareTo(informacao2) == 0){// se o tamanho
            //da string 1 for igual ao tamanho da string 2 e o conteudo for diferente, pois esetá fazendo uma comparação
            System.out.println("As duas Strings são de tamanhos iguais.");//irá imprimir essas mensagens
            System.out.println("As duas Strings possuem conteúdos iguais.");
        }

    }
}
