package br.com.poshyweb;

import jdk.internal.org.objectweb.asm.tree.MultiANewArrayInsnNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StremClasses {
    public static void main(String[] args) {

        List<Aluos> alunos = new ArrayList<>();
        alunos.add(new Aluos("001", "Roberto", 31));
        alunos.add(new Aluos("001", "Roberto", 31));
        alunos.add(new Aluos("002", "Leonardo", 19));
        alunos.add(new Aluos("003", "Antonio", 16));
        alunos.add(new Aluos("004", "Guibert", 13));

//        int count = 0;
//        for (int i =0 ; i < alunos.size(); i++){
//            if (alunos.get(i).getIdade() > 19){
//                count +=1;
//            }
//        }
//        System.out.println("quantidade de alunso om idade maior que 30:" + count);
//
//        for (Aluos alu: alunos) {
//            if (alu.getIdade() > 30) {
//                count += 1;
//            }
//        }
//        System.out.println("quantidade de alunso om idade maior que 30:" + count);

//        alunos.forEach(aluno -> {
//            int cout = 0;
//            if (aluno.getIdade() > 30 )
//                aluno.setNome("Roberto 2");
//            });
//        alunos.forEach(System.out::println);

        long  count1 = alunos.stream()//trasfoma nossa collection em Stram
                .filter(a -> a.getIdade() > 30) .count(); // filtra os dados cm paramentros
//                .collect(Collectors.toList()) // trasfoma a strem para  Colection novamente
//                .size(); // tamanho da lista

        System.out.println("Qauntidade de alunos com idade maior que 30 " +count1);

       Set<String> nomes = alunos.stream().map(a -> a.getNome()).collect(Collectors.toSet());
        System.out.println(nomes);


        HashMap<String, String> mapaEstados = getMapa();
        for (String sigla : mapaEstados.keySet()) {System.out.print(sigla + " "); }

        System.out.println();
    }
    public HashMap<String, String> getMapa() {
        HashMap<String, String> map = new HashMap<>();
        map.put("AC", "Acre");
        map.put("AL", "Alagoas");
        map.put("AP", "Amapá");
        map.put("AM", "Amazonas");
        map.put("BA", "Bahia");
        map.put("CE", "Ceará");
        map.put("DF", "Distrito Federal");
        map.put("ES", "Espírito Santo");
        map.put("GO", "Goiás");
        //resto dos put()
        return map; }
//    for (Map.Entry<String, String> entrada : mapaEstados.entrySet()) {
//        System.out.println(entrada);
//    }

}
