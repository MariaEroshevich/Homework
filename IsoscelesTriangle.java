/**
 * Checks whether the triangle is isosceles.
 */
public class IsoscelesTriangle extends Triangle {
  /**
   * Constructor of this class.
   *
   * @throws throws an exception when the sides of the triangle
   *                don't conform to the rules for constructing an
   *                isosceles triangle.
   */
  public IsoscelesTriangle(double firstSide, double secondSide, double thirdSide) {
    super(firstSide, secondSide, thirdSide);
    if (!isIsoscelesTriangle(firstSide, secondSide, thirdSide)) {
      throw new IllegalArgumentException("This triangle is not isosceles");
    }
  }

  /**
   * Checks whether the triangle is isosceles.
   *
   * @param firstSide side of the triangle.
   * @param secondSide side of the triangle.
   * @param thirdSide side of the triangle.
   * @return true when the triangle is isosceles.
   */
  public boolean isIsoscelesTriangle(double firstSide, double secondSide, double thirdSide) {
    if (Double.compare(firstSide, secondSide) == 0 ||
      Double.compare(secondSide, thirdSide) == 0 ||
      Double.compare(firstSide, thirdSide) == 0) {
      return true;
    }
    return false;
  }

  /**
   * @return string "This triangle is isosceles".
   */
  public String toString() {
    return "This triangle is isosceles.";
  }
}
     