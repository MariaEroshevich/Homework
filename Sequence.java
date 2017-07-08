public class Sequence {
  public static void main(String[] args) {
    try {
      SequenceAnalysis sequenceAnalysis = new SequenceAnalysis();
      OutputMessages outputMessages = new OutputMessages();
      if (args.length != 0) {
        outputMessages.outputMessages(sequenceAnalysis.sequenceCheck(args));
      } else {
        ReadFromTheConsole readFromTheConsole = new ReadFromTheConsole();
        outputMessages.outputMessages(sequenceAnalysis.sequenceCheck(readFromTheConsole.read()));
      }
    } catch (NumberFormatException e) {
      System.out.println("You entered an invalid number format.");
    }
  }
}
