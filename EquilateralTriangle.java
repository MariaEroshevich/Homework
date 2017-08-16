/**
 * Checks whether the triangle is equilateral.
 */
public class EquilateralTriangle extends Triangle {
  /**
   * Constructor of this class.
   *
   * @throws throws an exception when the sides of the triangle
   *                don't conform to the rules for constructing an
   *                equilateral triangle.
   */
  public EquilateralTriangle(double firstSide, double secondSide, double thirdSide) {
    super(firstSide, secondSide, thirdSide);
    if (!isEquilateralTriangle(firstSide, secondSide, thirdSide)) {
      throw new IllegalArgumentException("This triangle is not equilateral");
    }
  }

  /**
   * Checks whether the triangle is equilateral.
   *
   * @param firstSide side of the triangle.
   * @param secondSide side of the triangle.
   * @param thirdSide side of the triangle.
   * @return true when the triangle is equilateral.
   */
  public boolean isEquilateralTriangle(double firstSide, double secondSide, double thirdSide) {
    if (Double.compare(firstSide, secondSide) == 0 &&
      Double.compare(secondSide, thirdSide) == 0) {
      return true;
    }
    return false;
  }

  /**
   * @return string "This triangle is equilateral".
   */
  public String toString() {
    return "This triangle is equilateral.";
  }
}