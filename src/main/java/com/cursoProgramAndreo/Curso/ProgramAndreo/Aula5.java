package com.cursoProgramAndreo.Curso.ProgramAndreo;

import java.util.Scanner;

public class Aula5 {
    public static void main(String[] args) {
        // Criando um scanner para receber os valores
        Scanner scanner = new Scanner(System.in);

        // Scanner para todos os tipos que conhecemos:
            int inteiro = scanner.nextInt();
            double varDouble = scanner.nextDouble();
            float varFloat = scanner.nextFloat();
            boolean boleano = scanner.nextBoolean();
            scanner.nextLine();
            String texto = scanner.nextLine(); // é importante colocar um nextLine extra quando usar o scanner para string
            // não existe um metodo especifico para char, mas assim vc pega o primeiro caractere lido pelo nextLine.
            char caractere = scanner.nextLine().charAt(0);

        // Comando if else
            System.out.print("Digite sua idade: "); // usei apenas print, pois o println quebra uma linha.
            int idade = scanner.nextInt();

            if (idade >= 18) {
                // bloco apenas se a condição for verdade
                System.out.println("Pessoa maior de idade.");
            } else {
                System.out.println("Pessoa menor de idade.");
            }

            // Também poderia ser assim, sem o else

            if (idade >= 18) {
                System.out.println("Pessoa maior de idade.");
            }
            if (idade < 18 ) {
                System.out.println("Pessoa menor de idade.");
            }

            // mas não seria um código otimizado, mostrei
            // para voces verem que é permitido if sem else
        // Comando case
            char sexo = scanner.nextLine().charAt(0);

            switch (sexo){
                case 'M':
                    System.out.println("Sexo masculino.");
                    break;
                case 'F':
                    System.out.println("Sexo feminino.");
                    break;
                default:
                    System.out.println("Até o momento só fui programado para reconhecer M ou F. Desculpe");
                    break;
            }
    }
}
