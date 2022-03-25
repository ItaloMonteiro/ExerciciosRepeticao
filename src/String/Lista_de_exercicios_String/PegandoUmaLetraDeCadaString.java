package String.Lista_de_exercicios_String;

import java.util.Scanner;
/*
Crie um algoritmo que receba dois inputs que sejam strings e combine-as alternando as letras de cada string.

Deve começar pela primeira letra da primeira string, seguido pela primeira letra
da segunda string, em seguida pela segunda letra da primeira string e continuar dessa forma sucessivamente.

As letras restantes da cadeia mais longa devem ser adicionadas ao fim da string resultante e retornada.

A entrada contém vários casos de teste. A primeira linha contém um
inteiro N que indica a quantidade de casos de teste que vem a seguir.
Cada caso de teste é composto por uma linha que contém duas cadeias
de caracteres, cada cadeia de caracteres contém entre 1 e 50 caracteres inclusive.
 */

public class PegandoUmaLetraDeCadaString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = Integer.parseInt(scan.nextLine());//quando você insere um número, pressione Enter,
        // input.nextInt() consome apenas o número, não o 'fim da linha', tipos de dados primitivos
        // como int, double etc não consomem 'fim da linha', devido ao qual este 'fim da linha' line'
        // permanece no buffer e quando input.next() é executado, ele consome o 'fim de linha' do
        // buffer da primeira entrada. Então, está tentando chegar à próxima linha
        // depois de ler a entrada do usuário.

        for(int i = 1; i <= N; i++) {

            StringBuilder analise = new StringBuilder();
            String[] palavras = scan.nextLine().split(" ");

            int tamanhoMaximo = Math.max (palavras[0].length(), palavras[1].length());//O java.lang.Math.max(int a,
            // int b) retorna o maior de dois valores int. Ou seja, o resultado é o argumento mais próximo do
            // infinito positivo exemplo se a = 2 e b = 1 ele retornará a = 2 pois é o maior.

            for(int j = 0; j < tamanhoMaximo; j++) {

                if(j < palavras[0].length()) {

                    analise.append(palavras[0].charAt(j));//os métodos append, que são sobrecarregados
                    // para aceitar dados de qualquer tipo. Cada um converte efetivamente um dado dado em uma
                    // string e, em seguida, acrescenta os caracteres dessa string no construtor de
                    // strings. O método append sempre adiciona esses caracteres no final do construtor;
                    //Por exemplo, se z se referir a um objeto construtor de strings cujo conteúdo atual é
                    // 'start', então a chamada de método z.append('le') faria com que o construtor de
                    // strings contivesse 'startle.

                }

                if(j < palavras[1].length()) {

                    analise.append(palavras[1].charAt(j)); //está adicionando cada letra de cada indice da variável
                    //palavras para a variável analise, dessa forma concatenando letra por letra dentro da variavel
                    //de palavras[0] e palavras[1].

                }

            }

            System.out.println(analise.toString());

        }
    }
}
