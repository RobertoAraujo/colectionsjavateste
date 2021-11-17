package br.com.poshyweb;

public class Desafio02 {
    public static void main(String[] args) {
        String musica = "O sapo nao lava o pé nao lava porque nao quer Ele mora lá na lagoa Não lava o pé porque não quer";
        System.out.println(musica);

       musica = musica.replaceAll("[ueioãéáEO]", "a");
       System.out.println(musica.replaceAll("[aa]", "a"));

        musica = musica.replaceAll("[aeiouAEIOUãé]", "e");
        System.out.println(musica.replaceAll("[ee]", "e"));

//
//        String soAceitoNumeros = "o sapo nao lava 1 pe nao 2lava porque3 nao 4quer ele 5mora la na lagoa9";
//        System.out.println(soAceitoNumeros.replaceAll("[^0-9 ]", ""));
//
//        String soAceitoLetras = "o 1sapo 2nao 3lava 4o 5pe 6nao 7lava 8porque 9nao 10quer 11ele 12mora 13la 14na 15lagoa";
//        System.out.println(soAceitoNumeros.replaceAll("[^1-20]", ""));



    }
}
