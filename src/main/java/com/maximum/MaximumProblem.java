package com.maximum;

public class MaximumProblem<E extends Comparable<E>> {

    E firstValue;
    E[] optional;


    public MaximumProblem(E firstValue, E... optional) {
        this.firstValue = firstValue;
        this.optional = optional;
    }


    public static <E extends Comparable<E>> E compareValue(E firstValue, E... optional) {
        E max = firstValue;
        for (E value : optional) {
            if (value.compareTo(max) > 0) {
                max = value;
            }
        }
        return max;
    }

    public E findMaximum() {
        return compareValue(firstValue, optional);
    }

    public static String testMaximum(String x, String y, String z) {
        String max = x;
        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }
        return max;
    }

    public static void main(String[] arg, String xstr, String ystr, String zstr) {
        Integer xInteger = 2, yInteger = 3, zInteger = 4;
        Float xFloat = 6.6f, yFloat = 8.0f, zFloat = 7.7f;
        String xString = "pear", yString = "apple", zString = "orange";
        MaximumProblem.testMaximum(xstr, ystr, zstr);
        Comparable integerMax = new MaximumProblem(xInteger, yInteger, zInteger).findMaximum();
        System.out.println(integerMax);
        Comparable floatMax = new MaximumProblem(xFloat, yFloat, zFloat).findMaximum();
        System.out.println(floatMax);
        Comparable StringMax = new MaximumProblem(xString, yString, zString).findMaximum();
        System.out.println(StringMax);

    }
}
