package exercicios.ex05;

import java.util.Scanner;

public class InverterArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do array (N): ");
        int tamanho = scanner.nextInt();

        int[] array = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.printf("Digite o valor para a posição %d: ", i);
            array[i] = scanner.nextInt();
        }

        inverterArray(array);

        System.out.println("Array invertido:");
        for (int valor : array) {
            System.out.print(valor + " ");
        }

        scanner.close();
    }

    public static void inverterArray(int[] arr) {
        for (int left = 0, right = arr.length - 1; left < right; left++, right--) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }
    }
}
