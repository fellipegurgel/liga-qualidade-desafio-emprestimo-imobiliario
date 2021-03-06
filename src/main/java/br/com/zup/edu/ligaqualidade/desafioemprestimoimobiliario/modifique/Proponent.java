package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique;

public class Proponent {
    String id;
    String name;
    Integer age;
    Double monthlyIncome;
    Boolean isMain;

    public Proponent(String eventId, String eventTimestamp, String id, String name, Integer age, Double monthlyIncome, Boolean isMain) {
        if (age < 18)
            throw new IllegalArgumentException("Proponent must be 18+.");
        this.id = id;
        this.name = name;
        this.age = age;
        this.monthlyIncome = monthlyIncome;
        this.isMain = isMain;
    }
}
