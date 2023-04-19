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
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author ForouzanShebli
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({parkhaus.ParkhausTest.class, parkhaus.FahrzeugeTest.class, parkhaus.ParkplatzTest.class, parkhaus.ModelTest.class, parkhaus.ParkitemTest.class, parkhaus.ParkInfoTest.class, parkhaus.ParketagenTest.class, parkhaus.MainTest.class})
public class ParkhausSuite {

      @BeforeClass
      public static void setUpClass() throws Exception {
      }

      @AfterClass
      public static void tearDownClass() throws Exception {
      }

      @Before
      public void setUp() throws Exception {
      }

      @After
      public void tearDown() throws Exception {
      }
      
}
