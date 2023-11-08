# Guia do mestre supremo para pegar detalhezinhos em java.

Dicas para não se perder quando estiver programando.

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

## Entrada de dados

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

