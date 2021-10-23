/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptvr19gradusforenheit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Comp
 */
public class SPTVR19GradusForenheitTest {
    private static SPTVR19GradusForenheit obj; 
    
    @BeforeClass
     public static void RunT(){
        obj=new SPTVR19GradusForenheit();
        }

    
    @Test
        public void test_forenheitOne(){
            double gradF = obj.forenheit(15);
            Assert.assertTrue(gradF==59);
        }
    @Test
        public void test_forenheitTwo(){   
            double gradF = obj.forenheit(-10);
            Assert.assertTrue(gradF==14);
    }
    @Test
        public void test_forenheitWithComma(){   
            double gradF = obj.forenheit(999);
            Assert.assertTrue(gradF==1830.2);
    }
    @Test
        public void test_forenheitWithCommaTwo(){   
            double gradF = obj.forenheit(250.1);
            Assert.assertTrue(gradF==482.18);
    }       
    
}
