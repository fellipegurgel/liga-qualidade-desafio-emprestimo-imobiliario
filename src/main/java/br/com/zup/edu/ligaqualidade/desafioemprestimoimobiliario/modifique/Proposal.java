package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique;

import java.util.*;

public class Proposal {
//    String eventId;
//    String eventTimestamp;
    String id;
    Double loanValue;
    Integer numberOfMonthlyInstallments;
    Map<String, Warranty> warranties;
    Map<String, Proponent> proponents;

    public Proposal(String id, Double loanValue, Integer numberOfMonthlyInstallments) {
        if (loanValue < 30000 || loanValue > 3000000)
            throw new IllegalArgumentException("Loan value must be between 30.000 and 3.000.000");
        if (numberOfMonthlyInstallments < 24 || numberOfMonthlyInstallments > 180)
            throw new IllegalArgumentException("Number of installments must be between 24 and 180 months");
//        this.eventId = eventId;
//        this.eventTimestamp = eventTimestamp;
        this.id = id;
        this.loanValue = loanValue;
        this.numberOfMonthlyInstallments = numberOfMonthlyInstallments;
        this.warranties = new HashMap<>();
        this.proponents = new HashMap<>();
    }

    public void addWarranty(Warranty warranty){

    }

    @Override
    public String toString() {
        return id;
    }
}
