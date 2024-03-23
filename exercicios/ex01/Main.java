package exercicios.ex01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o início do intervalo:");
        int inicio = scanner.nextInt();

        System.out.println("Digite o fim do intervalo:");
        int fim = scanner.nextInt();

        int soma = 0;

        for (int i = inicio; i <= fim; i++) {
            soma += i;
        }

        System.out.println("A soma dos números no intervalo [" + inicio + ", " + fim + "] é: " + soma);

        scanner.close();
    }
}
