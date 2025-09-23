import java.util.Scanner;

public class Atividade_05_caua_cesar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
       
        System.out.print("Digite um número N: ");
        int N = sc.nextInt();
        int i = 1;
        while (i <= N) {
            System.out.println(i);
            i++;
        }

      
        int soma = 0, cont = 0, num;
        System.out.print("Digite um número inteiro (-1 para parar): ");
        num = sc.nextInt();
        while (num != -1) {
            soma += num;
            cont++;
            System.out.print("Digite um número inteiro (-1 para parar): ");
            num = sc.nextInt();
        }
        System.out.println("Soma: " + soma + " Quantidade: " + cont);

       
        System.out.print("Digite a senha: ");
        String senha = sc.next();
        while (!senha.equals("Java123")) {
            System.out.println("Senha incorreta");
            System.out.print("Digite a senha: ");
            senha = sc.next();
        }
        System.out.println("Acesso permitido");

       
        int opcao = -1;
        while (opcao != 0) {
            System.out.println("\nMenu:");
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Multiplicar");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            if (opcao != 0) {
                System.out.print("Digite o primeiro número: ");
                int a = sc.nextInt();
                System.out.print("Digite o segundo número: ");
                int b = sc.nextInt();

                switch (opcao) {
                    case 1:
                        System.out.println("Resultado: " + (a + b));
                        break;
                    case 2:
                        System.out.println("Resultado: " + (a - b));
                        break;
                    case 3:
                        System.out.println("Resultado: " + (a * b));
                        break;
                    default:
                        System.out.println("Opção inválida");
                }
            }
        }

      
        System.out.print("Digite um número para calcular o fatorial: ");
        int n = sc.nextInt();
        int fat = 1;
        for (int j = 1; j <= n; j++) {
            fat *= j;
        }
        System.out.println(n + "! = " + fat);

        // Exemplo 6: Sequência de Fibonacci até N
        System.out.print("Digite um valor para N (Fibonacci até N): ");
        int limit = sc.nextInt();
        int aFib = 0, bFib = 1;
        while (aFib <= limit) {
            System.out.print(aFib + " ");
            int temp = aFib;
            aFib = bFib;
            bFib = temp + bFib;
        }
        System.out.println();

       
        System.out.print("Digite um número maior ou igual a 2: ");
        int nPrimo = sc.nextInt();
        boolean primo = true;
        for (int j = 2; j * j <= nPrimo; j++) {
            if (nPrimo % j == 0) {
                primo = false;
                break;
            }
        }
        if (primo) {
            System.out.println("Primo");
        } else {
            System.out.println("Não primo");
        }

        
        int soma2 = 0;
        System.out.print("Digite um número (negativo para parar): ");
        int num2 = sc.nextInt();
        while (num2 >= 0) {
            soma2 += num2;
            System.out.print("Digite um número (negativo para parar): ");
            num2 = sc.nextInt();
        }
        System.out.println("Soma = " + soma2);

       
        System.out.print("Digite um número inteiro: ");
        int n2 = sc.nextInt();
        String numStr = String.valueOf(Math.abs(n2)); // ignora sinal negativo
        int qtdDigitos = numStr.length();
        int somaDigitos = 0;
        for (char c : numStr.toCharArray()) {
            somaDigitos += Character.getNumericValue(c);
        }
        int reverso = Integer.parseInt(new StringBuilder(numStr).reverse().toString());
        if (n2 < 0) {
            reverso = -reverso;
        }
        System.out.println("Quantidade de dígitos: " + qtdDigitos);
        System.out.println("Soma dos dígitos: " + somaDigitos);
        System.out.println("Reverso: " + reverso);

       
        System.out.print("Digite um número positivo para Collatz: ");
        int nCollatz = sc.nextInt();
        while (nCollatz != 1) {
            System.out.print(nCollatz + " -> ");
            if (nCollatz % 2 == 0) {
                nCollatz = nCollatz / 2;
            } else {
                nCollatz = 3 * nCollatz + 1;
            }
        }
        System.out.println(1);

        sc.close();
    }
}
