package com.repaso.IFuncional;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
    InterfazFuncionalSimpleImp<Integer> ifs = new InterfazFuncionalSimple();
    ifs = (a, b) -> (a * b);
    int multiplicacion = ifs.test(5, 6);
        System.out.println(multiplicacion);
        ifs = (a, b) -> (a / b);
        int division = ifs.test(5, 6);
        System.out.println(division);
        ifs = (d, c) -> {
            int a = c + d;
            int b = c + d;
          return a - b;
        };
        /**
         * Creamos una lista y queremos recupera un nombre de la lista con una lambda
         */
        List<String> nombre = new ArrayList<>();
        nombre.add("Pepi");
        nombre.add("pito");
        nombre.add("ito");
        nombre.add("Pep");
        /**
         * Filtro con stream que trabaja sobre listas que te permite hacer comprobaciones.
         * todos los stream que sea igual a este filtro y ademas le decimos que los cuente.
         * tambien podemos contar el contenido de la lista
         */
        long counta = nombre.stream().filter(s -> s.equals("ito")).count();
        System.out.println(counta);

        nombre.forEach(t -> System.out.println(t.toUpperCase()));

    }
}
