/**
 * The class analyzes the input sequence.
 */
public class SequenceAnalysis {
  /**
   * Defines the input sequence.
   * @param sequenceParts the sequence that we chek.
   * @return true, if the sequence decreases.
   */
  public boolean sequenceCheck(String[] sequenceParts) {
    for (int i = 1; i < sequenceParts.length; i++) {
      if (Integer.parseInt(sequenceParts[i]) <= Integer.parseInt(sequenceParts[i - 1])) {
        return true;
      }     
    } 
    return false;
  }

  /**
   * Displays a message about the type of sequence.
   * @param testSequence is a type of sequence.
   */
  public void output(boolean testSequence) {
    if (testSequence == true) {
      System.out.println("The entered sequence of numbers is not nondecreasing.");
    } else {
      System.out.println("The entered sequence of numbers is does not decreasing.");
    }
  }
}
