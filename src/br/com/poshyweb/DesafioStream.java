package br.com.poshyweb;

import java.util.*;

public class DesafioStream {
    private  static String  templateLong = "Quantidade de pares da lista e %d é : %d";

    public static void main(String[] args) {

        List<Integer> lista1 = Arrays.asList(10,20,20,10,30,40,10,50,10,10);
        log(1, contaPares(lista1));

        List<Integer> lista2 = Arrays.asList(10,20,20,10,30,40,10,50,10,10);
        log(2, contaPares(lista2));

        List<Integer> lista3 = Arrays.asList(10,20,10,30,40,10,50,10,10,13,13,13,13);
        log(3, contaPares(lista3));



    }

    private static  Integer contaPares(List<Integer> list) {

        //passo 1 pego so os diferetes
        Set<Integer> listaSemRepetição = new HashSet<>(list);


        // verificar a quantidade de veses que se repete na lista
        Map<Integer, Integer> repeticao = new HashMap<>();
        listaSemRepetição.forEach(lsr -> repeticao.put(lsr, Collections.frequency(list, lsr)));

       return repeticao.values().stream()
               .filter(valor -> valor > 1)
               .mapToInt(valor -> valor / 2)
               .sum();
    }



}
