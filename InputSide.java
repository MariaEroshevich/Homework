import java.util.Scanner;

import java.util.Scanner;

/**
 * Introduces the sides of the triangle.
 */
public class InputSide {
  private double firstSide;
  private double secondSide;
  private double thirdSide;

  public double getFirstSide() {
    return firstSide;
  }

  public double getSecondSide() {
    return secondSide;
  }

  public double getThirdSide() {
    return thirdSide;
  }

  /**
   * Introduces the sides of the triangle.
   */
  public void inputSide() {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the first side: ");
    firstSide = in.nextDouble();
    System.out.println("Enter the second side: ");
    secondSide = in.nextDouble();
    System.out.println("Enter the third side: ");
    thirdSide = in.nextDouble();
  }
}
