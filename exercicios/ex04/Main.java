package exercicios.ex04;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("Insira o múmero da tabuada que desejas: ");

        int tabuada = leitor.nextInt();

        for (int contador = 1; contador <= 10; contador++) {

            System.out.println(tabuada + " * " + contador + " = " + (tabuada * contador));
        }

        leitor.close();
    }
}
