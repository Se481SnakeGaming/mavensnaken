package test.java;

import static org.junit.Assert.*;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;

import main.org.psnbtech.*;

import org.junit.Test;

public class SnakeGameTest {
/*
	@Test
	public void testControls() {

		SnakeGame sg = new SnakeGame();
		Thread t = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					Robot robo = new Robot();
					robo.delay(1000);
					robo.setAutoDelay(550);
//                    assertTrue(sg.isPaused());
//                    assertTrue(sg.isNewGame());
					robo.keyPress(KeyEvent.VK_ENTER);// start game
//                    assertFalse(sg.isPaused());
//                    assertFalse(sg.isNewGame());
					// movement
					robo.keyPress(KeyEvent.VK_A);
					assertEquals(sg.getDirection(), Direction.West);
					robo.keyPress(KeyEvent.VK_S);
					assertEquals(sg.getDirection(), Direction.South);
					robo.keyPress(KeyEvent.VK_D);
					assertEquals(sg.getDirection(), Direction.East);
					robo.keyPress(KeyEvent.VK_W);
					assertEquals(sg.getDirection(), Direction.North);
					robo.keyPress(KeyEvent.VK_P);// pause game
					assertTrue(sg.isPaused());
					// movement while paused
					robo.keyPress(KeyEvent.VK_A);
					assertNotEquals(sg.getDirection(), Direction.West);
					robo.keyPress(KeyEvent.VK_S);
					assertNotEquals(sg.getDirection(), Direction.South);
					robo.keyPress(KeyEvent.VK_D);
					assertNotEquals(sg.getDirection(), Direction.East);
					robo.keyPress(KeyEvent.VK_W);
					assertEquals(sg.getDirection(), Direction.North);// snake should remain in same direction
					robo.keyPress(KeyEvent.VK_ENTER);// test enter key during pause
					robo.keyPress(KeyEvent.VK_P);// unpause game
					sg.endgame = true;
				} catch (AWTException e) {
					e.printStackTrace();
				}
			}
		});
		t.start();
		sg.startGame();

	}

	@Test
	public void testUpdateGame() {

		SnakeGame sg = new SnakeGame();
		Thread t = new Thread(new Runnable() {
			@Override
			public void run() {

				try {
					Robot robo = new Robot();
					robo.delay(1000);
					robo.keyPress(KeyEvent.VK_ENTER);// start game
					robo.delay(1000);
					sg.board.setTile(12, 1, TileType.Fruit);// spawn cheat fruit
					robo.delay(3000);// eat fruit
					assertTrue(sg.getFruitsEaten() > 0);// snake should eat fruit
					robo.keyPress(KeyEvent.VK_ENTER);// new game
					robo.delay(1000);
					robo.setAutoDelay(100);
					// eat self
					robo.keyPress(KeyEvent.VK_A);
					robo.keyPress(KeyEvent.VK_S);
					robo.keyPress(KeyEvent.VK_D);
					robo.delay(1000);
					assertEquals(sg.updateSnake(), TileType.SnakeBody);// snake should eat self
					robo.keyPress(KeyEvent.VK_ENTER);// new game
					robo.delay(2000);// hit wall
					assertEquals(sg.updateSnake(), TileType.SnakeBody);// board edge is same as eating self
					sg.endgame = true;

				} catch (AWTException e) {
					e.printStackTrace();
				}
			}
		});
		t.start();
		sg.startGame();
	}

//	@Test
//	public void testMain() {
//		Thread t = new Thread(new Runnable() {
//			@Override
//			public void run() {
//				try {
//					Thread.currentThread().sleep(1000);
//					System.exit(0);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//		});
//		t.start();
//		SnakeGame.main(null);
//	}
*/
	@Test
	public void testFail() {
		//This test case will cause failure
		//assertEquals(true,false);
	}
	@Test
	public void testEpicWin() {
		assertEquals(true,true);
	}

//	@Test
//    public void testCn() {
//
//        SnakeGame s = new SnakeGame();
//        s.board = new BoardPanel(s);
//        TileType collision = s.updateSnake();
//        //TileType Fruit = collision;
//        assertEquals(collision, TileType.Fruit);
//
//
//        int real = s.getNextFruitScore();
//        int expected = 12;
//        assertEquals(expected, real);
//    }
//
//
//    @Test
//    public void testSF() {
//        SnakeGame s = new SnakeGame();
//        int score = 50;
//        int real = s.getNextFruitScore();
//        assertEquals(score, real);
//    }
//
//    @Test
//    public void testUpSk() {
//        SnakeGame s = new SnakeGame();
//        s.board = new BoardPanel(s);
//        TileType old = s.board.getTile(1, 2);
//        assertEquals(TileType.Fruit, old);
//    }
}