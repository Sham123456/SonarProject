package com.testJMockIt.test;
import com.testJMockIt.ClassWithPrivateMethods;
import mockit.Deencapsulation;
import mockit.Tested;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestClassWithPrivateMethods {

    @Tested
    private ClassWithPrivateMethods classWithPrivateMethods;

    @Test
    public void testReturnSumSuccess(){
        int sum = Deencapsulation.invoke(classWithPrivateMethods,"returnSum",1,2);
        assertEquals(3, sum);
    }

    @Test
    public void testIfDifferenceIsSuccess(){
        int diff = Deencapsulation.invoke(classWithPrivateMethods, "returnDiff",8,5);
        assertEquals(3, diff);
    }

}
