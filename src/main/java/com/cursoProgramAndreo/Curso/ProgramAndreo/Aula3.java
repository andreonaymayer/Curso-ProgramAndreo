package com.cursoProgramAndreo.Curso.ProgramAndreo;

import java.sql.SQLOutput;

public class Aula3 {
    public static void main(String[] args) {
// Variaveis inteiras
        int numero = 10;
        int numeroComOperacao = 10 * 5;
        int variavelComOperacao = numero + numeroComOperacao;
        int variavelComExpressao = 2 * ((numero + numeroComOperacao) / variavelComOperacao);
        int _5 = 5;

        // Para imprimir numeros inteiros:
        System.out.println(numero);
        System.out.println(1 + 2); // imprime o resultado da expressão
        System.out.println("O numero é" + numero); // concatena string com numero
        System.out.println((numero + numeroComOperacao) / variavelComOperacao); // imprime diretamente o valor da expressão
        System.out.printf("%d", numero); // utiliza o placeholder
        System.out.printf("%d", numero + 1); // utiliza o placeholder e coloca o valor da expressão
        System.out.println(_5); // tudo bem começar uma variavel com _ underline, só n pode numeros, espaços e acentos ou especiais

// Variaveis com ponto flutuante (double)
        double numeroQuebradoDouble = 1.50;
        double numeroComOperacao_ = 1.50 * 2.0;
        double variavelComOperacao_ = numeroQuebradoDouble * numeroComOperacao_;
        double variavelComExpressao_ = 2 * ((numeroQuebradoDouble + numeroQuebradoDouble) / numeroComOperacao_);

        float numeroQuebradoFloat = 1.50f;
        float numeroComOperacaoFloat = 1.50f * 2.0f;
        float variavelComOperacaoFloat = numeroQuebradoFloat * numeroComOperacaoFloat;
        float variavelComExpressaoFloat = 2 * ((numeroQuebradoFloat + numeroQuebradoFloat) / numeroComOperacaoFloat);

        // Para imprimir numeros de ponto flutuante double ou float:
        System.out.println(numeroQuebradoDouble);
        System.out.println(1.0f + 2.0f); // imprime o resultado da expressão
        System.out.println("O numero é " + numeroComOperacao_); // concatena string com numero
        System.out.println((numeroQuebradoFloat + numeroComOperacaoFloat) / variavelComOperacaoFloat); // imprime diretamente o valor da expressão
        System.out.printf("%.2f", numeroQuebradoFloat); // utiliza o placeholder sempre use %.<numero>f pra definir o tamanho das casas
        System.out.printf("%.2f", numeroQuebradoDouble); // utiliza o placeholder sempre use %.<numero>f pra definir o tamanho das casas

// Variaveis String (texto)
        String texto = "Palavras";
        String concatenando = "Algo" + texto;
        String ConcatenandoVariaveis = concatenando + texto;

        // Para imprimir texto
        System.out.println(texto);
        System.out.println(texto + "Alguma coisa");
        System.out.println(texto + concatenando);
        System.out.printf("%s%s", texto, texto); // resultado: PalavrasPalavras
        System.out.printf("%s", texto + " bonitas"); // resultado: Palavras bonitas

// Variaveis char (um caractere)
        char til = '˜';
        char asterisco = '*';
        char a = 'a';

        // Para imprimir char
        System.out.println(til);
        System.out.println(til + a);
        System.out.printf("%c", asterisco);

// Variáveis boolean (true,false)

        boolean verdadeiro = true;
        boolean falso = false;

        // Para imprimir boolean
        System.out.println(verdadeiro);
        System.out.println("Valor é  " + falso);
        System.out.printf("%b", falso);

// Lembre-se: é possivel misturar

        System.out.println("Tenho um numero inteiro que é " + numero + ". Mas se eu quiser, " +
                "eu posso ter ele como double:" + numeroQuebradoDouble + " ou float: " + numeroQuebradoFloat +
                ", alem disso, posso colocar valores booleanos " + verdadeiro + " além de caracteres, como o " +
                til + " e também textos e " + texto);

        System.out.printf("Tenho um numero inteiro que é %d. Mas se eu quiser, " +
                        "eu posso ter ele como double: %.2f ou float: %.2f, alem disso, posso colocar valores booleanos %b" +
                        "além de caracteres, como o %c e também textos e %s",
                numero, numeroQuebradoDouble, numeroQuebradoFloat, verdadeiro, til, texto); // podemos quebrar a string usando +

        String textoBase = "Aqui eu coloco o placeholder pra usar na função depois? %b";
        System.out.printf(textoBase, verdadeiro);

        String textoBase2 = "Aqui eu coloco o placeholder pra usar na função depois? %b.";
        System.out.printf(textoBase2 + "\n Caramba, não sabia disso...", verdadeiro);

        System.out.printf("Lembre-se também do %s de quebra de linha\n e que podemos colocar valores direto nos parametros", "caractere");

        // Se não usar \n no fim, quando a função for printf, olhe o que acontece:
        System.out.printf("%s","Texto");
        System.out.printf("%s","Texto2"); // o resultado disso será TextoTexto2.


        System.out.printf("%s"        ,                "OS ESPAÇOS NÃO IMPORTAM EM JAVA, mas não exagere, mantenah o código limpo");
    }
}
