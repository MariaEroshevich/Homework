/**
 * The class analyzes the input sequence.
 */
public class SequenceAnalysis {
  /**
   * Defines the input sequence.
   * @param sequenceParts the sequence that we chek.
   * @return testSequence if the sequence decreases.
   */
  public boolean sequenceCheck(String[] sequenceParts) {
    boolean testSequence = true;
    for (int i = 1; i < sequenceParts.length; i++) {
      if (Integer.parseInt(sequenceParts[i]) <= Integer.parseInt(sequenceParts[i - 1])) {
        testSequence = true;
      } else {
        testSequence = false;
      }   
    } 
    return testSequence;
  }
  

  /**
   * Displays a message about the type of sequence.
   * @param testSequence is a type of sequence.
   */
  public void messages(boolean testSequence) {
    if (testSequence == true) {
      System.out.println("The entered sequence of numbers is not nondecreasing.");
    } else {
      System.out.println("The entered sequence of numbers is does not decreasing.");
    }
  }
}
