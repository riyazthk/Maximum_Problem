package com.maximum;

import org.junit.Assert;
import org.junit.Test;

public class MaximumProblemTest {
    @Test
    public void toFind_Maximum_Number_PassValue_InThirdParameter() {
        MaximumProblem maximumProblem = new MaximumProblem(2,3,4);
        Object maximum = maximumProblem.findMaximum();
        Assert.assertEquals(4, maximum);
    }
    @Test
    public void toFind_Maximum_Number_PassValue_InSecondParameter() {
        MaximumProblem maximumProblem = new MaximumProblem(2,4,3);
        Object maximum = maximumProblem.findMaximum();
        Assert.assertEquals(4, maximum);
    }
    @Test
    public void toFind_Maximum_Number_PassValue_InFirstParameter() {
        MaximumProblem maximumProblem = new MaximumProblem(4,3,2);
        Object maximum = maximumProblem.findMaximum();
        Assert.assertEquals(4, maximum);
    }
}
