package test.java;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.psnbtech.Clock;

class ClockTest {

    @Test
    public void testCycle() {
        Clock clock = new Clock(9.0f);

        assertFalse(clock.peekElapsedCycle());

        try {
			Thread.sleep(500);
            clock.update();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        assertTrue(clock.peekElapsedCycle());
    }
	
	@Test
	public void testIsP() {
		Clock clock = new Clock(9.0f);
		assertFalse(clock.isPaused());
		clock.setPaused(true);
		assertTrue(clock.isPaused());
	}
}
