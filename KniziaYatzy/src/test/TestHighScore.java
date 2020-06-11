package test;

import highscore.*;

import static org.junit.Assert.*;
import org.junit.*;

public class TestHighScore {

@Before
  public void setUp() {
  }

//---------------------------------------------------------
@Test
  public void testAddResult() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
    HighScore.addResult("Kalle Anka", 18);
    HighScore.addResult("Mickie Mouse", 11);
  }

//---------------------------------------------------------
@Test
  public void testShowTopTenResults() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
    HighScore.showTopTenResults();
  }

  public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
      TestHighScore t = new TestHighScore();
      t.testAddResult();
      t.testShowTopTenResults();
  }
}
