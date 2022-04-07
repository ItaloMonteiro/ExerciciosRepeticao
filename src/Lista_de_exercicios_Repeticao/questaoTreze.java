package Lista_de_exercicios_Repeticao;

import java.util.Scanner;

/*
Faça um programa que peça dois números, base e expoente,
calcule e mostre o primeiro número elevado ao segundo número.
Não utilize a função de potência da linguagem.
 */
public class questaoTreze {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double base = scan.nextInt();
        double expoente = scan.nextInt();
        double resultado = 1;
        while(expoente != 0){
            resultado = resultado * base;
            expoente--;
        }
        System.out.println( base + "^" + expoente + " = " + resultado);
        /*
        ou para ficar mais fácil podemos usar o método pow() da classe Math que calcula a potenciação
        de um número passando como parametros dois números do tipo double.

        double resultado = Math.pow( base, expoente);

        System.out.println( base + "^" + expoente + " = " + resultado);
        */
    }
}
