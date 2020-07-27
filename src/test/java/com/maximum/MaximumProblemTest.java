package com.maximum;

import org.junit.Assert;
import org.junit.Test;

public class MaximumProblemTest {
    @Test
    public void toFind_Maximum_Number_PassValue_InThirdParameter() {
        MaximumProblem<Integer> maximumProblem = new MaximumProblem<Integer>(2, 3, 4);
        Integer maximum = maximumProblem.findMaximum();
        Integer expected = 4;
        Assert.assertEquals(expected, maximum);
    }

    @Test
    public void toFind_Maximum_Number_PassValue_InSecondParameter() {
        MaximumProblem<Integer> maximumProblem = new MaximumProblem<Integer>(2, 4, 3, 0);
        Integer maximum = maximumProblem.findMaximum();
        Integer expected = 4;
        Assert.assertEquals(expected, maximum);
    }

    @Test
    public void toFind_Maximum_Number_PassValue_InFirstParameter() {
        MaximumProblem<Integer> maximumProblem = new MaximumProblem<Integer>(4, 3, 2, 5);
        Integer maximum = maximumProblem.findMaximum();
        Integer expected = 5;
        Assert.assertEquals(expected, maximum);
    }

    @Test
    public void toFind_Maximum_FloatNumber_PassValue_InFirstParameter() {
        MaximumProblem<Float> maximumProblem = new MaximumProblem<Float>(1.4f, 1.3f, 1.2f, 1.1f);
        Float maximum = maximumProblem.findMaximum();
        Float expected = 1.4f;
        Assert.assertEquals(expected, maximum);
    }

    @Test
    public void toFind_Maximum_FloatNumber_PassValue_InSecondParameter() {
        MaximumProblem<Float> maximumProblem = new MaximumProblem<Float>(1.2f, 1.4f, 1.3f);
        Float maximum = maximumProblem.findMaximum();
        Float expected = 1.4f;
        Assert.assertEquals(expected, maximum);
    }

    @Test
    public void toFind_Maximum_FloatNumber_PassValue_InThirdParameter() {
        MaximumProblem<Float> maximumProblem = new MaximumProblem<Float>(1.2f, 1.3f, 1.4f);
        Float maximum = maximumProblem.findMaximum();
        Float expected = 1.4f;
        Assert.assertEquals(expected, maximum);
    }

    @Test
    public void toFind_Maximum_String_PassValue_InFirstParameter() {
        MaximumProblem<String> maximumProblem = new MaximumProblem<String>("Peach", "Apple", "Banana", "Orange");
        String maximum = maximumProblem.findMaximum();
        String expected = "Peach";
        Assert.assertEquals(expected, maximum);
    }

    @Test
    public void toFind_Maximum_String_PassValue_InSecondParameter() {
        MaximumProblem<String> maximumProblem = new MaximumProblem<String>("Apple", "Carrot", "Banana", "Orange");
        String maximum = maximumProblem.findMaximum();
        String expected = "Orange";
        Assert.assertEquals(expected, maximum);
    }

    @Test
    public void toFind_Maximum_String_PassValue_InThirdParameter() {
        MaximumProblem<String> maximumProblem = new MaximumProblem<String>("Apple", "Banana", "Peach");
        String maximum = maximumProblem.findMaximum();
        String expected = "Peach";
        Assert.assertEquals(expected, maximum);
    }
}
