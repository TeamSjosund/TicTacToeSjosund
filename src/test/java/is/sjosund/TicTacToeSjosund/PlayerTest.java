package is.sjosund.TicTacToeSjosund;

import org.junit.Test;
import static org.junit.Assert.*;

public class PlayerTest
{
    public static void main (String args[]) {
		org.junit.runner.JUnitCore.main("is.sjosund.TicTacToeSjosund.PlayerTest");
	}
    
    @Test
    public void verifyGoodInput()
    {

        assertTrue(Player.verifyInput(2));
        
    }
        
    @Test
    public void verifyBadInput()
    {
        assertFalse(Player.verifyInput(3));   
    }

    @Test
    public void verifyBadInput2()
    {
        assertFalse(Player.verifyInput(-1));   
    }

}