package exercicios.ex03;

public class Main {

    public static void main(String[] args) {

        double[] notas = { 7.5, 8.0, 9.0, 8.5, 6.5, 9.5, 10.0, 7.0, 8.5, 10.0 };

        double media = calcularMedia(notas);

        System.out.println("A média das notas é: " + media);

    }

    private static double calcularMedia(double[] notas) {

        double soma = 0;

        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }

        double media = soma / notas.length;
        return media;
    }
}
