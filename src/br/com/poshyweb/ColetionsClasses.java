package br.com.poshyweb;

import java.util.*;

public class ColetionsClasses {
    public static void main(String[] args) {
        // haset
        Set<String> alunos =new HashSet<>();
        alunos.add("Roberto");
        alunos.add("Edsom");
        alunos.add("Roberto");
        alunos.add("gGibert");

        System.out.println(alunos);
        System.out.println("-----------------------------------");
        // quando eu quise  que se repita na lista
        List<String> alunso2= new ArrayList<>();
        alunso2.add("novo1");
        alunso2.add("novo2");
        alunso2.add("novo3");
        alunso2.add("novo1");
        alunso2.add("novo2");
        alunso2.add("novo1");

        alunso2.forEach(System.out::println);
        System.out.println("-----------------------------------");

        /// desafio pai tonhinho sempre ordena e
        Set<String> lista = new TreeSet<>();
        lista.add("Beatriz");
        lista.add("Ana");
        lista.add("Carla");
        lista.add("Pedro");
        lista.add("Edinho");
        lista.add("Tonhinho");

        lista.forEach(System.out::print);

        System.out.println();
        System.out.println("-----------------------------------");


        /// desafio pai tonhinho map sempre receb dois paramentors a chave o o valor
       Map<Long, String> lista2 =new HashMap<>();
        lista2.put(1L, "Roberto");
        lista2.put(2L, "Edson");
        lista2.put(3L, "Guibert");
        lista2.put(4L, "Lonardo" );
        lista2.put(5L, "Donatelo");
        lista2.put(6L, "Santa Tartaruga");

        for (Map.Entry<Long, String> entry : lista2.entrySet()){
            System.out.println(entry.getKey() +" /  "+ entry.getValue());
        }
//        lista2.remove(1L );
//
//        lista2.replace(2L, "Roberto 2");
//
//        System.out.println(lista2);
//
//        lista2.remove(1L);
//
//        System.out.println(lista2);






    }
}
