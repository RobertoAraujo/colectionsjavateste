package br.com.poshyweb;

import java.util.Scanner;

public class Desafio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Entre com Primeiro valor: ");
        int valor = entrada.nextInt();
        System.out.println("Entre com Segundo valor: ");
        int valor2 = entrada.nextInt();
        System.out.println( "A soma dos valores é : " + (valor + valor2));

    }
}
