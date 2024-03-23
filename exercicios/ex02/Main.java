package exercicios.ex02;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        int numero = scanner.nextInt();

        boolean naoPrimo = false;
        int i = 1;

        while (i <= numero && naoPrimo == false) {
            if (numero % i == 0) {
                if (i != numero && i != 1)
                    naoPrimo = true;

            }
            i++;
        }

        if (naoPrimo) {
            System.out.println(numero + " não é um número primo.");
        } else {
            System.out.println(numero + " é um número primo.");
        }

        scanner.close();
    }

}
