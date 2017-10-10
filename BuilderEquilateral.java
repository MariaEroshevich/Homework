/**
 *  Creates object of the class EquilateralTriangle.
 */
public class BuilderEquilateral extends Builder {
  public BuilderEquilateral(Builder next) {
    super(next);
  }

  /**
   * Returns object of the class EquilateralTriangle.
   *
   * @param firstSide side of the triangle.
   * @param secondSide side of the triangle.
   * @param thirdSide side of the triangle.
   * @return object of the class EquilateralTriangle.
   */
  Triangle buildTriangle(double firstSide, double secondSide, double thirdSide) {
    return new EquilateralTriangle(firstSide, secondSide, thirdSide);
  }
}

