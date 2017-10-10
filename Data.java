import java.util.Scanner;
import java.util.InputMismatchException;

public class Data {
  public static void main(String[] args) { 
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the number of persons: ");
    int numberOfPerson = in.nextInt();
    in.nextLine();
    int i = 0;
    Person[] person = new Person[numberOfPerson];
    while (i < numberOfPerson) {
      try {
        System.out.println("Enter the firstname: ");
        String firstName = in.nextLine();
        System.out.println("Enter the lastname: ");
        String lastName = in.nextLine();
        System.out.println("Enter the year of birth: ");
        int year = in.nextInt();
        in.nextLine();
        person[i] = new Person(firstName, lastName, year);
        i++;
      } catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
      } catch(InputMismatchException e) {
        System.out.println("Instead of a number, you enter a character. Please enter again: ");
      }
    }
    System.out.println("List of person: ");
    for (int j = 0; j < numberOfPerson; j++) {
      System.out.println(person[j].getFirstName() + " " + person[j].getLastName() + " " + person[j].getYear());
    }
  }
}