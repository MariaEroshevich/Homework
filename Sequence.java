public class Sequence {
  public static void main(String[] args) {
    try {
      SequenceAnalysis sequenceAnalysis = new SequenceAnalysis();
      if (args.length != 0) {
        sequenceAnalysis.output(sequenceAnalysis.sequenceCheck(args));
      } else {
        ReadFromTheConsole readFromTheConsole = new ReadFromTheConsole();
        sequenceAnalysis.output(sequenceAnalysis.sequenceCheck(readFromTheConsole.read()));
      }
    } catch (NumberFormatException e) {
      System.out.println("You entered an invalid number format.");
    }
  }
}
