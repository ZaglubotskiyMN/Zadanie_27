package part1.lessons27.task1;

import org.junit.*;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
 private App app = new App(10,20);

 @Test
    public void one()
 {
     assertNotNull(app);
 }
 public static class NewTest {
     private App app;

     @BeforeClass
     public static void beforeClass()
     {
         System.out.println("before calculatetest.class");
     }
     @AfterClass
     public static void afterClass(){

         System.out.println("After CalculateTEST.class");
     }
     @Before
     public  void initTest(){
         app= new App();
     }
     @After
     public void afterTest()
     {
         app=null;
     }

     @Test
     public void testGETSum() throws Exception {
         app.setFirstNumber(2.0);
         app.setSecondNumber(3.0);
         assertEquals(5.0,app.calculateSUM(),1.0);
     }
     @Test
     public void testGETMinus() throws Exception{
         app.setFirstNumber(5.0);
         app.setSecondNumber(3.0);
         assertEquals(3.0,app.calcateMINUS(),1.0);
     }
     @Test
     public void testGETMulti() throws Exception{
         app.setFirstNumber(5.0);
         app.setSecondNumber(2.0);
         assertEquals(10.0,app.calcatemulti(),1.0);
     }
     @Test
     public void testGETDivide() throws Exception{
         app.setFirstNumber(10.0);
         app.setSecondNumber(2.0);
         assertEquals(5.0,app.calcateDevide(),1.0);
     }

 }
}
