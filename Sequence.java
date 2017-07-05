public class Sequence {
  public static void main(String[] args) {
    try {
      SequenceAnalysis sequenceAnalysis = new SequenceAnalysis();
      if (args.length != 0) {
        boolean testSequence = sequenceAnalysis.sequenceCheck(args);
        sequenceAnalysis.messages(testSequence);
      } else {
        ReadFromTheConsole readFromTheConsole = new ReadFromTheConsole();
        String[] textWithConsole = readFromTheConsole.read();
        boolean testSequence = sequenceAnalysis.sequenceCheck(textWithConsole);
        sequenceAnalysis.messages(testSequence);
      }
    } catch (NumberFormatException e) {
      System.out.println("You entered an invalid number format.");
    }
  }
}
   
