/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkhaus;

import javax.swing.event.ListDataListener;
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
public class ModelTest {
      
      public ModelTest() {
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
       * Test of getSize method, of class Model.
       */
      @Test
      public void testGetSize() {
            System.out.println("getSize");
            Model instance = new Model();
            int expResult = 0;
            int result = instance.getSize();
            assertEquals(expResult, result);
            // TODO review the generated test code and remove the default call to fail.
            fail("The test case is a prototype.");
      }

      /**
       * Test of getElementAt method, of class Model.
       */
      @Test
      public void testGetElementAt() {
            System.out.println("getElementAt");
            int i = 0;
            Model instance = new Model();
            Parkitem expResult = null;
            Parkitem result = instance.getElementAt(i);
            assertEquals(expResult, result);
            // TODO review the generated test code and remove the default call to fail.
            fail("The test case is a prototype.");
      }

      /**
       * Test of setItems method, of class Model.
       */
      @Test
      public void testSetItems() {
            System.out.println("setItems");
            Parkitem[] items = null;
            Model instance = new Model();
            instance.setItems(items);
            // TODO review the generated test code and remove the default call to fail.
            fail("The test case is a prototype.");
      }

      /**
       * Test of addListDataListener method, of class Model.
       */
      @Test
      public void testAddListDataListener() {
            System.out.println("addListDataListener");
            ListDataListener ll = null;
            Model instance = new Model();
            instance.addListDataListener(ll);
            // TODO review the generated test code and remove the default call to fail.
            fail("The test case is a prototype.");
      }

      /**
       * Test of removeListDataListener method, of class Model.
       */
      @Test
      public void testRemoveListDataListener() {
            System.out.println("removeListDataListener");
            ListDataListener ll = null;
            Model instance = new Model();
            instance.removeListDataListener(ll);
            // TODO review the generated test code and remove the default call to fail.
            fail("The test case is a prototype.");
      }
      
}
