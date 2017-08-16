/**
 * Checks whether the triangle is equilateral.
 */
public class NormalTriangle extends Triangle {
  /**
   * Constructor of this class.
   *
   * @throws throws an exception when the sides of the triangle
   *                don't conform to the rules for constructing an
   *                normal triangle.
   */
  public NormalTriangle(double firstSide, double secondSide, double thirdSide) {
    super(firstSide, secondSide, thirdSide);
    if (!isNormalTriangle(firstSide, secondSide, thirdSide)) {
      throw new IllegalArgumentException("This triangle is not normal");
    }
  }

  /**
   * Checks whether the triangle is normal.
   *
   * @param firstSide side of the triangle.
   * @param secondSide side of the triangle.
   * @param thirdSide side of the triangle.
   * @return true when the triangle is normal.
   */
  public boolean isNormalTriangle(double firstSide, double secondSide, double thirdSide) {
    if (Double.compare(firstSide, secondSide) != 0 &&
      Double.compare(secondSide, thirdSide) != 0 &&
      Double.compare(firstSide, thirdSide) != 0) {
      return true;
    }
    return false;
  }

  /**
   * @return string "This triangle is normal".
   */
  public String toString() {
    return "This triangle is normal.";
  }
}
