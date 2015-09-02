/**
 * Simple class to test Jog.
 */
public class Test {

  public static void main(String[] args) {
    // Allocate a memory logger and tell Jog to use it for logging.
    Jog.setLogger(new MemoryLogger());

    // Enable DEBUG log entries.
    Jog.enableLevel(Level.DEBUG);

    for (int i = 0; i < 29; i++) {
      Jog.debug("Log entry " + i);
    }

    // You'll notice this doesn't get printed out since Level.INFO isn't enabled.
    Jog.info("An INFO log entry");

    Jog.printLog();
  }

}
