//Faça um programa que leia 5 números e informe o maior número.

import java.util.Scanner;

public class questaoSete {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero;
        int maiorNumero = 0;
        for (int i = 0; i < 5; i++){
            numero = scan.nextInt();
            if (numero > maiorNumero) {
                maiorNumero = 0;
                maiorNumero += numero;
            }
        }

        System.out.println(maiorNumero);
    }
}
