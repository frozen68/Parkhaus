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
public class FahrzeugeTest {
      
      public FahrzeugeTest() {
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
       * Test of getKfzId method, of class Fahrzeuge.
       */
      @Test
      public void testGetKfzId() {
            System.out.println("getKfzId");
            Fahrzeuge instance = new Fahrzeuge();
            String expResult = "";
            String result = instance.getKfzId();
            assertEquals(expResult, result);
            // TODO review the generated test code and remove the default call to fail.
            fail("The test case is a prototype.");
      }

      /**
       * Test of setKfzId method, of class Fahrzeuge.
       */
      @Test
      public void testSetKfzId() {
            System.out.println("setKfzId");
            String kfzId = "";
            Fahrzeuge instance = new Fahrzeuge();
            instance.setKfzId(kfzId);
            // TODO review the generated test code and remove the default call to fail.
            fail("The test case is a prototype.");
      }

      /**
       * Test of getType method, of class Fahrzeuge.
       */
      @Test
      public void testGetType() {
            System.out.println("getType");
            Fahrzeuge instance = new Fahrzeuge();
            String expResult = "";
            String result = instance.getType();
            assertEquals(expResult, result);
            // TODO review the generated test code and remove the default call to fail.
            fail("The test case is a prototype.");
      }

      /**
       * Test of setType method, of class Fahrzeuge.
       */
      @Test
      public void testSetType() {
            System.out.println("setType");
            String type = "";
            Fahrzeuge instance = new Fahrzeuge();
            instance.setType(type);
            // TODO review the generated test code and remove the default call to fail.
            fail("The test case is a prototype.");
      }

      /**
       * Test of getPlatz method, of class Fahrzeuge.
       */
      @Test
      public void testGetPlatz() {
            System.out.println("getPlatz");
            Fahrzeuge instance = new Fahrzeuge();
            Parkplatz expResult = null;
            Parkplatz result = instance.getPlatz();
            assertEquals(expResult, result);
            // TODO review the generated test code and remove the default call to fail.
            fail("The test case is a prototype.");
      }

      /**
       * Test of setPlatz method, of class Fahrzeuge.
       */
      @Test
      public void testSetPlatz() {
            System.out.println("setPlatz");
            Parkplatz platz = null;
            Fahrzeuge instance = new Fahrzeuge();
            instance.setPlatz(platz);
            // TODO review the generated test code and remove the default call to fail.
            fail("The test case is a prototype.");
      }

      /**
       * Test of add method, of class Fahrzeuge.
       */
      @Test
      public void testAdd() {
            System.out.println("add");
            Fahrzeuge[] array = null;
            Fahrzeuge instance = new Fahrzeuge();
            Fahrzeuge[] expResult = null;
            Fahrzeuge[] result = instance.add(array);
            assertArrayEquals(expResult, result);
            // TODO review the generated test code and remove the default call to fail.
            fail("The test case is a prototype.");
      }
      
}
