package dk.easv.extendedcalculator.be;

public class Result {

    private double input1;
    private double input2;
    private String operator;
    private double result;

    public Result(double input1, double input2, String operator, double result){
        this.input1 = input1;
        this.input2 = input2;
        this.operator = operator;
        this.result = result;
    }

    @Override
    public String toString(){
        return input1+" "+operator+" "+input2+" = "+result;
    }

}
