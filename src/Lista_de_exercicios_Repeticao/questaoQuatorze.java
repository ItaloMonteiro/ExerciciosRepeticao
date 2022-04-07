package Lista_de_exercicios_Repeticao;

import java.util.Scanner;

/*
Faça um programa que peça 10 números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
 */
public class questaoQuatorze {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numeroDez = 10;
        int quantidadePar = 0;
        int quantidadeImpar = 0;
        for (int i = 0; i < numeroDez; i++){
            int numeros = scan.nextInt();
            if (numeros % 2 == 0){
                quantidadePar++;
            }else{
                quantidadeImpar++;
            }
        }
        System.out.println("Quantidade de números ímpares: " + quantidadeImpar);
        System.out.println("Quantidade de números pares: " + quantidadePar);
    }
}
