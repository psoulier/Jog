/**
 * Logger interface.
 *
 * Defines a logging interface used by the Java Logger (Jog) class.
 */
interface Logger {
  /**
   * Logs a message string to the log.
   * @param logLevel Logging level message was logged as.
   * @param msg Message to be logged.
   */
  public void log(Level logLevel, String msg);

  /**
   * Provides an implemention the option of prefixing a log entry with informative info.
   *
   * This method is useful if time stamps, sequence numbers, thread iDs, etc. are 
   * desired to accompany log messages.
   *
   * @param logLevel Logging level associated to the message prefix.
   * @return A prefix string or "" if nothing is provided by implementation.
   */
  public String prefix(Level logLevel);

  /**
   * Prints contents of log to console.
   */
  public void print();
}

