package String;

import java.util.Scanner;

public class TransformandoStringEmNumeroESeparandoEmArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String numeros = scan.nextLine(); //criei uma string que receberá vários números
        String array[] = numeros.split(" "); //esse array irá separar a string por espaços e armazenar no array
        int[] numerosInteiros = new int[array.length]; //esse array terá o tamanho do array de strings para receber
        //os valores transformados em inteiro em cada posição
        int soma = 0; // se quiser podemos somar

        for (int i = 0; i < array.length; i++){ // esse for irá continuar até chegar ao tamanho do array de string
            numerosInteiros[i] = Integer.parseInt(array[i]);//o array de numeros receberá cada valor do array de string
            //em cada posição de i transformado em inteiros
            soma += numerosInteiros[i];//essa variável irá somar cada valor na posição i do array de números
        }
        System.out.println(soma);//aqui mostrará o resultado final.
    }
}
