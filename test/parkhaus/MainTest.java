/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkhaus;

import javax.swing.JLabel;
import javax.swing.JTextField;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ForouzanShebli
 */
public class MainTest {
      
      public MainTest() {
      }
      
      @BeforeClass
      public static void setUpClass() {
      }
      
      @AfterClass
      public static void tearDownClass() {
      }
      
      @Before
      public void setUp() {
      }
      
      @After
      public void tearDown() {
      }

      /**
       * Test of getLfStandort method, of class Main.
       */
      @Test
      public void testGetLfStandort() {
            System.out.println("getLfStandort");
            Main instance = new Main();
            JLabel expResult = null;
            JLabel result = instance.getLfStandort();
            assertEquals(expResult, result);
            // TODO review the generated test code and remove the default call to fail.
            fail("The test case is a prototype.");
      }

      /**
       * Test of setLfStandort method, of class Main.
       */
      @Test
      public void testSetLfStandort() {
            System.out.println("setLfStandort");
            String lfStandort = "";
            Main instance = new Main();
            instance.setLfStandort(lfStandort);
            // TODO review the generated test code and remove the default call to fail.
            fail("The test case is a prototype.");
      }

      /**
       * Test of getTfKfzId method, of class Main.
       */
      @Test
      public void testGetTfKfzId() {
            System.out.println("getTfKfzId");
            Main instance = new Main();
            JTextField expResult = null;
            JTextField result = instance.getTfKfzId();
            assertEquals(expResult, result);
            // TODO review the generated test code and remove the default call to fail.
            fail("The test case is a prototype.");
      }

      /**
       * Test of setTfKfzId method, of class Main.
       */
      @Test
      public void testSetTfKfzId() {
            System.out.println("setTfKfzId");
            String tfKfzId = "";
            Main instance = new Main();
            instance.setTfKfzId(tfKfzId);
            // TODO review the generated test code and remove the default call to fail.
            fail("The test case is a prototype.");
      }

      /**
       * Test of main method, of class Main.
       */
      @Test
      public void testMain() {
            System.out.println("main");
            String[] args = null;
            Main.main(args);
            // TODO review the generated test code and remove the default call to fail.
            fail("The test case is a prototype.");
      }
      
}
