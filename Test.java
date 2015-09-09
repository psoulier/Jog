/**
 * Simple class to test Jog.
 */
public class Test {

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

  public static void main(String[] args) {
    // Allocate a memory logger and tell Jog to use it for logging.
    Jog.setLogger(new MemoryLogger());

    // Enable DEBUG and INFO log entries.
    Jog.enableLevel(Level.DEBUG);
    Jog.enableLevel(Level.INFO);


    System.out.println(ackermann(2, 2));
    Jog.printLog();
  }

}
