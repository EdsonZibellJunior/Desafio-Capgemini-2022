package Questao2;

import java.util.Scanner;
import java.util.regex.Pattern;

public class SenhaForte {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean invalido = true;
        System.out.println("-------- CADASTRO DE SENHA ---------");
        do {
            System.out.print("Digite sua senha: ");
            String senha = sc.next();
            boolean valida = Pattern.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[-+_!@#$%^&*.,?])(?=.{6,}).+$",
                    senha);

            if (valida == true) {
                System.out.println("------------------------------------");
                System.out.println("Senha forte cadastrada com sucesso!");
                System.out.println("------------------------------------");
                break;
            } else {
                valida = false;
                System.out.println("------------------------------------");
                System.out.println(
                        "Senha fraca! \nSua senha deve possuir no mínimo: \n6 caracteres \n1 digito \n1 letra em minúsculo \n1 letra em maiúsculo \n1 caractere especial (!@#$%^&*()-+)");
                System.out.println("------------------------------------");
            }
        } while (invalido);
    }
}