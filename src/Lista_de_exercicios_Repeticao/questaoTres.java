package Lista_de_exercicios_Repeticao;//Faça um programa que leia e valide as seguintes informações:
//        Nome: maior que 3 caracteres;
//        Idade: entre 0 e 150;
//        Salário: maior que zero;
//        Sexo: 'f' ou 'm';
//        Estado Civil: 's', 'c', 'v', 'd';

import java.util.Scanner;

public class questaoTres {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        String nome = scan.next();
        while (nome.length() <= 3) {
            System.out.println("Digite seu nome corretamente.");
            nome = scan.next();
        }
        int idade = scan.nextInt();
        while (idade < 0 || idade > 150) {
            System.out.println("Digite sua idade corretamente.");
            idade = scan.nextInt();

        }
        char sexo = scan.next().charAt(0);
        while(sexo != 'f' && sexo != 'm'){
            System.out.println("Digite seu sexo.");
            sexo = scan.next().charAt(0);
        }
        char estadoCivil = scan.next().charAt(0);
        while(estadoCivil != 's' && estadoCivil != 'c' && estadoCivil != 'v' && estadoCivil != 'd'){
            System.out.println("Digite seu estado civil: 's', 'c', 'v', 'd'. ");
            estadoCivil = scan.next().charAt(0);
        }
    }
}
