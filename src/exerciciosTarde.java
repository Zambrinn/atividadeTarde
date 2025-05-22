import org.w3c.dom.ls.LSOutput;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class exerciciosTarde {
    public static void main(String[] args) throws Exception {
        ex12();
    }

    public static void ex5() {
        Scanner scanner = new Scanner(System.in);
        int menu;
        do {
            System.out.println("-- Menu Calculadora --");
            System.out.println("1 - Soma -");
            System.out.println("2 - Subtração -");
            System.out.println("3 - Multiplicação -");
            System.out.println("4 - Divisão -");
            System.out.print("0 - Sair do programa -");
            System.out.print("\nEscolha uma opção: ");

            menu = scanner.nextInt();
            double firstNum, secondNum, result;
            switch (menu) {
                case 1:
                    System.out.print("Digite o primeiro valor: ");
                    firstNum = scanner.nextDouble();
                    System.out.print("Digite o segundo valor: ");
                    secondNum = scanner.nextDouble();
                    result = firstNum + secondNum;
                    System.out.println("Resultado da soma: " + result);
                    break;
                case 2:
                    System.out.print("Digite o primeiro valor: ");
                    firstNum = scanner.nextDouble();
                    System.out.print("Digite o segundo valor: ");
                    secondNum = scanner.nextDouble();
                    result = firstNum - secondNum;
                    System.out.println("Resultado da subtração: " + result);
                    break;
                case 3:
                    System.out.print("Digite o primeiro valor: ");
                    firstNum = scanner.nextDouble();
                    System.out.print("Digite o segundo valor: ");
                    secondNum = scanner.nextDouble();
                    result = firstNum * secondNum;
                    System.out.println("Resultado da multiplicação: " + result);
                    break;
                case 4:
                    System.out.print("Digite o primeiro valor: ");
                    firstNum = scanner.nextDouble();
                    System.out.print("Digite o segundo valor: ");
                    secondNum = scanner.nextDouble();
                    result = firstNum / secondNum;
                    System.out.println("Resultado da divisão: " + result);
                    break;
                case 0:
                    System.exit(0);
            }
        } while (menu != 4);
    }

    public static void ex6() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = scanner.nextInt();
        if ( num % 2 == 0 ) {
            System.out.println(num + " é um número par!");
        } else {
            System.out.println(num + " é um número ímpar!");
        }
    }

    public static void ex7() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro valor: ");
        int num = scanner.nextInt();
        System.out.print("Digite o segundo valor: ");
        int secondNum = scanner.nextInt();
        if ( num > secondNum ) {
            System.out.println("O primeiro número é maior!");
        } else if (num == secondNum) {
            System.out.println("Os números são iguais!");
        } else {
            System.out.println("O segundo número é maior!");
        }
    }

    public static void ex8() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe sua idade: ");
        int age = scanner.nextInt();
        if ( age < 12 ) {
            System.out.println("Você é uma criança!");
        } else if ( age >= 12 && age <= 17 ) {
            System.out.println("Você é um adolescente!");
        } else if ( age >= 18 && age <= 59 ) {
            System.out.println("Você é um adulto!");
        } else if ( age >= 60 ){
            System.out.println("Você é um idoso!");
        }
    }

    public static void ex9() throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe seu usuário: ");
        String savedUsername = "joaozinho";
        String username = scanner.nextLine();
        System.out.println("Agora informe sua senha: ");
        int password = scanner.nextInt();
        int passwordSaved = 123;
        if ( savedUsername.equals(username) && passwordSaved == password ) {
            System.out.println("Logado com sucesso!");
        } else {
            throw new Exception("Usuário ou senha incorretos!");
        }
    }

    public static void ex10() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe uma nota de 0 - 10: ");
        int num = scanner.nextInt();
        if ( num > 10 ) {
            System.out.println("Você informou um número maior que o limite imposto!");
            return;
        } else {
            System.out.println("Nota computada com sucesso!");
        }
    }

    public static void ex11() {
        for (int i = 0; i < 20; i++) {
            System.out.println(i + 1);
        }
    }

    public static void ex12() {
        int num = 10;
        while (num != 0) {
            System.out.println(num);
            num--;
        }
    }

    public static void ex13() {
        int sum = 0;
        for (int i = 2; i < 100 ; i+=2) {
            sum += i;
        }
        System.out.println("A soma dos números pares até 100 é: " + sum);
    }

    public static void ex14() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int randomNumber = random.nextInt(10);
        System.out.println("Escolha um número de 1-10 para tentar adivinhar qual é: ");
        int randomNumberGuess = scanner.nextInt();

        if ( randomNumberGuess == randomNumber ) {
            System.out.println("Você acertou! O número é: " + randomNumberGuess);
        } else {
            System.out.println("Você errou! O número era: " + randomNumber );
        }
    }

    public static void ex15() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um número para fazermos a tabuada: ");
        int num = scanner.nextInt();

        if ( num >= 1 && num <= 10) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(num + " x " + i + " = " + (num * i));
            }
        } else {
            System.out.println("Insira um valor dentro do limite impostos.");
        }
    }

    public static void dobro(int x) { // Se for chamar esse método na main, use: dobro(x:1)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um número: ");
        x = scanner.nextInt();
        int result = x * 2;
        System.out.println("O dobro de " + x + " é " + result);
    }

    public static void biggestOrSmallest(int firstNum, int secondNum) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o primeiro número: ");
        firstNum = scanner.nextInt();
        System.out.println("Agora informe o segundo número: ");
        secondNum = scanner.nextInt();
        if ( firstNum > secondNum ) {
            System.out.println("O primeiro número é maior.");
        } else if ( firstNum == secondNum ) {
            System.out.println("Os números são iguais.");
        } else {
            System.out.println("O segundo número é maior.");
        }
    }

    public static void strongPasswordValidation(String password) {
        Scanner scanner = new Scanner(System.in);
        boolean hasNumber = false;
        System.out.print("Informe sua senha: ");
        password = scanner.nextLine();

        if (password.length() < 8) {
            System.out.println("Sua senha é fraca! Ela deve ter pelo menos 8 (oito) caracteres!");
            return;
        }

        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                hasNumber = true;
                break;
            }
        }

        if (!hasNumber) {
            System.out.println("Sua senha é fraca! Ela deve ter pelo menos 1 (um) número!");
        }

        System.out.println("Senha válida!");
    }

    public static void newArchive(String archiveName) throws IOException {
        String[] people = {
                "Thiago, 18",
                "Gabriel, 23",
                "João, 32"
        };

        File archive = new File(archiveName);

        if (!archive.exists()) {
            archive.createNewFile();
        }

        BufferedWriter writer = new BufferedWriter(new FileWriter(archive, false));

        for (String person : people) {
            writer.write(person);
            writer.newLine();
        }

        writer.close();

        System.out.println("Arquivo " + archiveName + " criado com sucesso!");
    }
}
