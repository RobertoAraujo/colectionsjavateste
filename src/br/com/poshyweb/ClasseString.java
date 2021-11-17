package br.com.poshyweb;

import java.util.Locale;

public class ClasseString {
    public static void main(String[] args) {
        String frase = "Aqui temos uma frase!!!!!";

        //charAt
        System.out.println("Buscando caracterer pelo indice :"+ frase.charAt(9));

        //concat
        System.out.println("Buscando caracterer pelo indice :"+ frase.concat(": Usando concat aquio nees bagulho"));

        //contains
        System.out.println(frase.contains("Aqui"));

        //equals
        System.out.println(frase.equals("Aqui temos uma frase!!!!!"));

        //equalsIgnoreCase
        System.out.println(frase.equalsIgnoreCase("Aqui temos uma frase!!!!!"));

        //indexOf
        System.out.println(frase.indexOf("A"));

        //lastIndexOf
        System.out.println(frase.lastIndexOf("a"));

        //length
        System.out.println(frase.length());

        //toLowerCase
        System.out.println(frase.toLowerCase());

        //toUpperCase
        System.out.println(frase.toUpperCase());


        String fase2 = " Fulano deltrano ciclano aqui!";

        //trim tira os espacos
        System.out.println(fase2.trim());

        System.out.println(fase2.length());

        //toUpperCase coloca tudo maioculo
        System.out.println(fase2.replace("e", "A"));

        //subString ele corta a strng
        String fasecompleta = fase2.substring(0,20);
        System.out.println("fase aqui "+fasecompleta);

        // valuOf trasfoma em string
        Long numero =10L;
        String s = String.valueOf(numero);
        System.out.println(s);


        Long numero1 =1L;
        String s2 = "O valor do %d primeiro para  e %2d";
        // fomat string
        System.out.println(String.format(s2,1 ,1000));
        System.out.println(String.format(s2,2 ,800));
        System.out.println(String.format(s2,3 ,500));


        //split seve para dividir uma determidando string
        String linha = "12;34;56789;782;222;Roberto";
        String [] split = linha.split(";");
        for (String valor : split){
            System.out.println(valor);
        }



    }
}
