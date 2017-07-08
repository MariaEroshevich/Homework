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
}
