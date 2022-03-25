package String;

import java.util.Scanner;

public class SeparandoStringEmArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String numeros = scan.nextLine();//criei uma string que receberá vários números
        String array[] = numeros.split(" ");//esse array irá separar a string por espaços e armazenar no array
        for (int i = 0; i < array.length; i++){// esse for irá continuar até chegar ao tamanho do array de string
            System.out.println(array[i]);//aqui imprimirá cada valor da array na posição i.
        }
    }
}
