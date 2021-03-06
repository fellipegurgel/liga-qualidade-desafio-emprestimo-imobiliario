package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solucao {

//    public static void main(String[] args) {
//      Proposal p = new Proposal("","","sssssss",30000.1, 24);
//      Proposal p2 = new Proposal("","","aaaaaa",30000.1, 24);
//      validPropolsals.put("sssssss",p);
//      validPropolsals.put("aaaaaaaa",p2);
//      processMessages(null);
//    }
	
  public static String processMessages(List<String> messages) {
      Map<String, Proposal> validPropolsals = new HashMap<>();

      //process input
      for (String message : messages){
          String[] splitedInput = message.split(",");
          String eventSchema = splitedInput[1];
          Proposal newProposal;
          if (eventSchema.equals("proposal")) {
              //gets inputs
              String propolsalId = splitedInput[4];
              Double loanValue = Double.parseDouble(splitedInput[5]);
              Integer numberMonthlyInstallments = Integer.parseInt(splitedInput[6]);
              newProposal = new Proposal(propolsalId, loanValue, numberMonthlyInstallments);
              validPropolsals.put(propolsalId, newProposal);
          } else if (eventSchema.equals("warrenty")) {
              String proposalId = splitedInput[4];
              String warrantyId = splitedInput[5];
              Double warrantyValue = Double.parseDouble(splitedInput[6]);
              String warrantyProvince = splitedInput[7];
              Warranty warranty = new Warranty(warrantyId, warrantyValue, warrantyProvince);
              Proposal proposal = validPropolsals.get(proposalId);
              proposal.warranties.put(warrantyId, warranty);
          } else {

          }

      }
	  return validPropolsals.keySet().toString().replaceAll("\\[|\\]","");
  }
}