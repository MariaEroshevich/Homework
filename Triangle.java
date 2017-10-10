import java.lang.Double;

/**
 * The class checks the existence of a triangle.
 */
public class Triangle {
  private double firstSide;
  private double secondSide;
  private double thirdSide;

  public Triangle(double firstSide, double secondSide, double thirdSide) {
    this.firstSide = firstSide;
    this.secondSide = secondSide;
    this.thirdSide = thirdSide;
    checkForExistence(firstSide, secondSide, thirdSide);
  }

  /**
   * Checks whether there is a triangle or not.
   *
   * @param firstSide side of the triangle.
   * @param secondSide side of the triangle.
   * @param thirdSide side of the triangle.
   * @throws throws an exception when the side don't match the
   *                conditions for building a triangle.
   */
  public void checkForExistence(double firstSide, double secondSide, double thirdSide) {
    if (Double.compare(firstSide, 0) <= 0 ||
      Double.compare(secondSide, 0) <= 0 ||
      Double.compare(thirdSide, 0) <= 0) {
      throw new IllegalArgumentException("Triangle doesn't exist.");
    } else if (Double.compare(firstSide, secondSide + thirdSide) >= 0 ||
      Double.compare(secondSide, firstSide + thirdSide) >= 0 ||
      Double.compare(thirdSide, firstSide + secondSide) >= 0) {
      throw new IllegalArgumentException("Triangle doesn't exist.");
    }
  }
} 