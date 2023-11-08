# Guia do mestre supremo para pegar detalhezinhos em java.

Dicas para não se perder quando estiver programando.

**Conteudos:**
<!-- TOC -->
* [Guia do mestre supremo para pegar detalhezinhos em java.](#guia-do-mestre-supremo-para-pegar-detalhezinhos-em-java)
  * [Sempre tem o ; no final de cada comando](#sempre-tem-o--no-final-de-cada-comando)
  * [Tudo que abre, fecha](#tudo-que-abre-fecha)
  * [Tipos de dados](#tipos-de-dados)
  * [Nomeando variaveis](#nomeando-variaveis)
  * [Operadores aritmeticos](#operadores-aritmeticos)
  * [Operadores de comparação](#operadores-de-comparação)
  * [Operadores lógicos](#operadores-lógicos)
  * [SCANNER - Entrada de dados](#scanner---entrada-de-dados)
  * [IF ELSE](#if-else)
  * [CASE](#case)
  * [Comparando coisas](#comparando-coisas)
  * [PRINT - Saida de dados](#print---saida-de-dados)
<!-- TOC -->

## Sempre tem o ; no final de cada comando

Tudo bem quebrar linha na metade do comando, ou colocar varios espaços, mas não esqueça que ao fim do comando deve haver um ponto e virgula.

```java
public class Main { 
    public static void main(String[] args) {
        System.out.println
                ("Olá mundo"); // ok
        
        System.out.println("Olá mundo maravilhoso que tanto amo, " +
                "nasci e fui criado aqui " +
                "nesse planeta lindo."); 
        // apenas concatena, quebra a linha e segue até o fim do comando

        System 
            .out
            .println
            ("Olá mundo"); // ok
    }
}
```

Entendam que isso é possível, mas não necessariamente recomendado, apenas quando é necessário.

## Tudo que abre, fecha

Em java, parenteses (), chaves {} e colchetes [] servem para delimitar informações, por isso sempre devem começar e finalizar algo.

Chamamos o espaço entre uma chave, parenteses ou colchete de escopo.

**Exemplo certo:**

```java
public class Main { //aqui inicia a classe Main
    public static void main(String[] args) { // aqui inicia a função main
        
        // apenas o que estiver dentro dessa classe será executado
        System.out.println("Olá mundo");
        
    } // aqui finaliza a função main
} //aqui finaliza a classe Main
```

**CUIDADO PARA NÃO FAZER ISSO:**

```java
public class Main {
    public static void main(String[] args) { 
    } System.out.println("Olá mundo"); //observe que esse cara não está dentro das duas chaves
}
```

## Tipos de dados

Entre outros tantos, vamos usar mais esses tipos de dados:

| Tipo    | Exemplo de valores                       |
|---------|------------------------------------------|
| int     | numeros sem virgula: 1,2,3,4,-1,-3       |
| double  | numero quebrado: 1.2,3.0,-1.5 ...        |
| float   | numero quebrado: 1.2,3.0,-1.5 ...        |
| String  | Textos: "Andreo", "Aula", "Dia" ...      |
| boolean | Verdadeiro ou falso: true, false         |
| char    | apenas um caractere: 'a','$','5', '"'... |

Criando variaveis com esses tipos:

```java
class Tipos {
    
    int idade = 10;
    float salario = 21345.23f;
    double altura = 1.75;
    char sexo = 'F';
    String nome = "Andreo";
    boolean ligado = false; 
}
```

## Nomeando variaveis

4 regras simples:
- nunca começar variaveis com numeros, apenas letras minusculas ou _
- não pode espaço, caracteres especiais e acentos
- usar padrao camelCase, que vai colocar letra maiuscula para cada nova palavra se houver
- colocar nomes objetivos e descritivos

**Exemplos:**

| Errado                       | Certo                        |
|------------------------------|------------------------------|
| ``int 1nota = 1;``           | ``int _1nota = 1;``          |
| ``int Nota = 1;``            | ``int nota = 1;``            |
| ``int nome grande = 1;``     | ``int nomeGrande = 1;``      |
| ``boolean éCroança = true;`` | ``boolean eCrianca = true;`` |



## Operadores aritmeticos

| Simbolo | Operação               |
|---------|------------------------|
| +       | soma                   |
| -       | subtração              |
| /       | divisão                |
| *       | multiplicação          |
| %       | mod (resto da divisão) |

## Operadores de comparação

comparam coisas, como números, textos, caracteres ou objetos

| Simbolo | Operação           |
|---------|--------------------|
| \>      | maior que          |
| <       | menor que          |
| \>=     | maior ou igual que |
| <=      | menor ou igual que |
| ==      | igual que          |
| !=      | diferente de       |

## Operadores lógicos

Comparam valores boleanos

| Simbolo | Operação  |
|---------|-----------|
| &&      | E - and   |
| \|\|    | OU - or   |
| !       | não - not |

## SCANNER - Entrada de dados

Use o Scanner para isso. ``Scanner scanner = new Scanner(System.in);``

Exemplo de uso para cada tipo de dado:
```java
import java.util.Scanner;
//lembre-se de importar o scanner para seu código

class EntradaDeDados {
    Scanner scanner = new Scanner(System.in);
    
    int idade = scanner.nextInt();
    double altura = scanner.nextDouble();
    float salario = scanner.nextFloat();
    boolean ligado = scanner.nextBoolean();
    // string e char sempre usar um a mais antes da atribuição:
    scanner.nextLine();
    String nome = scanner.nextLine();
    // para char alem de usar um nextLine extra, use o comando charAt(0) ao final
    scanner.nextLine();
    char letra = scanner.nextLine().charAt(0);
}
```

## IF ELSE

```java
class IfElse {
    int valor = 10;
    
    if (valor >= 10) {
        // bloco que será executado caso for verdadeira a condição entre parenteses (parametro)
    } else {
        // bloco que será executado caso for falsa a condição entre parenteses (parametro)
    }
}
```

Lembre-se que é possivel if sem else, e também encadear ifs dentro de ifs, **exemplo:**
```java
class IfElseEncadeado {
    int idade = 15;
    
    if (idade < 15) {
        System.out.println("Festa de criança");
    } else if (idade == 15) {
        System.out.println("Festa de 15 anos");
    } else {
        System.out.println("Festa de adolescente com mais de 15");
    }
}
```

## CASE

```java
class IfElse {
    int filhos = 1;
    
    switch (filhos) {
        case 0:
            System.out.println("Sem filhos");
            break;
        case 1:
            System.out.println("Filho mimado");
            break;
        case 2:
            System.out.println("Pais endividados");
            break;
        default: // o bloco default é executado caso nenhum dos valores de case sejam iguais ao do parametro
            System.out.println("Não sei dizer");
            break;
    }
}
```


- Lembre-se que é possivel fazer um switch sem o default.
- Lembre-se sempre de colocar o break, após cada case, se não ele executa mais de um até encontrar o break.

## Comparando coisas

**Comparadores**
```java
class ComparandoCoisas {
    boolean umMaiorQueZero = 1>0;
        // o java vai fazer a operação e atribuir o valor na variavel, nesse caso true
    boolean oCaractereAEhIgualAoCaractereX = 'a' == 'x';
        // o java vai fazer a operação e atribuir o valor na variavel, nesse caso false
    boolean textosIguais = "Andreo".equals("Andreo");
    boolean textosIguais = "Andreo" == "Andreo";
        // as duas formas funcionam e resultam o mesmo valor, true.
    boolean ehVerdadeiro = true == true;
        // o java vai fazer a operação e atribuir o valor na variavel, nesse caso true
}
```

**Lógico**
```java
class ComparandoCoisas {
    boolean or = true || false;
        // true, porque pelo menos uma é verdadeira para o or
    boolean and = true && true;
        // true, porque as duas são verdadeiras
    boolean not = !true;
        // false, porque inverte o valor
}
```
Consulte a tabela verdade para mais informações sobre isso, aqui apenas saiba que é possivel.

## PRINT - Saida de dados

os comandos que imprimem na tela são:

``System.out.println("Aqui você apenas concatena " + "as coisas usando +");``

Resultado: _Aqui você apenas concatena as coisas usando +_

``System.out.printf("Aqui você apenas concatena %s ", "As coisas, usando placeholders");``

Resultado: _Aqui você apenas concatena as coisas usando placeholders_

PS: o printf sempre precisa de mais de um parametro, o primeiro sempre contendo os placeholders.

Tipos de placeholders para usar com o printf

| Tipo                | Exemplo                                                |
|---------------------|--------------------------------------------------------|
| %d - inteiros       | ``System.out.printf("Minha idade é %d anos", 25);``    |
| %s - textos         | ``System.out.printf("Meu nome é %s", "Andreo");``      |
| %b - boolean        | ``System.out.printf("Ligado: %b", true);``             |
| %c - boolean        | ``System.out.printf("o %c é uma vogal", 'a');``        |
| %.2f - float/double | ``System.out.printf("Numero quebrado: %.2f", 3.123);`` |

Observem que o numero que eu coloco em %.2f, quando estou criando um placeholder para float ou double, 
é o de casas decimais depois do zero que serão exibidas.

Lembrem-se que o println adiciona o caractere \n, que quebra a linha.
Se não quiserem quebrar a linha utilizem ``System.out.print("Seu texto");`` ou ``System.out.printf("Seu %s", "texto");`` 
