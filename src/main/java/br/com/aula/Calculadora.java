package br.com.aula;

import java.util.Scanner;

public class Calculadora {

    // Método de soma
    public static double somar(double a, double b) {
        return a + b;
    }

    // Método de subtração
    public static double subtrair(double a, double b) {
        return a - b;
    }

    // Método de multiplicação
    public static double multiplicar(double a, double b) {
        return a * b;
    }

    // Método de divisão
    public static double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("⚠️ Erro: divisão por zero não é permitida!");
            return Double.NaN; // Retorna "Not a Number"
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== Calculadora ===");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o primeiro número: ");
                    double num1 = scanner.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    double num2 = scanner.nextDouble();
                    System.out.println("Resultado da soma: " + somar(num1, num2));
                    break;

                case 2:
                    System.out.print("Digite o primeiro número: ");
                    double n1 = scanner.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    double n2 = scanner.nextDouble();
                    System.out.println("Resultado da subtração: " + subtrair(n1, n2));
                    break;

                case 3:
                    System.out.print("Digite o primeiro número: ");
                    double m1 = scanner.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    double m2 = scanner.nextDouble();
                    System.out.println("Resultado da multiplicação: " + multiplicar(m1, m2));
                    break;

                case 4:
                    System.out.print("Digite o primeiro número: ");
                    double d1 = scanner.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    double d2 = scanner.nextDouble();
                    double resultadoDiv = dividir(d1, d2);
                    if (!Double.isNaN(resultadoDiv)) {
                        System.out.println("Resultado da divisão: " + resultadoDiv);
                    }
                    break;

                case 0:
                    System.out.println("Encerrando a calculadora...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 0);

        scanner.close();
    }
}
