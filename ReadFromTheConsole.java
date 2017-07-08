import java.util.Scanner;

/**
 * Reads the entered sequence.
 */
public class ReadFromTheConsole {
  /**
   * Reads data from the console.
   * @return input sequence.
   */
  public String[] read() {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the sequence of numbers: ");
    String sequence = in.nextLine();
    String[] sequenceParts = sequence.split(" ");
    return sequence.split(" ");
  }
}
