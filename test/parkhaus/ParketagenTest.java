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
public class ParketagenTest {
      
      public ParketagenTest() {
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
       * Test of getAnzahlPlaetze method, of class Parketagen.
       */
      @Test
      public void testGetAnzahlPlaetze() {
            System.out.println("getAnzahlPlaetze");
            Parketagen instance = new Parketagen();
            int expResult = 0;
            int result = instance.getAnzahlPlaetze();
            assertEquals(expResult, result);
            // TODO review the generated test code and remove the default call to fail.
            fail("The test case is a prototype.");
      }

      /**
       * Test of setAnzahlPlaetze method, of class Parketagen.
       */
      @Test
      public void testSetAnzahlPlaetze() {
            System.out.println("setAnzahlPlaetze");
            int anzahlPlaetze = 0;
            Parketagen instance = new Parketagen();
            instance.setAnzahlPlaetze(anzahlPlaetze);
            // TODO review the generated test code and remove the default call to fail.
            fail("The test case is a prototype.");
      }

      /**
       * Test of getEtagenNr method, of class Parketagen.
       */
      @Test
      public void testGetEtagenNr() {
            System.out.println("getEtagenNr");
            Parketagen instance = new Parketagen();
            int expResult = 0;
            int result = instance.getEtagenNr();
            assertEquals(expResult, result);
            // TODO review the generated test code and remove the default call to fail.
            fail("The test case is a prototype.");
      }

      /**
       * Test of setEtagenNr method, of class Parketagen.
       */
      @Test
      public void testSetEtagenNr() {
            System.out.println("setEtagenNr");
            int etagenNr = 0;
            Parketagen instance = new Parketagen();
            instance.setEtagenNr(etagenNr);
            // TODO review the generated test code and remove the default call to fail.
            fail("The test case is a prototype.");
      }

      /**
       * Test of getParkplaetze method, of class Parketagen.
       */
      @Test
      public void testGetParkplaetze() {
            System.out.println("getParkplaetze");
            Parketagen instance = new Parketagen();
            Parkplatz[] expResult = null;
            Parkplatz[] result = instance.getParkplaetze();
            assertArrayEquals(expResult, result);
            // TODO review the generated test code and remove the default call to fail.
            fail("The test case is a prototype.");
      }

      /**
       * Test of setParkplaetze method, of class Parketagen.
       */
      @Test
      public void testSetParkplaetze() {
            System.out.println("setParkplaetze");
            Parkplatz[] parkplaetze = null;
            Parketagen instance = new Parketagen();
            instance.setParkplaetze(parkplaetze);
            // TODO review the generated test code and remove the default call to fail.
            fail("The test case is a prototype.");
      }

      /**
       * Test of isVoll method, of class Parketagen.
       */
      @Test
      public void testIsVoll() {
            System.out.println("isVoll");
            Parketagen instance = new Parketagen();
            boolean expResult = false;
            boolean result = instance.isVoll();
            assertEquals(expResult, result);
            // TODO review the generated test code and remove the default call to fail.
            fail("The test case is a prototype.");
      }

      /**
       * Test of setVoll method, of class Parketagen.
       */
      @Test
      public void testSetVoll() {
            System.out.println("setVoll");
            boolean voll = false;
            Parketagen instance = new Parketagen();
            instance.setVoll(voll);
            // TODO review the generated test code and remove the default call to fail.
            fail("The test case is a prototype.");
      }

      /**
       * Test of add method, of class Parketagen.
       */
      @Test
      public void testAdd() {
            System.out.println("add");
            Parketagen[] array = null;
            Parketagen instance = new Parketagen();
            Parketagen[] expResult = null;
            Parketagen[] result = instance.add(array);
            assertArrayEquals(expResult, result);
            // TODO review the generated test code and remove the default call to fail.
            fail("The test case is a prototype.");
      }

      /**
       * Test of freiePlaetze method, of class Parketagen.
       */
      @Test
      public void testFreiePlaetze() {
            System.out.println("freiePlaetze");
            Parketagen instance = new Parketagen();
            int expResult = 0;
            int result = instance.freiePlaetze();
            assertEquals(expResult, result);
            // TODO review the generated test code and remove the default call to fail.
            fail("The test case is a prototype.");
      }
      
}
