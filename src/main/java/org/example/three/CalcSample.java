package org.example.three;

public class CalcSample {
  private Logger log = new Logger();

  public int doMath(int one, int two, String action) {

    if (action.equalsIgnoreCase("+")) {
      return one + two;
    } else {
      if ("-".equalsIgnoreCase(action)) {
        int result = two - one;
        return result;
      } else {
        if (action.equalsIgnoreCase("*")) {
          if (one > Integer.MAX_VALUE / 2) {
            log.info("one is too big");
            throw new RuntimeException("one is too big");
          } else {
            log.info("correct case");
            return one * two;
          }
        }
      }
    }

    throw new RuntimeException("not supported action");
  }
}

class Logger {
  public void info(String msg) {
    System.out.println("[info]" + msg);
  }
}
