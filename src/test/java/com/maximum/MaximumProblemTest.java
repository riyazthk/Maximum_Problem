package com.maximum;

import org.junit.Assert;
import org.junit.Test;

public class MaximumProblemTest {
    @Test
    public void toFind_Maximum_Number_PassValue_InThirdParameter() {
        MaximumProblem maximumProblem = new MaximumProblem<Integer>(2,3,4);
        Object maximum = maximumProblem.findMaximum(2,3,4);
        Assert.assertEquals(4, maximum);
    }
    @Test
    public void toFind_Maximum_Number_PassValue_InSecondParameter() {
        MaximumProblem maximumProblem = new MaximumProblem<Integer>(2,4,3);
        Object maximum = maximumProblem.findMaximum(2,4,3);
        Assert.assertEquals(4, maximum);
    }
    @Test
    public void toFind_Maximum_Number_PassValue_InFirstParameter() {
        MaximumProblem maximumProblem = new MaximumProblem<Integer>(4,3,2);
        Object maximum = maximumProblem.findMaximum(4,3,2);
        Assert.assertEquals(4, maximum);
    }
    @Test
    public void toFind_Maximum_FloatNumber_PassValue_InFirstParameter() {
        MaximumProblem maximumProblem = new MaximumProblem(1.4,1.3,1.2);
        Object maximum = maximumProblem.findMaximum(1.4,1.3,1.2);
        Assert.assertEquals(1.4, maximum);
    }
    @Test
    public void toFind_Maximum_FloatNumber_PassValue_InSecondParameter() {
        MaximumProblem maximumProblem = new MaximumProblem(1.2,1.4,1.3);
        Object maximum = maximumProblem.findMaximum(1.2,1.4,1.3);
        Assert.assertEquals(1.4, maximum);
    }
    @Test
    public void toFind_Maximum_FloatNumber_PassValue_InThirdParameter() {
        MaximumProblem maximumProblem = new MaximumProblem(1.2,1.3,1.4);
        Object maximum = maximumProblem.findMaximum(1.2,1.3,1.4);
        Assert.assertEquals(1.4, maximum);
    }
    @Test
    public void toFind_Maximum_String_PassValue_InFirstParameter() {
        MaximumProblem maximumProblem = new MaximumProblem("Peach","Apple","Banana");
        Object maximum = maximumProblem.findMaximum("Peach","Apple","Banana");
        Assert.assertEquals("Peach", maximum);
    }
    @Test
    public void toFind_Maximum_String_PassValue_InSecondParameter() {
        MaximumProblem maximumProblem = new MaximumProblem("Apple","Peach","Banana");
        Object maximum = maximumProblem.findMaximum("Apple","Peach","Banana");
        Assert.assertEquals("Peach", maximum);
    }
    @Test
    public void toFind_Maximum_String_PassValue_InThirdParameter() {
        MaximumProblem maximumProblem = new MaximumProblem("Apple","Banana","Peach");
        Object maximum = maximumProblem.findMaximum("Apple","Banana","Peach");
        Assert.assertEquals("Peach", maximum);
    }
}
