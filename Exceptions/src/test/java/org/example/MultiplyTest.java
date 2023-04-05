package org.example;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultiplyTest {
    private Multiply multiply = new Multiply();

    @org.junit.Test
    public void umn() {
        int a = 2, b = 4, res = 0;
        try {
            res = multiply.umn(a, b);
        } catch (NotEvenExceptions e) {
            throw new RuntimeException(e);
        }
        Assert.assertEquals(res, 8);
    }

    @Test(expected = NotEvenExceptions.class)
    public void exceptionTest() throws NotEvenExceptions {
        int a = 2, b = 3, res = 0;
        res = multiply.umn(a, b);

    }

}