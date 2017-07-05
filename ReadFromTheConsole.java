import java.util.Scanner;

/**
 * Reads the entered sequence.
 */
public class ReadFromTheConsole {
  /**
   * Asks to enter a sequence and displays it on the screen.
   * @return sequenceParts is an input sequence.
   */
  public String[] read() {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the sequence of numbers: ");
    String sequence = in.nextLine();
    String[] sequenceParts = sequence.split(" ");
    return sequenceParts;
  }
}