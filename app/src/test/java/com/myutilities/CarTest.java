package com.myutilities;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarTest {
    @Test
    void testName(){
        Car c=new Car("Hello");
        Assertions.assertEquals("Hello",c.getMake());
    }

}