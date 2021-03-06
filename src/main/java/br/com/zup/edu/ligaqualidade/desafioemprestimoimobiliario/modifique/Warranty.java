package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique;

import java.util.ArrayList;
import java.util.Arrays;

public class Warranty{
    String id;
    Double value;
    String province;
    ArrayList notAllowedProvinces = new ArrayList(Arrays.asList("PR", "SC", "RS"));

    public Warranty(String eventId, String eventTimestamp, String id, Double value, String province) {
        if (notAllowedProvinces.contains(province))
            throw new IllegalArgumentException("Province not allowed");
        this.id = id;
        this.value = value;
        this.province = province;
    }
}
