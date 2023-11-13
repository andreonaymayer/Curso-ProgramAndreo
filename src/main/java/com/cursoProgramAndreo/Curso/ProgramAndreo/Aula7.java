package com.cursoProgramAndreo.Curso.ProgramAndreo;

public class Aula7 {
    public static void main(String[] args) {
        // do - while
        int x = 0;
        do {
            System.out.println(x);
            x++; // sem isso, fica em looping eterno, isso é como x = x + 1; ou seja, soma +1
        } while (x < 10);

        // while
        while (x != 0) {
            x--; // sem isso, fica em looping eterno, isso é como x = x - 1; ou seja, diminui -1
        }

        // for
        for (x=0; x<10; x++) { //primeiro colocamos um valor em x, depois comparamos ele, e depois somamos um
            System.out.println(x);
        }

        for (int i = 0; i == 10; i++){
            System.out.println(i);
        }

    }


}
