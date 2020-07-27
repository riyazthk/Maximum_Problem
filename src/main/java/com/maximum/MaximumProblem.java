package com.maximum;

public class MaximumProblem<E extends Comparable<E>> {

    E firstValue;
    E secondValue;
    E thirdValue;
    E[] optional;


    public MaximumProblem(E firstValue, E secondValue, E thirdValue, E... optional) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.thirdValue = thirdValue;
        this.optional = optional;
    }


    public static <E extends Comparable<E>> E compareValue(E firstValue, E secondValue, E thirdValue, E... optional) {
        E max = firstValue;

        if (secondValue.compareTo(max) > 0) {
            max = secondValue;
        }
        if (thirdValue.compareTo(max) > 0) {
            max = thirdValue;
        }
        if (optional != null) {
            for (E values : optional) {
                if (values.compareTo(max) > 0) {
                    max = values;
                }
            }
        }
        printMax(max);
        return max;
    }

    private static <E extends Comparable<E>> void printMax(E max) {
        System.out.println(max);
    }

    public E findMaximum() {
        return compareValue(firstValue, secondValue, thirdValue, optional);
    }


}
