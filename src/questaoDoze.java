//Desenvolva um gerador de tabuada, capaz de gerar a
//tabuada de qualquer número inteiro entre 1 a 10.
//O usuário deve informar de qual numero ele deseja ver a tabuada.
//A saída deve ser conforme o exemplo abaixo:

import java.util.Scanner;

public class questaoDoze {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numeroTabuada = scan.nextInt();
        int resultado = 0;
        for(int i = 0; i < 11; i++){
            resultado = numeroTabuada * i;
            System.out.println(numeroTabuada + " x " + i + " = " + resultado);
        }
    }
}
