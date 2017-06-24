import java.util.Scanner;

public class Fibonacci {
  public static void main(String[] args) {
    int FibonacciSum = 0;
    int FibonacciNumber1 = 0;
    int FibonacciNumber2 = 1;
    
    Scanner in = new Scanner(System.in);
    System.out.print("Enter a positive number: ");
    int EnteredNumber = in.nextInt();
    System.out.println("Entered number:" + EnteredNumber);
    
    if (EnteredNumber < 0) {
      System.out.println("You entered a negative number.");
      System.exit(0);
    } else {
      while (EnteredNumber > FibonacciSum) {
        FibonacciSum = FibonacciNumber1 + FibonacciNumber2; 
        FibonacciNumber1 = FibonacciNumber2;
        FibonacciNumber2 = FibonacciSum;
      }
    }
      if (EnteredNumber == FibonacciSum) {
        System.out.println("The entered number is the number of the Fibonacci series.");
      } else {
        System.out.println("The entered number is not the number of the Fibonacci series.");
      }
    } 
  }
    
    
    