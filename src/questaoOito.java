//Faça um programa que leia 5 números e informe a soma e a média dos números.

import java.util.Scanner;

public class questaoOito {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero;
        int maiorNumero = 0;
        int media = 0;
        for (int i = 0; i < 5; i++){
            numero = scan.nextInt();
            media += numero;
            if (numero > maiorNumero) {
                maiorNumero = 0;
                maiorNumero += numero;
            }
        }
        media /= 5;
        System.out.println("Maior numero: " + maiorNumero + " média: " + media );
    }
}
