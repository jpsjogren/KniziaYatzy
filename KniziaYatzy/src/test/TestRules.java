package test;

import program.*;

import static org.junit.Assert.*;
import org.junit.*;

public class TestRules {

@Before
  public void setUp() {
  }

//---------------------------------------------------------
@Test
  public void testSaveScoreStore() throws Exception {
    SaveScore rule = new SaveScore();
    rule.store(1);
  }
@Test(expected=Exception.class)
  public void testSaveScoreStoreTwice() throws Exception {
    SaveScore rule = new SaveScore();
    rule.store(1);
    rule.store(1);
  }
@Test
  public void testSaveScoreEmptyEmpty() throws Exception {
    SaveScore rule = new SaveScore();
    boolean out_data = rule.empty();
    assertTrue("Unexpected value for empty: "+out_data, out_data);
  }
@Test
  public void testSaveScoreEmptyNot() throws Exception {
    SaveScore rule = new SaveScore();
    rule.store(1);
    boolean out_data = rule.empty();
    assertFalse("Unexpected value for empty: "+out_data, out_data);
  }
@Test
  public void testSaveScorePeek() throws Exception {
    SaveScore rule = new SaveScore();
    rule.store(3);
    int out_data = rule.peek();
    assertTrue("Unexpected value for peek: "+out_data, out_data==3);
  }
@Test(expected=Exception.class)
  public void testSaveScorePeekWithoutStore() throws Exception {
    SaveScore rule = new SaveScore();
//    rule.store(3);
    int out_data = rule.peek();
  }
//---------------------------------------------------------
@Test
  public void testOnesRuleName() {
    program.Rule rule = new Ones();
    String out_data = rule.rule_name();
    assertTrue("Unexpected rule name: "+out_data, out_data.equals("Ettor"));
  }
@Test
  public void testOnesRuleDescription() {
    program.Rule rule = new Ones();
    String out_data = rule.rule_description();
    assertTrue("Unexpected rule description: "+out_data, out_data.equals("Summan av alla ettor"));
  }
@Test
  public void testOnesCastIsNeeded() {
    program.Rule rule = new Ones();
    boolean out_data = rule.cast_is_needed();
    assertTrue("Unexpected cast_is_needed value: "+out_data, out_data);
  }
@Test
  public void testOnesCalculate() {
    program.Rule rule = new Ones();
    int[] in_data = { 2, 3, 4, 5, 6, 6 };
    for (int i=0; i<=6; ++i) {
      if (i != 0) {
        in_data[6-i] = 1;
      }
      int out_data = rule.calculate(null, in_data);
      assertTrue("Unexpected value for "+i+" ones: "+out_data, out_data==i);
    }
  }
//---------------------------------------------------------
@Test
  public void testTwosRuleName() {
    program.Rule rule = new Twos();
    String out_data = rule.rule_name();
    assertTrue("Unexpected rule name: "+out_data, out_data.equals("Tvåor"));
  }
@Test
  public void testTwosRuleDescription() {
    program.Rule rule = new Twos();
    String out_data = rule.rule_description();
    assertTrue("Unexpected rule description: "+out_data, out_data.equals("Summan av alla tvåor"));
  }
@Test
  public void testTwosCastIsNeeded() {
    program.Rule rule = new Twos();
    boolean out_data = rule.cast_is_needed();
    assertTrue("Unexpected cast_is_needed value: "+out_data, out_data);
  }
@Test
  public void testTwosCalculate() {
    program.Rule rule = new Twos();
    int[] in_data = { 1, 3, 4, 5, 6, 6 };
    for (int i=0; i<=6; ++i) {
      if (i != 0) {
        in_data[6-i] = 2;
      }
      int out_data = rule.calculate(null, in_data);
      assertTrue("Unexpected value for "+i+" twos: "+out_data, out_data==i*2);
    }
  }
//---------------------------------------------------------
@Test
  public void testThreesRuleName() {
    program.Rule rule = new Threes();
    String out_data = rule.rule_name();
    assertTrue("Unexpected rule name: "+out_data, out_data.equals("Treor"));
  }
@Test
  public void testThreesRuleDescription() {
    program.Rule rule = new Threes();
    String out_data = rule.rule_description();
    assertTrue("Unexpected rule description: "+out_data, out_data.equals("Summan av alla treor"));
  }
@Test
  public void testThreesCastIsNeeded() {
    program.Rule rule = new Threes();
    boolean out_data = rule.cast_is_needed();
    assertTrue("Unexpected cast_is_needed value: "+out_data, out_data);
  }
@Test
  public void testThreesCalculate() {
    program.Rule rule = new Threes();
    int[] in_data = { 1, 2, 4, 5, 6, 6 };
    for (int i=0; i<=6; ++i) {
      if (i != 0) {
        in_data[6-i] = 3;
      }
      int out_data = rule.calculate(null, in_data);
      assertTrue("Unexpected value for "+i+" threes: "+out_data, out_data==i*3);
    }
  }
//---------------------------------------------------------
@Test
  public void testFoursRuleName() {
    program.Rule rule = new Fours();
    String out_data = rule.rule_name();
    assertTrue("Unexpected rule name: "+out_data, out_data.equals("Fyror"));
  }
@Test
  public void testFoursRuleDescription() {
    program.Rule rule = new Fours();
    String out_data = rule.rule_description();
    assertTrue("Unexpected rule description: "+out_data, out_data.equals("Summan av alla fyror"));
  }
@Test
  public void testFoursCastIsNeeded() {
    program.Rule rule = new Fours();
    boolean out_data = rule.cast_is_needed();
    assertTrue("Unexpected cast_is_needed value: "+out_data, out_data);
  }
@Test
  public void testFoursCalculate() {
    program.Rule rule = new Fours();
    int[] in_data = { 1, 2, 3, 5, 6, 6 };
    for (int i=0; i<=6; ++i) {
      if (i != 0) {
        in_data[6-i] = 4;
      }
      int out_data = rule.calculate(null, in_data);
      assertTrue("Unexpected value for "+i+" fours: "+out_data, out_data==i*4);
    }
  }
//---------------------------------------------------------
@Test
  public void testFivesRuleName() {
    program.Rule rule = new Fives();
    String out_data = rule.rule_name();
    assertTrue("Unexpected rule name: "+out_data, out_data.equals("Femmor"));
  }
@Test
  public void testFivesRuleDescription() {
    program.Rule rule = new Fives();
    String out_data = rule.rule_description();
    assertTrue("Unexpected rule description: "+out_data, out_data.equals("Summan av alla femmor"));
  }
@Test
  public void testFivesCastIsNeeded() {
    program.Rule rule = new Fives();
    boolean out_data = rule.cast_is_needed();
    assertTrue("Unexpected cast_is_needed value: "+out_data, out_data);
  }
@Test
  public void testFivesCalculate() {
    program.Rule rule = new Fives();
    int[] in_data = { 1, 2, 3, 4, 6, 6 };
    for (int i=0; i<=6; ++i) {
      if (i != 0) {
        in_data[6-i] = 5;
      }
      int out_data = rule.calculate(null, in_data);
      assertTrue("Unexpected value for "+i+" fives: "+out_data, out_data==i*5);
    }
  }
//---------------------------------------------------------
@Test
  public void testSixesRuleName() {
    program.Rule rule = new Sixes();
    String out_data = rule.rule_name();
    assertTrue("Unexpected rule name: "+out_data, out_data.equals("Sexor"));
  }
@Test
  public void testSixesRuleDescription() {
    program.Rule rule = new Sixes();
    String out_data = rule.rule_description();
    assertTrue("Unexpected rule description: "+out_data, out_data.equals("Summan av alla sexor"));
  }
@Test
  public void testSixesCastIsNeeded() {
    program.Rule rule = new Sixes();
    boolean out_data = rule.cast_is_needed();
    assertTrue("Unexpected cast_is_needed value: "+out_data, out_data);
  }
@Test
  public void testSixesCalculate() {
    program.Rule rule = new Sixes();
    int[] in_data = { 1, 2, 3, 4, 5, 1 };
    for (int i=0; i<=6; ++i) {
      if (i != 0) {
        in_data[6-i] = 6;
      }
      int out_data = rule.calculate(null, in_data);
      assertTrue("Unexpected value for "+i+" sixes: "+out_data, out_data==i*6);
    }
  }
//---------------------------------------------------------
@Test
  public void testSumRuleName() {
    program.Rule rule = new Sum();
    String out_data = rule.rule_name();
    assertTrue("Unexpected rule name: "+out_data, out_data.equals("SUBTOTALT"));
  }
@Test
  public void testSumRuleDescription() {
    program.Rule rule = new Sum();
    String out_data = rule.rule_description();
    assertTrue("Unexpected rule description: "+out_data, out_data.equals("Summan av resultat efter de första 6 steg"));
  }
@Test
  public void testSumCastIsNeeded() {
    program.Rule rule = new Sum();
    boolean out_data = rule.cast_is_needed();
    assertFalse("Unexpected cast_is_needed value: "+out_data, out_data);
  }
@Test
  public void testSumCalculate() throws Exception {
    program.Protocol p = new Protocol("Kalle Anka");
    for (int i=0; i<6; ++i) {
        p.rule(i).store(i);
    }
// here we _must_ use the Sum object from the protocol
// due to how it is implemented (a possible FIXME?)
    int out_data = p.calculate(6, null);
    assertTrue("Unexpected value for sum: "+out_data, out_data==(0+1+2+3+4+5));
  }
//---------------------------------------------------------
@Test
  public void testBonusRuleName() {
    program.Rule rule = new Bonus();
    String out_data = rule.rule_name();
    assertTrue("Unexpected rule name: "+out_data, out_data.equals("BONUS"));
  }
@Test
  public void testBonusRuleDescription() {
    final int enough = 84; // or 75
    final int gain = 100; // or 50
    program.Rule rule = new Bonus();
    String out_data = rule.rule_description();
    assertTrue("Unexpected rule description: "+out_data, out_data.equals(gain+" extra poäng om minst "+enough+" finns"));
  }
@Test
  public void testBonusCastIsNeeded() {
    program.Rule rule = new Bonus();
    boolean out_data = rule.cast_is_needed();
    assertFalse("Unexpected cast_is_needed value: "+out_data, out_data);
  }
@Test
  public void testBonusCalculate() throws Exception {
    final int enough = 84; // or 75
    final int gain = 100; // or 50
// just not enough for bonus
    program.Protocol p = new Protocol("Kalle Anka");
    for (int i=0; i<6; ++i) {
        if (i==0) {
            p.rule(i).store(enough-1);
        } else {
            p.rule(i).store(0);
        }
    }
    int out_data = p.calculate(7, null);
    assertTrue("Unexpected value for bonus: "+out_data, out_data==0);
// just enough for bonus
    p = new Protocol("Kalle Anka");
    for (int i=0; i<6; ++i) {
        if (i==0) {
            p.rule(i).store(enough);
        } else {
            p.rule(i).store(0);
        }
    }
    out_data = p.calculate(7, null);
    assertTrue("Unexpected value for bonus: "+out_data, out_data==gain);
  }
//---------------------------------------------------------
@Test
  public void testOnePairRuleName() {
    program.Rule rule = new OnePair();
    String out_data = rule.rule_name();
    assertTrue("Unexpected rule name: "+out_data, out_data.equals("Ett Par"));
  }
@Test
  public void testOnePairRuleDescription() {
    program.Rule rule = new OnePair();
    String out_data = rule.rule_description();
    assertTrue("Unexpected rule description: "+out_data, out_data.equals("Största summan av ett par med samma tal"));
  }
@Test
  public void testOnePairCastIsNeeded() {
    program.Rule rule = new OnePair();
    boolean out_data = rule.cast_is_needed();
    assertTrue("Unexpected cast_is_needed value: "+out_data, out_data);
  }
@Test
  public void testOnePairCalculate() {
    program.Rule rule = new OnePair();
    int[] in_data0 = { 1, 2, 3, 4, 5, 6 };
    int out_data = rule.calculate(null, in_data0);
    assertTrue("Unexpected value for 0 onepair: "+out_data, out_data==0);
    int[] in_data1 = { 1, 2, 3, 2, 5, 6 };
    out_data = rule.calculate(null, in_data1);
    assertTrue("Unexpected value for 1 onepair: "+out_data, out_data==4);
    int[] in_data2 = { 1, 2, 3, 2, 3, 6 };
    out_data = rule.calculate(null, in_data2);
    assertTrue("Unexpected value for 2 onepair: "+out_data, out_data==6);
    int[] in_data3 = { 3, 2, 1, 2, 3, 6 };
    out_data = rule.calculate(null, in_data3);
    assertTrue("Unexpected value for 3 onepair: "+out_data, out_data==6);
    int[] in_data4 = { 4, 2, 4, 2, 1, 6 };
    out_data = rule.calculate(null, in_data4);
    assertTrue("Unexpected value for 4 onepair: "+out_data, out_data==8);
  }
//---------------------------------------------------------
@Test
  public void testTwoPairsRuleName() {
    program.Rule rule = new TwoPairs();
    String out_data = rule.rule_name();
    assertTrue("Unexpected rule name: "+out_data, out_data.equals("Två Par"));
  }
@Test
  public void testTwoPairsRuleDescription() {
    program.Rule rule = new TwoPairs();
    String out_data = rule.rule_description();
    assertTrue("Unexpected rule description: "+out_data, out_data.equals("Summan av två par med identiska utslag inom varje par"));
  }
@Test
  public void testTwoPairsCastIsNeeded() {
    program.Rule rule = new TwoPairs();
    boolean out_data = rule.cast_is_needed();
    assertTrue("Unexpected cast_is_needed value: "+out_data, out_data);
  }
@Test
  public void testTwoPairsCalculate() {
    program.Rule rule = new TwoPairs();
    int[] in_data0 = { 1, 2, 3, 4, 5, 6 };
    int out_data = rule.calculate(null, in_data0);
    assertTrue("Unexpected value for 0 twopairs: "+out_data, out_data==0);
    int[] in_data1 = { 1, 2, 3, 2, 5, 6 };
    out_data = rule.calculate(null, in_data1);
    assertTrue("Unexpected value for 1 twopairs: "+out_data, out_data==0);
    int[] in_data2 = { 1, 2, 3, 2, 3, 6 };
    out_data = rule.calculate(null, in_data2);
    assertTrue("Unexpected value for 2 twopairs: "+out_data, out_data==10);
    int[] in_data3 = { 3, 2, 1, 2, 3, 6 };
    out_data = rule.calculate(null, in_data3);
    assertTrue("Unexpected value for 3 twopairs: "+out_data, out_data==10);
    int[] in_data4 = { 4, 2, 4, 2, 1, 6 };
    out_data = rule.calculate(null, in_data4);
    assertTrue("Unexpected value for 4 twopairs: "+out_data, out_data==12);
    int[] in_data5 = { 2, 2, 2, 2, 1, 6 };
    out_data = rule.calculate(null, in_data5);
    assertTrue("Unexpected value for 5 twopairs: "+out_data, out_data==0);
  }
//---------------------------------------------------------
@Test
  public void testThreeOfAKindRuleName() {
    program.Rule rule = new ThreeOfAKind();
    String out_data = rule.rule_name();
    assertTrue("Unexpected rule name: "+out_data, out_data.equals("Tretal"));
  }
@Test
  public void testThreeOfAKindRuleDescription() {
    program.Rule rule = new ThreeOfAKind();
    String out_data = rule.rule_description();
    assertTrue("Unexpected rule description: "+out_data, out_data.equals("Summan av tre tärningar med samma tal"));
  }
@Test
  public void testThreeOfAKindCastIsNeeded() {
    program.Rule rule = new ThreeOfAKind();
    boolean out_data = rule.cast_is_needed();
    assertTrue("Unexpected cast_is_needed value: "+out_data, out_data);
  }
@Test
  public void testThreeOfAKindCalculate() {
    program.Rule rule = new ThreeOfAKind();
    int[] in_data0 = { 1, 2, 3, 4, 5, 6 };
    int out_data = rule.calculate(null, in_data0);
    assertTrue("Unexpected value for 0 threeofakind: "+out_data, out_data==0);
    int[] in_data1 = { 1, 2, 3, 2, 5, 6 };
    out_data = rule.calculate(null, in_data1);
    assertTrue("Unexpected value for 1 threeofakind: "+out_data, out_data==0);
    int[] in_data2 = { 1, 2, 3, 2, 3, 6 };
    out_data = rule.calculate(null, in_data2);
    assertTrue("Unexpected value for 2 threeofakind: "+out_data, out_data==0);
    int[] in_data3 = { 3, 2, 1, 2, 2, 6 };
    out_data = rule.calculate(null, in_data3);
    assertTrue("Unexpected value for 3 threeofakind: "+out_data, out_data==6);
    int[] in_data4 = { 4, 2, 4, 2, 4, 6 };
    out_data = rule.calculate(null, in_data4);
    assertTrue("Unexpected value for 4 threeofakind: "+out_data, out_data==12);
    int[] in_data5 = { 5, 5, 5, 5, 1, 6 };
    out_data = rule.calculate(null, in_data5);
    assertTrue("Unexpected value for 5 threeofakind: "+out_data, out_data==15);
  }
//---------------------------------------------------------
@Test
  public void testFourOfAKindRuleName() {
    program.Rule rule = new FourOfAKind();
    String out_data = rule.rule_name();
    assertTrue("Unexpected rule name: "+out_data, out_data.equals("Fyra lika"));
  }
@Test
  public void testFourOfAKindRuleDescription() {
    program.Rule rule = new FourOfAKind();
    String out_data = rule.rule_description();
    assertTrue("Unexpected rule description: "+out_data, out_data.equals("Summan av fyra tärningar med samma tal"));
  }
@Test
  public void testFourOfAKindCastIsNeeded() {
    program.Rule rule = new FourOfAKind();
    boolean out_data = rule.cast_is_needed();
    assertTrue("Unexpected cast_is_needed value: "+out_data, out_data);
  }
@Test
  public void testFourOfAKindCalculate() {
    program.Rule rule = new FourOfAKind();
    int[] in_data0 = { 1, 2, 3, 4, 5, 6 };
    int out_data = rule.calculate(null, in_data0);
    assertTrue("Unexpected value for 0 fourofakind: "+out_data, out_data==0);
    int[] in_data1 = { 1, 2, 3, 2, 5, 6 };
    out_data = rule.calculate(null, in_data1);
    assertTrue("Unexpected value for 1 fourofakind: "+out_data, out_data==0);
    int[] in_data2 = { 1, 2, 3, 2, 3, 6 };
    out_data = rule.calculate(null, in_data2);
    assertTrue("Unexpected value for 2 fourofakind: "+out_data, out_data==0);
    int[] in_data3 = { 3, 2, 1, 2, 2, 6 };
    out_data = rule.calculate(null, in_data3);
    assertTrue("Unexpected value for 3 fourofakind: "+out_data, out_data==0);
    int[] in_data4 = { 4, 2, 4, 2, 4, 6 };
    out_data = rule.calculate(null, in_data4);
    assertTrue("Unexpected value for 4 fourofakind: "+out_data, out_data==0);
    int[] in_data5 = { 1, 5, 5, 5, 5, 6 };
    out_data = rule.calculate(null, in_data5);
    assertTrue("Unexpected value for 5 fourofakind: "+out_data, out_data==20);
    int[] in_data6 = { 3, 3, 3, 3, 3, 6 };
    out_data = rule.calculate(null, in_data6);
    assertTrue("Unexpected value for 6 fourofakind: "+out_data, out_data==12);
    int[] in_data7 = { 3, 3, 3, 3, 3, 3 };
    out_data = rule.calculate(null, in_data7);
    assertTrue("Unexpected value for 7 fourofakind: "+out_data, out_data==12);
  }
//---------------------------------------------------------
@Test
  public void testSmallStraightRuleName() {
    program.Rule rule = new SmallStraight();
    String out_data = rule.rule_name();
    assertTrue("Unexpected rule name: "+out_data, out_data.equals("Liten stege"));
  }
@Test
  public void testSmallStraightRuleDescription() {
    program.Rule rule = new SmallStraight();
    String out_data = rule.rule_description();
    assertTrue("Unexpected rule description: "+out_data, out_data.equals("1+2+3+4+5 => 15 poäng"));
  }
@Test
  public void testSmallStraightCastIsNeeded() {
    program.Rule rule = new SmallStraight();
    boolean out_data = rule.cast_is_needed();
    assertTrue("Unexpected cast_is_needed value: "+out_data, out_data);
  }
@Test
  public void testSmallStraightCalculate() {
    program.Rule rule = new SmallStraight();
    int[] in_data0 = { 1, 2, 3, 4, 5, 6 };
    int out_data = rule.calculate(null, in_data0);
    assertTrue("Unexpected value for 0 smallstraight: "+out_data, out_data==15);
    int[] in_data1 = { 2, 3, 4, 5, 6, 6 };
    out_data = rule.calculate(null, in_data1);
    assertTrue("Unexpected value for 1 smallstraight: "+out_data, out_data==0);
    int[] in_data2 = { 1, 2, 3, 2, 3, 6 };
    out_data = rule.calculate(null, in_data2);
    assertTrue("Unexpected value for 2 smallstraight: "+out_data, out_data==0);
    int[] in_data3 = { 3, 2, 1, 2, 2, 6 };
    out_data = rule.calculate(null, in_data3);
    assertTrue("Unexpected value for 3 smallstraight: "+out_data, out_data==0);
    int[] in_data4 = { 4, 2, 4, 2, 4, 6 };
    out_data = rule.calculate(null, in_data4);
    assertTrue("Unexpected value for 4 smallstraight: "+out_data, out_data==0);
    int[] in_data5 = { 1, 5, 5, 5, 5, 6 };
    out_data = rule.calculate(null, in_data5);
    assertTrue("Unexpected value for 5 smallstraight: "+out_data, out_data==0);
    int[] in_data6 = { 3, 3, 3, 3, 3, 6 };
    out_data = rule.calculate(null, in_data6);
    assertTrue("Unexpected value for 6 smallstraight: "+out_data, out_data==0);
    int[] in_data7 = { 1, 2, 3, 4, 5, 1 };
    out_data = rule.calculate(null, in_data7);
    assertTrue("Unexpected value for 7 smallstraight: "+out_data, out_data==15);
  }
//---------------------------------------------------------
@Test
public void testLargeStraightRuleName() {
    program.Rule rule = new LargeStraight();
    String out_data = rule.rule_name();
    assertTrue("Unexpected rule name: "+out_data, out_data.equals("Stor stege"));
}
@Test
public void testLargeStraightRuleDescription() {
    program.Rule rule = new LargeStraight();
    String out_data = rule.rule_description();
    assertTrue("Unexpected rule description: "+out_data, out_data.equals("2+3+4+5+6 => 20 poäng"));
}
@Test
public void testLargeStraightCastIsNeeded() {
    program.Rule rule = new LargeStraight();
    boolean out_data = rule.cast_is_needed();
    assertTrue("Unexpected cast_is_needed value: "+out_data, out_data);
}
@Test
public void testLargeStraightCalculate() {
    program.Rule rule = new LargeStraight();
    int[] in_data0 = { 1, 2, 3, 4, 5, 1 };
    int out_data = rule.calculate(null, in_data0);
    assertTrue("Unexpected value for 0 largestraight: "+out_data, out_data==0);
    int[] in_data1 = { 2, 3, 4, 5, 6, 6 };
    out_data = rule.calculate(null, in_data1);
    assertTrue("Unexpected value for 1 largestraight: "+out_data, out_data==20);
    int[] in_data2 = { 1, 2, 3, 2, 3, 6 };
    out_data = rule.calculate(null, in_data2);
    assertTrue("Unexpected value for 2 largestraight: "+out_data, out_data==0);
    int[] in_data3 = { 3, 2, 1, 2, 2, 6 };
    out_data = rule.calculate(null, in_data3);
    assertTrue("Unexpected value for 3 largestraight: "+out_data, out_data==0);
    int[] in_data4 = { 4, 2, 4, 2, 4, 6 };
    out_data = rule.calculate(null, in_data4);
    assertTrue("Unexpected value for 4 largestraight: "+out_data, out_data==0);
    int[] in_data5 = { 1, 5, 5, 5, 5, 6 };
    out_data = rule.calculate(null, in_data5);
    assertTrue("Unexpected value for 5 largestraight: "+out_data, out_data==0);
    int[] in_data6 = { 3, 3, 3, 3, 3, 6 };
    out_data = rule.calculate(null, in_data6);
    assertTrue("Unexpected value for 6 largestraight: "+out_data, out_data==0);
}
//---------------------------------------------------------
@Test
public void testFullStraightRuleName() {
    program.Rule rule = new FullStraight();
    String out_data = rule.rule_name();
    assertTrue("Unexpected rule name: "+out_data, out_data.equals("Full stege"));
}
@Test
public void testFullStraightRuleDescription() {
    final int korvbiten = 21; // 25 according to a different authority
    program.Rule rule = new FullStraight();
    String out_data = rule.rule_description();
    assertTrue("Unexpected rule description: "+out_data, out_data.equals("1+2+3+4+5+6 => "+korvbiten+" poäng"));
}
@Test
public void testFullStraightCastIsNeeded() {
    program.Rule rule = new FullStraight();
    boolean out_data = rule.cast_is_needed();
    assertTrue("Unexpected cast_is_needed value: "+out_data, out_data);
}
@Test
public void testFullStraightCalculate() {
    final int korvbiten = 21; // 25 according to a different authority
    program.Rule rule = new FullStraight();
    int[] in_data0 = { 1, 2, 3, 4, 5, 1 };
    int out_data = rule.calculate(null, in_data0);
    assertTrue("Unexpected value for 0 largestraight: "+out_data, out_data==0);
    int[] in_data1 = { 2, 3, 4, 5, 6, 1 };
    out_data = rule.calculate(null, in_data1);
    assertTrue("Unexpected value for 1 largestraight: "+out_data, out_data==korvbiten);
    int[] in_data2 = { 1, 2, 3, 2, 3, 6 };
    out_data = rule.calculate(null, in_data2);
    assertTrue("Unexpected value for 2 largestraight: "+out_data, out_data==0);
    int[] in_data3 = { 3, 2, 1, 2, 2, 6 };
    out_data = rule.calculate(null, in_data3);
    assertTrue("Unexpected value for 3 largestraight: "+out_data, out_data==0);
    int[] in_data4 = { 4, 2, 4, 2, 4, 6 };
    out_data = rule.calculate(null, in_data4);
    assertTrue("Unexpected value for 4 largestraight: "+out_data, out_data==0);
    int[] in_data5 = { 1, 5, 5, 5, 5, 6 };
    out_data = rule.calculate(null, in_data5);
    assertTrue("Unexpected value for 5 largestraight: "+out_data, out_data==0);
    int[] in_data6 = { 3, 3, 3, 3, 3, 6 };
    out_data = rule.calculate(null, in_data6);
    assertTrue("Unexpected value for 6 largestraight: "+out_data, out_data==0);
}
//---------------------------------------------------------
@Test
  public void testFullHouseRuleName() {
    program.Rule rule = new FullHouse();
    String out_data = rule.rule_name();
    assertTrue("Unexpected rule name: "+out_data, out_data.equals("Kåk"));
  }
@Test
  public void testFullHouseRuleDescription() {
    program.Rule rule = new FullHouse();
    String out_data = rule.rule_description();
    assertTrue("Unexpected rule description: "+out_data, out_data.equals("Tre likadana med ett tal och två likadana med ett annat tal"));
  }
@Test
  public void testFullHouseCastIsNeeded() {
    program.Rule rule = new FullHouse();
    boolean out_data = rule.cast_is_needed();
    assertTrue("Unexpected cast_is_needed value: "+out_data, out_data);
  }
@Test
  public void testFullHouseCalculate() {
    program.Rule rule = new FullHouse();
    int[] in_data0 = { 1, 2, 3, 4, 5, 6 };
    int out_data = rule.calculate(null, in_data0);
    assertTrue("Unexpected value for 0 fullhouse: "+out_data, out_data==0);
    int[] in_data1 = { 2, 3, 4, 5, 6, 6 };
    out_data = rule.calculate(null, in_data1);
    assertTrue("Unexpected value for 1 fullhouse: "+out_data, out_data==0);
    int[] in_data2 = { 1, 2, 3, 2, 3, 6 };
    out_data = rule.calculate(null, in_data2);
    assertTrue("Unexpected value for 2 fullhouse: "+out_data, out_data==0);
    int[] in_data3 = { 3, 2, 1, 2, 2, 6 };
    out_data = rule.calculate(null, in_data3);
    assertTrue("Unexpected value for 3 fullhouse: "+out_data, out_data==0);
    int[] in_data4 = { 4, 2, 4, 2, 4, 6 };
    out_data = rule.calculate(null, in_data4);
    assertTrue("Unexpected value for 4 fullhouse: "+out_data, out_data==16);
    int[] in_data5 = { 1, 5, 5, 5, 5, 5 };
    out_data = rule.calculate(null, in_data5);
    assertTrue("Unexpected value for 5 fullhouse: "+out_data, out_data==0);
    int[] in_data6 = { 3, 3, 3, 3, 3, 3 };
    out_data = rule.calculate(null, in_data6);
    assertTrue("Unexpected value for 6 fullhouse: "+out_data, out_data==0);
  }
//---------------------------------------------------------
@Test
  public void testChanceRuleName() {
    program.Rule rule = new Chance();
    String out_data = rule.rule_name();
    assertTrue("Unexpected rule name: "+out_data, out_data.equals("Chans"));
  }
@Test
  public void testChanceRuleDescription() {
    program.Rule rule = new Chance();
    String out_data = rule.rule_description();
    assertTrue("Unexpected rule description: "+out_data, out_data.equals("Summan av alla tärningar"));
  }
@Test
  public void testChanceCastIsNeeded() {
    program.Rule rule = new Chance();
    boolean out_data = rule.cast_is_needed();
    assertTrue("Unexpected cast_is_needed value: "+out_data, out_data);
  }
@Test
  public void testChanceCalculate() {
    program.Rule rule = new Chance();
    int[] in_data0 = { 1, 2, 3, 4, 5, 6 };
    int out_data = rule.calculate(null, in_data0);
    assertTrue("Unexpected value for 0 chance: "+out_data, out_data==21);
    int[] in_data1 = { 2, 3, 4, 5, 6, 6 };
    out_data = rule.calculate(null, in_data1);
    assertTrue("Unexpected value for 1 chance: "+out_data, out_data==26);
    int[] in_data2 = { 1, 2, 3, 2, 3, 6 };
    out_data = rule.calculate(null, in_data2);
    assertTrue("Unexpected value for 2 chance: "+out_data, out_data==17);
    int[] in_data3 = { 3, 2, 1, 2, 2, 6 };
    out_data = rule.calculate(null, in_data3);
    assertTrue("Unexpected value for 3 chance: "+out_data, out_data==16);
    int[] in_data4 = { 4, 2, 4, 2, 4, 6 };
    out_data = rule.calculate(null, in_data4);
    assertTrue("Unexpected value for 4 chance: "+out_data, out_data==22);
    int[] in_data5 = { 1, 5, 5, 5, 5, 5 };
    out_data = rule.calculate(null, in_data5);
    assertTrue("Unexpected value for 5 chance: "+out_data, out_data==26);
    int[] in_data6 = { 3, 3, 3, 3, 3, 3 };
    out_data = rule.calculate(null, in_data6);
    assertTrue("Unexpected value for 6 chance: "+out_data, out_data==18);
  }
//---------------------------------------------------------
@Test
  public void testYatzyRuleName() {
    program.Rule rule = new Yatzy();
    String out_data = rule.rule_name();
    assertTrue("Unexpected rule name: "+out_data, out_data.equals("Maxiyatzy"));
  }
@Test
  public void testYatzyRuleDescription() {
    program.Rule rule = new Yatzy();
    String out_data = rule.rule_description();
    assertTrue("Unexpected rule description: "+out_data, out_data.equals("Alla likadana => 100"));
  }
@Test
  public void testYatzyCastIsNeeded() {
    program.Rule rule = new Yatzy();
    boolean out_data = rule.cast_is_needed();
    assertTrue("Unexpected cast_is_needed value: "+out_data, out_data);
  }
@Test
  public void testYatzyCalculate() {
    program.Rule rule = new Yatzy();
    int[] in_data0 = { 1, 2, 3, 4, 5, 6 };
    int out_data = rule.calculate(null, in_data0);
    assertTrue("Unexpected value for 0 yatzy: "+out_data, out_data==0);
    int[] in_data1 = { 2, 3, 4, 5, 6, 6 };
    out_data = rule.calculate(null, in_data1);
    assertTrue("Unexpected value for 1 yatzy: "+out_data, out_data==0);
    int[] in_data2 = { 1, 2, 3, 2, 3, 6 };
    out_data = rule.calculate(null, in_data2);
    assertTrue("Unexpected value for 2 yatzy: "+out_data, out_data==0);
    int[] in_data3 = { 3, 2, 1, 2, 2, 6 };
    out_data = rule.calculate(null, in_data3);
    assertTrue("Unexpected value for 3 yatzy: "+out_data, out_data==0);
    int[] in_data4 = { 4, 2, 4, 2, 4, 6 };
    out_data = rule.calculate(null, in_data4);
    assertTrue("Unexpected value for 4 yatzy: "+out_data, out_data==0);
    int[] in_data5 = { 1, 5, 5, 5, 5, 5 };
    out_data = rule.calculate(null, in_data5);
    assertTrue("Unexpected value for 5 yatzy: "+out_data, out_data==0);
    int[] in_data6 = { 3, 3, 3, 3, 3, 3 };
    out_data = rule.calculate(null, in_data6);
    assertTrue("Unexpected value for 6 yatzy: "+out_data, out_data==100);
  }
//---------------------------------------------------------

}
