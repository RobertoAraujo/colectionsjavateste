package br.com.poshyweb;

import java.util.Calendar;
import java.util.Date;

public class DataClase {
    public static void main(String[] args) {
        Date data = new Date();
        System.out.println("Data Agora: "+data);

        Calendar c = Calendar.getInstance();

        System.out.println("Data/Hora atual: "+c.getTime());
        System.out.println("Ano: "+c.get(Calendar.YEAR));
        System.out.println("Mês: "+c.get(Calendar.MONTH));
        System.out.println("Dia do Mês: "+c.get(Calendar.DAY_OF_MONTH));

    }
}
