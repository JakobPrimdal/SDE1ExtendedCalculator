package dk.easv.extendedcalculator.bll;

import dk.easv.extendedcalculator.be.Result;

import java.util.ArrayList;
import java.util.List;

public class HistoryLogic {

    List<Result> history = new ArrayList<>();

    public void addHistory(double input1, double input2, String operator, double result){
        history.add(new Result(input1, input2, operator, result));
    }

    public List<Result> getHistory(){
        return history;
    }

}
