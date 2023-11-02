package com.cursoProgramAndreo.Curso.ProgramAndreo;

public class Aula4 {
	public static void main(String[] args) {
//		criar variaveis com valores booleanos
		boolean verdadeiro = true;
		boolean falso = false;

//		Variaveis com valores booleanos de comparações

		int x = 1;
		int y = 2;
		
		boolean maior        = x >  y;        //  false
		boolean igual        = x == y;        //  false
		boolean maiorOuIgual = x >= y;        //  false
		boolean menorOuIgual = x <= y;        //  true
		boolean menor        = x <  y;        //  true
		boolean diferente    = x != y;        //  true

//		Variaveis com valores boleanos lógicos

		boolean ou = igual || diferente;      //  true, porque pelo menos uma é verdade
		boolean e = igual && diferente;       //  false, para ser true, todas precisariam ser verdade
		boolean not = !verdadeiro;            //  false, porque o not apenas inverte o valor

		boolean precedencia  = !false && true; //  true, porque começamos pelo not e depois pro e
		boolean precedencia2 = !false || false && true ; //  false, porque começamos pelo not, depois pro E, em seguida pro ou.
		boolean precedencia3 =
				!(false || false) && true ; //  true, porque começamos pelo parenteses que tem ou, depois o not, depois pro E.

		// Resumindo: usar parenteses pra ter certeza que o valor que deseja é o que sera calculado primeiro é uma boa prática

//		repassando a atividade

		System.out.printf("O x é maior que y? %b", maior);
		// ou
		System.out.printf("O x é maior que y? %b", x > y);
	}
}
