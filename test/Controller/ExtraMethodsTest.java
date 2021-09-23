/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import Controller.ExtraMethods;
/**
 *
 * @author User
 */
public class ExtraMethodsTest {
    ExtraMethods e;
   
    @Before
    public void setUp() throws Exception{
        e = new ExtraMethods();
    }
    

    /**
     * Test of main method, of class ExtraMethods.
     */
    @Test
    public void testgetProfit(){
        assertEquals(25,e.getProfit(500));
        assertEquals(50,e.getProfit(1000));
        assertEquals(75,e.getProfit(1500));
        
    }
    @Test
    public void testSellerGetting(){
        assertEquals(475,e.SellerGetting(500));
        assertEquals(950,e.SellerGetting(1000));
        assertEquals(1425,e.SellerGetting(1500));
        
    }
}
