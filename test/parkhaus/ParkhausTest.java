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
public class ParkhausTest {
      
      public ParkhausTest() {
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
       * Test of einfahren method, of class Parkhaus.
       */
      @Test
      public void testEinfahren() {
            System.out.println("einfahren");
            String kfzId = "";
            String typ = "";
            Parkplatz platz = null;
            Parkhaus instance = new Parkhaus();
            instance.einfahren(kfzId, typ, platz);
            // TODO review the generated test code and remove the default call to fail.
            fail("The test case is a prototype.");
      }

      /**
       * Test of zuweisen method, of class Parkhaus.
       */
      @Test
      public void testZuweisen() {
            System.out.println("zuweisen");
            Parkhaus instance = new Parkhaus();
            Parkplatz expResult = null;
            Parkplatz result = instance.zuweisen();
            assertEquals(expResult, result);
            // TODO review the generated test code and remove the default call to fail.
            fail("The test case is a prototype.");
      }

      /**
       * Test of verlassen method, of class Parkhaus.
       */
      @Test
      public void testVerlassen_Fahrzeuge() {
            System.out.println("verlassen");
            Fahrzeuge kfz = null;
            Parkhaus instance = new Parkhaus();
            Fahrzeuge expResult = null;
            Fahrzeuge result = instance.verlassen(kfz);
            assertEquals(expResult, result);
            // TODO review the generated test code and remove the default call to fail.
            fail("The test case is a prototype.");
      }

      /**
       * Test of verlassen method, of class Parkhaus.
       */
      @Test
      public void testVerlassen_String() {
            System.out.println("verlassen");
            String kfzId = "";
            Parkhaus instance = new Parkhaus();
            Fahrzeuge expResult = null;
            Fahrzeuge result = instance.verlassen(kfzId);
            assertEquals(expResult, result);
            // TODO review the generated test code and remove the default call to fail.
            fail("The test case is a prototype.");
      }

      /**
       * Test of getPostKfz method, of class Parkhaus.
       */
      @Test
      public void testGetPostKfz() {
            System.out.println("getPostKfz");
            String kfzId = "";
            Parkhaus instance = new Parkhaus();
            String expResult = "";
            String result = instance.getPostKfz(kfzId);
            assertEquals(expResult, result);
            // TODO review the generated test code and remove the default call to fail.
            fail("The test case is a prototype.");
      }

      /**
       * Test of freiePlaetze method, of class Parkhaus.
       */
      @Test
      public void testFreiePlaetze() {
            System.out.println("freiePlaetze");
            Parkhaus instance = new Parkhaus();
            int expResult = 0;
            int result = instance.freiePlaetze();
            assertEquals(expResult, result);
            // TODO review the generated test code and remove the default call to fail.
            fail("The test case is a prototype.");
      }

      /**
       * Test of getAnzahlEtagen method, of class Parkhaus.
       */
      @Test
      public void testGetAnzahlEtagen() {
            System.out.println("getAnzahlEtagen");
            Parkhaus instance = new Parkhaus();
            int expResult = 0;
            int result = instance.getAnzahlEtagen();
            assertEquals(expResult, result);
            // TODO review the generated test code and remove the default call to fail.
            fail("The test case is a prototype.");
      }

      /**
       * Test of setAnzahlEtagen method, of class Parkhaus.
       */
      @Test
      public void testSetAnzahlEtagen() {
            System.out.println("setAnzahlEtagen");
            int anzahlEtagen = 0;
            Parkhaus instance = new Parkhaus();
            instance.setAnzahlEtagen(anzahlEtagen);
            // TODO review the generated test code and remove the default call to fail.
            fail("The test case is a prototype.");
      }

      /**
       * Test of getEtagen method, of class Parkhaus.
       */
      @Test
      public void testGetEtagen() {
            System.out.println("getEtagen");
            Parkhaus instance = new Parkhaus();
            Parketagen[] expResult = null;
            Parketagen[] result = instance.getEtagen();
            assertArrayEquals(expResult, result);
            // TODO review the generated test code and remove the default call to fail.
            fail("The test case is a prototype.");
      }

      /**
       * Test of setEtagen method, of class Parkhaus.
       */
      @Test
      public void testSetEtagen() {
            System.out.println("setEtagen");
            Parketagen[] etagen = null;
            Parkhaus instance = new Parkhaus();
            instance.setEtagen(etagen);
            // TODO review the generated test code and remove the default call to fail.
            fail("The test case is a prototype.");
      }

      /**
       * Test of getFahrzeuge method, of class Parkhaus.
       */
      @Test
      public void testGetFahrzeuge() {
            System.out.println("getFahrzeuge");
            Parkhaus instance = new Parkhaus();
            Fahrzeuge[] expResult = null;
            Fahrzeuge[] result = instance.getFahrzeuge();
            assertArrayEquals(expResult, result);
            // TODO review the generated test code and remove the default call to fail.
            fail("The test case is a prototype.");
      }

      /**
       * Test of setFahrzeuge method, of class Parkhaus.
       */
      @Test
      public void testSetFahrzeuge() {
            System.out.println("setFahrzeuge");
            Fahrzeuge[] fahrzeuge = null;
            Parkhaus instance = new Parkhaus();
            instance.setFahrzeuge(fahrzeuge);
            // TODO review the generated test code and remove the default call to fail.
            fail("The test case is a prototype.");
      }
      
}
