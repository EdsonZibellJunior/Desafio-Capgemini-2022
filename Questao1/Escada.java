package Questao1;

import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeroLinhas;
        System.out.println("--------- TRIÂNGULO DE ASTERISCO -----------");
        System.out.print("Informe um numero inteiro: ");
        numeroLinhas = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= numeroLinhas; i++) {
            for (int j = numeroLinhas - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
