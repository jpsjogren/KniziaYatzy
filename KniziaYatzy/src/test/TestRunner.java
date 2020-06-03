package test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
   public static void main(String[] args) {
      Result result = JUnitCore.runClasses(TestRules.class);

      for (Failure failure : result.getFailures()) {
         System.out.println(failure);
      }

      if (result.wasSuccessful()) System.out.println("Yeah baby!");
      else                        System.out.println("Errors have been detected");
   }
}
