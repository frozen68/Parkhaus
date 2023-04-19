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
public class ParkplatzTest {
      
      public ParkplatzTest() {
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
       * Test of getNummer method, of class Parkplatz.
       */
      @Test
      public void testGetNummer() {
            System.out.println("getNummer");
            Parkplatz instance = new Parkplatz();
            int expResult = 0;
            int result = instance.getNummer();
            assertEquals(expResult, result);
            // TODO review the generated test code and remove the default call to fail.
            fail("The test case is a prototype.");
      }

      /**
       * Test of setNummer method, of class Parkplatz.
       */
      @Test
      public void testSetNummer() {
            System.out.println("setNummer");
            int nummer = 0;
            Parkplatz instance = new Parkplatz();
            instance.setNummer(nummer);
            // TODO review the generated test code and remove the default call to fail.
            fail("The test case is a prototype.");
      }

      /**
       * Test of isBesetzt method, of class Parkplatz.
       */
      @Test
      public void testIsBesetzt() {
            System.out.println("isBesetzt");
            Parkplatz instance = new Parkplatz();
            boolean expResult = false;
            boolean result = instance.isBesetzt();
            assertEquals(expResult, result);
            // TODO review the generated test code and remove the default call to fail.
            fail("The test case is a prototype.");
      }

      /**
       * Test of setBesetzt method, of class Parkplatz.
       */
      @Test
      public void testSetBesetzt() {
            System.out.println("setBesetzt");
            boolean besetzt = false;
            Parkplatz instance = new Parkplatz();
            instance.setBesetzt(besetzt);
            // TODO review the generated test code and remove the default call to fail.
            fail("The test case is a prototype.");
      }

      /**
       * Test of getEtage method, of class Parkplatz.
       */
      @Test
      public void testGetEtage() {
            System.out.println("getEtage");
            Parkplatz instance = new Parkplatz();
            Parketagen expResult = null;
            Parketagen result = instance.getEtage();
            assertEquals(expResult, result);
            // TODO review the generated test code and remove the default call to fail.
            fail("The test case is a prototype.");
      }

      /**
       * Test of setEtage method, of class Parkplatz.
       */
      @Test
      public void testSetEtage() {
            System.out.println("setEtage");
            Parketagen etage = null;
            Parkplatz instance = new Parkplatz();
            instance.setEtage(etage);
            // TODO review the generated test code and remove the default call to fail.
            fail("The test case is a prototype.");
      }

      /**
       * Test of add method, of class Parkplatz.
       */
      @Test
      public void testAdd() {
            System.out.println("add");
            Parkplatz[] array = null;
            Parkplatz instance = new Parkplatz();
            Parkplatz[] expResult = null;
            Parkplatz[] result = instance.add(array);
            assertArrayEquals(expResult, result);
            // TODO review the generated test code and remove the default call to fail.
            fail("The test case is a prototype.");
      }
      
}
