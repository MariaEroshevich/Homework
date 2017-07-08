/**
 * Displays a message about the type of sequence.
 */
public class OutputMessages {
  /**
   * Displays the type of sequence.
   * @param testSequence flag for output of sequence type.
   */
  public void outputMessages(boolean testSequence) {
    if (testSequence) {
      System.out.println("The entered sequence of numbers is not nondecreasing.");
    } else {
      System.out.println("The entered sequence of numbers is does not decreasing.");
    }
  }
}
