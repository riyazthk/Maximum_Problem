package com.maximum;

public class MaximumProblem<E extends Comparable<E>> {

    E firstValue;
    E secondValue;
    E thirdValue;



    public MaximumProblem(E firstValue,E secondValue, E thirdValue) {
        this.firstValue=firstValue;
        this.secondValue=secondValue;
        this.thirdValue=thirdValue;
    }


    public static  <E extends Comparable<E>> E compareValue(E firstValue,E secondValue,E thirdValue){
        E firstVal=firstValue;
        if(secondValue.compareTo(firstVal)>0){
            firstVal=secondValue;
        }
        if(thirdValue.compareTo(firstVal)>0){
            firstVal=thirdValue;
        }
        return  firstVal;
    }
    public  E findMaximum(){
        return compareValue(firstValue,secondValue,thirdValue);
    }
}
