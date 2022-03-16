//Supondo que a população de um país A seja da ordem de 80000 habitantes
//com uma taxa anual de crescimento de 3% e que a
//população de B seja 200000 habitantes com uma taxa
//de crescimento de 1.5%. Faça um programa que calcule e
//escreva o número de anos necessários para que a população do país A
//ultrapasse ou iguale a população do país B, mantidas as
//taxas de crescimento.

public class questaoQuatro {
    public static void main(String[] args) {
        double A = 80000d;
        double taxaAnualA = 0.03;
        double B = 200000d;
        double taxaAnualB = 0.015;
        double anosParaAPassarB = 0;

        while(A < B){
            A = A + (A * taxaAnualA);
            B = B + (B * taxaAnualB);
            anosParaAPassarB++;
            if (A >= B) System.out.println("A ultrapassou ou igualou B em: " + anosParaAPassarB + "anos.");
        }
    }
}
