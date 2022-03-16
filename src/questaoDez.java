//Faça um programa que receba dois números inteiros
//e gere os números inteiros que estão no intervalo compreendido por eles.

import java.util.Scanner;

public class questaoDez {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //criei um objeto scan para ler as váriaveis
        int numeroUm = scan.nextInt(); // variavel inteiro que será passado pelo usuario
        int numeroDois = scan.nextInt();
        for (int i = numeroUm; i <= numeroDois; i++){ //esse for quer dizer que i é igual o primeiro numero que foi informado
                                                    //esse numero irá ser somado mais 1 até chegar ao segundo numero informado
            System.out.println(i); //Aqui será imprimido cada numero enquanto a condição não for satisfeita
        }
    }
}
