/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package MainFrame;
import MainFrame.Magazine;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author garre
 */
public class MainFrameTest {
    
    public MainFrameTest() {
    }

    /**
     * Test of main method, of class MainFrame.
     */
    @Test
    public void testMain() {
        
        Magazine dummy = new Magazine("Gaming Monthly","2001",-2);
        MainFrame.database = new Written[1];
        MainFrame.database[0] = dummy;
        String result = MainFrame.searcher(-2);
        int bull = 0;
        if(dummy.toString().equals(result))
            bull = 1;
        assertEquals(bull,1);
        //Testing if Search method works with seperate function
        
        
    }
    
}
