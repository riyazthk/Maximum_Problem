package com.maximum;

public class MaximumProblem {

    Integer thirdValue;
    Integer secondValue;
    Integer firstValue;

    public MaximumProblem(Integer firstValue, Integer secondValue, Integer thirdValue) {
        this.firstValue=firstValue;
        this.secondValue=secondValue;
        this.thirdValue=thirdValue;
    }
    public Integer compareValues(){
        Integer firstVal=firstValue;
        if(secondValue.compareTo(firstVal)>0){
            firstVal=secondValue;
        }
        if(thirdValue.compareTo(firstVal)>0){
            firstVal=thirdValue;
        }
        return  firstVal;
    }
    public Object findMaximum() {
        Object max=compareValues();
        return max;
    }
}
