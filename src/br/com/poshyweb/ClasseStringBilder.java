package br.com.poshyweb;

public class ClasseStringBilder {

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("abcdef");
        System.out.println(stringBuilder);

        stringBuilder.insert(0, "F");

        stringBuilder.delete(0, 2);
        System.out.println(stringBuilder);

        stringBuilder.deleteCharAt(1);
        System.out.println(stringBuilder);

        StringBuilder nomeAoContrario = new StringBuilder("Roberto");
        System.out.println(nomeAoContrario.reverse());
        //nome converte.reverse();
        String test = nomeAoContrario.toString();

    }
}
