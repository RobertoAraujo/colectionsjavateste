package br.com.poshyweb;

import java.util.HashMap;

public class Mapa {
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
}
