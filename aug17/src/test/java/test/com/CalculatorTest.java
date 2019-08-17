/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.com;

import com.itsexps.Calculator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Midwest
 */
public class CalculatorTest {
    Calculator cal;
    public CalculatorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
         cal=new Calculator();
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
//    @Test
//     public void testName() {
//     cust.setName("tom");
//     assertEquals("tom",cust.getName());
//     }
//    
     @Test
     public void testAdd() {
     assertEquals(4, cal.add(2,2));
     
     }
     public void testSub() {
     assertEquals(4, cal.add(6,2));
     
     }
    
    
}
