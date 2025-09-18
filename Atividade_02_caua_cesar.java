package atividade_02_caua_cesar;

import java.util.Scanner;
import java.util.Random;

public class Atividade_02_caua_cesar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Escolha uma opção:");
        System.out.println("1 - Círculo (área e circunferência)");
        System.out.println("2 - IMC");
        System.out.println("3 - Hipotenusa");
        System.out.println("4 - Conversão de moedas");
        System.out.println("5 - Rolagens de dado");
        System.out.println("6 - Trigonometria");
        System.out.println("7 - Distância entre dois pontos");
        System.out.println("8 - Operações com três números");
        System.out.println("9 - Equação de 2º grau");
        System.out.println("10 - Conversão de temperatura");

        int opcao = sc.nextInt();

        switch (opcao) {
            atividade 1 -> {
                System.out.print("Raio do círculo: ");
                double r = sc.nextDouble();
                double area = Math.PI * Math.pow(r, 2);
                double circ = 2 * Math.PI * r;
                System.out.printf("Área: %.2f\n", area);
                System.out.printf("Circunferência: %.2f\n", circ);
            }
            atividade 2 -> {
                System.out.print("Peso (kg): ");
                double peso = sc.nextDouble();
                System.out.print("Altura (m): ");
                double altura = sc.nextDouble();
                double imc = peso / (altura * altura);
                System.out.printf("IMC: %.2f\n", imc);
            }
            atividade 3 -> {
                System.out.print("Cateto a: ");
                double a = sc.nextDouble();
                System.out.print("Cateto b: ");
                double b = sc.nextDouble();
                double h = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
                System.out.printf("Hipotenusa: %.2f\n", h);
            }
            atividade 4 -> {
                System.out.print("Valor em reais: ");
                double reais = sc.nextDouble();
                System.out.print("Cotação do dólar: ");
                double cotacao = sc.nextDouble();
                int dolares = (int)(reais / cotacao);
                double troco = reais - (dolares * cotacao);
                System.out.println("Dólares inteiros: " + dolares);
                System.out.printf("Troco em reais: %.2f\n", troco);
            }
            atividade 5 -> {
                System.out.print("Quantidade de rolagens: ");
                int n = sc.nextInt();
                int[] resultados = new int[n];
                int soma = 0;
                int menor = 6;
                int maior = 1;

                System.out.print("Resultados: ");
                for (int i = 0; i < n; i++) {
                    resultados[i] = rand.nextInt(6) + 1;
                    System.out.print(resultados[i] + " ");
                    soma += resultados[i];
                    if (resultados[i] < menor) menor = resultados[i];
                    if (resultados[i] > maior) maior = resultados[i];
                }
                System.out.println();
                double media = (double) soma / n;
                System.out.printf("Média: %.2f\n", media);
                System.out.println("Menor: " + menor);
                System.out.println("Maior: " + maior);
            }
            atividade 6 -> {
                System.out.print("Ângulo em graus: ");
                double ang = sc.nextDouble();
                double rad = Math.toRadians(ang);
                System.out.printf("Seno: %.2f\n", Math.sin(rad));
                System.out.printf("Cosseno: %.2f\n", Math.cos(rad));
                System.out.printf("Tangente: %.2f\n", Math.tan(rad));
            }
            atividade 7 -> {
                System.out.print("x1: ");
                double x1 = sc.nextDouble();
                System.out.print("y1: ");
                double y1 = sc.nextDouble();
                System.out.print("x2: ");
                double x2 = sc.nextDouble();
                System.out.print("y2: ");
                double y2 = sc.nextDouble();
                double d = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
                System.out.printf("Distância: %.2f\n", d);
            }
            atividade 8 -> {
                System.out.print("Número 1: ");
                double n1 = sc.nextDouble();
                System.out.print("Número 2: ");
                double n2 = sc.nextDouble();
                System.out.print("Número 3: ");
                double n3 = sc.nextDouble();
                double media = (n1 + n2 + n3) / 3;
                double somaAbs = Math.abs(n1) + Math.abs(n2) + Math.abs(n3);
                double maiorDif = Math.max(Math.abs(n1 - n2),
                                 Math.max(Math.abs(n1 - n3), Math.abs(n2 - n3)));
                System.out.printf("Média: %.2f\n", media);
                System.out.printf("Soma dos valores absolutos: %.2f\n", somaAbs);
                System.out.printf("Maior diferença: %.2f\n", maiorDif);
            }
            atividade 9 -> {
                System.out.print("Coeficiente a: ");
                double coefA = sc.nextDouble();
                System.out.print("Coeficiente b: ");
                double coefB = sc.nextDouble();
                System.out.print("Coeficiente c: ");
                double coefC = sc.nextDouble();
                double delta = Math.pow(coefB, 2) - 4 * coefA * coefC;

                if (delta < 0) {
                    System.out.println("Não existem raízes reais.");
                } else {
                    double x1 = (-coefB + Math.sqrt(delta)) / (2 * coefA);
                    double x2 = (-coefB - Math.sqrt(delta)) / (2 * coefA);
                    System.out.printf("x1 = %.2f\n", x1);
                    System.out.printf("x2 = %.2f\n", x2);
                }
            }
            atividade 10 -> {
                System.out.print("Temperatura em Fahrenheit: ");
                double f = sc.nextDouble();
                double c = (f - 32) * 5 / 9;
                System.out.printf("%.2f°F = %.2f°C\n", f, c);
            }
            default -> System.out.println("Opção inválida!");
        }

        sc.close();
    }
}
