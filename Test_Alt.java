/**
 * Simple class to test Jog.
 */
public final class Test {

  /**
   * Implements the Ackermann function.
   */
  public static long ackermann(long m, long n) {
    Jog.debug("ackermann with m, n=" + m + ", " + n);
    if (m == 0) {
      Jog.info("Returning from recursion (m, n)= " + m + ", " + n);
      return n+1;
    }
    else if (m > 0 && n == 0) {
      return ackermann(m-1, 1);
    }
    else {
      return ackermann(m-1, ackermann(m, n-1));
    }
  }

  /**
   * Program entry point.
   * 
   * @param args Unused.
   */
  public static void main(final String[] args) {
    // Allocate a memory logger and tell Jog to use it for logging.
    // Jog.setLogger(new MemoryLogger());

    // Enable DEBUG and INFO log entries.
    // Jog.enableLevel(Level.DEBUG);
    // Jog.enableLevel(Level.INFO);


    // System.out.println(ackermann(2, 2));
    // Jog.printLog();
    
    System.out.println("Exercise ConsoleLogger");
    
    Jog.setLogger(new ConsoleLogger());
    Jog.enableLevel(Level.INFO);
    
    Jog.debug("ConsoleLogger debug - it should NOT print");
    Jog.info("ConsoleLogger first INFO message - it should print");
    Jog.info("ConsoleLogger second INFO message - it should print");
    Jog.warn("ConsoleLogger warn message - it should NOT print");
    Jog.error("ConsoleLogger error message - it should NOT print");
    
    System.out.println("Exercise FileLogger");
    
    Jog.setLogger(new FileLogger("Sam"));
    Jog.enableLevel(Level.INFO);
    
    Jog.debug("FileLogger debug message - it should NOT print");
    Jog.info("FileLogger first INFO message - it should print");
    Jog.info("FileLogger second INFO message - it should print");
    Jog.warn("FileLogger warn message - it should NOT print");
    Jog.error("FileLogger error message - it should NOT print");
    
    System.out.println("FileLogger prints here vvvv");
    
    Jog.printLog();
    
    System.out.println("Exercise MemoryLoggerPlus");
    
    Jog.setLogger(new MemoryLoggerPlus(6));
    Jog.enableLevel(Level.DEBUG);
    for (int i = 1; i <= 19; i++) {
      Jog.debug("MemoryLoggerPlus debug message " + i);
    }
    System.out.println("MemoryLoggerPlus prints here vvvv");
    Jog.printLog();
    
    System.out.println("I love ICS 211 and Object Oriented Programming in Java.");
  }

}
