/**
 * The class analyzes the input sequence.
 */
public class SequenceAnalysis {
  /**
   * Defines the input sequence.
   * @param sequence the sequence that we analysis.
   * @return true, if the sequence decreases.
   */
  public boolean sequenceAnalysis(String[] sequence) {
    for (int i = 1; i < sequence.length; i++) {
      if (Integer.parseInt(sequence[i]) <= Integer.parseInt(sequence[i - 1])) {
        return true;
      }     
    } 
    return false;
  }
}
