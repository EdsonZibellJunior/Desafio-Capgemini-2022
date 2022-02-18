package Questao3;

import java.util.ArrayList;
import java.util.Scanner;

public class Anagrama {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("--------- CALCULADORA DE ANAGRAMAS -----------");
        System.out.print("Informe uma palavra: ");

        String palavra = scan.nextLine();
        numeroAnagaramas(palavra);

    }

    static void numeroAnagaramas(String palavra) {
        ArrayList<String> Anagramas = new ArrayList<String>();
        for (int i = 0; i < palavra.length(); i++) {
            for (int j = 1; j < palavra.length(); j++) {
                if (palavra.charAt(i) == palavra.charAt(j) && i < j && i != j) {
                    if (palavra.charAt(i) == palavra.charAt(i + 1)) {
                        String x = palavra.substring(i, i + 1);
                        Anagramas.add(x);
                    } else {
                        String y = palavra.substring(i, i + 1);
                        Anagramas.add(y);
                        String z = palavra.substring(i, j);
                        Anagramas.add(z);
                    }
                }
            }
        }
        System.out.println(palavra.toUpperCase() + ": Contém " + "[" + Anagramas.size() + "]"
                + " pares de substrings que são anagramas.");
    }
}