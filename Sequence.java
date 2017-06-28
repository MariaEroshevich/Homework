import java.util.Scanner;

public class Sequence {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the sequence of numbers: ");
    String sequence = in.nextLine();
    String[] sequenceParts = sequence.split(" ");
    try {
      for (int i = 1; i < sequenceParts.length; i++) {
        if (Integer.parseInt(sequenceParts[i]) < Integer.parseInt(sequenceParts[i - 1])) {
          System.out.println("The entered sequence of numbers is not non-decreasing.");
          return;
        }
      }
    } catch (NumberFormatException e) {
        System.err.println("You entered an invalid number format.");
        return;
    }
    System.out.println("The entered sequence of numbers does not decreasing.");
  }
}
