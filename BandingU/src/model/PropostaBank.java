package model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author xande
 */
public class PropostaBank implements Serializable{
    private final ArrayList<Proposta> bank;

    public PropostaBank(){
    this.bank = new ArrayList<>();
    }

    public ArrayList<Proposta> getBank() {
        return bank;
    }
    
   public void addProposta(Proposta purp){
       bank.add(purp);
   }

}
