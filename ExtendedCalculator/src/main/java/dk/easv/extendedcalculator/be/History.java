package dk.easv.extendedcalculator.be;

import java.util.ArrayList;
import java.util.List;

public class History {

    List<String> history = new ArrayList<>();

    public void addHistory(String input1, String operator, String input2, String result){
        history.add(input1+" "+operator+" "+input2+" = "+result);
    }

    public void printHistory(){
        for(String h : history){
            System.out.println(h);
        }
    }



}
