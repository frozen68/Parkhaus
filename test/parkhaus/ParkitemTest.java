/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkhaus;

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
public class ParkitemTest {
      
      public ParkitemTest() {
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
       * Test of getKfz method, of class Parkitem.
       */
      @Test
      public void testGetKfz() {
            System.out.println("getKfz");
            Parkitem instance = new Parkitem();
            Fahrzeuge expResult = null;
            Fahrzeuge result = instance.getKfz();
            assertEquals(expResult, result);
            // TODO review the generated test code and remove the default call to fail.
            fail("The test case is a prototype.");
      }

      /**
       * Test of setKfz method, of class Parkitem.
       */
      @Test
      public void testSetKfz() {
            System.out.println("setKfz");
            Fahrzeuge kfz = null;
            Parkitem instance = new Parkitem();
            instance.setKfz(kfz);
            // TODO review the generated test code and remove the default call to fail.
            fail("The test case is a prototype.");
      }

      /**
       * Test of getSo method, of class Parkitem.
       */
      @Test
      public void testGetSo() {
            System.out.println("getSo");
            Parkitem instance = new Parkitem();
            String expResult = "";
            String result = instance.getSo();
            assertEquals(expResult, result);
            // TODO review the generated test code and remove the default call to fail.
            fail("The test case is a prototype.");
      }

      /**
       * Test of setSo method, of class Parkitem.
       */
      @Test
      public void testSetSo() {
            System.out.println("setSo");
            String so = "";
            Parkitem instance = new Parkitem();
            instance.setSo(so);
            // TODO review the generated test code and remove the default call to fail.
            fail("The test case is a prototype.");
      }

      /**
       * Test of toString method, of class Parkitem.
       */
      @Test
      public void testToString() {
            System.out.println("toString");
            Parkitem instance = new Parkitem();
            String expResult = "";
            String result = instance.toString();
            assertEquals(expResult, result);
            // TODO review the generated test code and remove the default call to fail.
            fail("The test case is a prototype.");
      }
      
}
