package Lista_de_exercicios_Repeticao;//Altere o programa anterior para mostrar no final a soma dos números.

import java.util.Scanner;

public class questaoOnze {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //criei um objeto scan para ler as váriaveis
        int numeroUm = scan.nextInt(); // variavel inteiro que será passado pelo usuario
        int numeroDois = scan.nextInt();
        int soma = 0;
        for (int i = numeroUm; i <= numeroDois; i++){ //esse for quer dizer que i é igual o primeiro numero que foi informado
            //esse numero irá ser somado mais 1 até chegar ao segundo numero informado
            System.out.println(i); //Aqui será imprimido cada numero enquanto a condição não for satisfeita
            soma += i; //essa variavel pegará os numeros de i e somará com ela mesma
        }
        System.out.println(soma);//aqui imprimirá a soma dos numeros
    }
}
