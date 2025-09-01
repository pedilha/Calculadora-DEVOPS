package br.com.aula;

import java.util.Scanner;

public class Calculadora {

    // Método de soma
    public static double somar(double a, double b) {
        return a + b;
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
                    double resultado = somar(num1, num2);
                    System.out.println("Resultado da soma: " + resultado);
                    break;

                case 2:
                case 3:
                case 4:
                    System.out.println("⚠️ Essa operação ainda não foi implementada!");
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
