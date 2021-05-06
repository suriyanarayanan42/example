package com.studentpaymentapp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class TestStudentValidate {
     @Test
     public void testStudentValidation() {
    	 boolean isvalid=Student.studentValidater("1712113","8934842651");
    	 assertEquals(true,isvalid);
     }
     @Test
     public void testPayment() {
    	 String isvalid=Student.Payment("1712113","80000");
    	 assertEquals("paid",isvalid);
    	 Student.dispalyStudentDetails();

     }
}
