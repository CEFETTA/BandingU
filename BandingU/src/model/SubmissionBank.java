package model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author xande
 */
public class SubmissionBank implements Serializable{
    private final ArrayList<Submission> subBank;
    
    public SubmissionBank(){
    subBank = new ArrayList<>();
    }

    public ArrayList<Submission> getSubBank() {
        return subBank;
    }
    
    public void addSub(Submission sub){
        this.subBank.add(sub);
    }

}
