package br.com.poshyweb;

import javax.swing.*;

public class Joption {

    private static final String JAVA = "JAVA";

    public static void main(String[] args) {
        String numero = JOptionPane.showInputDialog("Digite um nuemro");
        JOptionPane.showMessageDialog(null,"O numero que vc digitou foi "+numero);

        JOptionPane.showMessageDialog(null, "CONHECIMENTO JAVA","Aqui tem alguma coisa porra !!!", JOptionPane.WARNING_MESSAGE);

        int resposta = JOptionPane.showConfirmDialog(null, "Escolha a sua vida !!",
                "Escolha alguma coisa ",JOptionPane.YES_NO_OPTION);
        if (resposta == 0){
            System.out.println("Sim");
        }else{
            System.out.println("Não");
        }

        Object[] opcao = {" OK " ," CANCELAR ", "Nem um"};
        int resultado = JOptionPane.showOptionDialog(null, "Clieque em ok para confirmar", "Aviso",
                JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
                null, opcao, opcao[0]);
        if(resultado == 0){
            System.out.println("ok");
        }if (resultado == 1){
            System.out.println("Cancelado");
        }else{
            System.out.println("nem um cara ");
        }
        System.out.println("Sua resposta no verto é "+ resultado );

        Object[] combo = {" MAÇA " ," PERA ", "MELÃO"};
        Object selectdValue = JOptionPane.showInputDialog( null, "Escolha um item ","combo",JOptionPane.INFORMATION_MESSAGE
        ,null ,combo ,combo[0]);


        int beepCount = 10;
        for (int i = 0; i < beepCount; ++i) {
            System.out.println("Beep : " + i);
            // Ring the bell again using the Toolkit
            java.awt.Toolkit.getDefaultToolkit().beep();
            try {
                Thread.sleep(1000); // introduce delay
            } catch (InterruptedException e) {
            }
        }

    }
}
