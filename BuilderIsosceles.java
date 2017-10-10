/**
 * Creates object of the class IsoscelesTriangle.
 */
public class BuilderIsosceles extends Builder {
  public BuilderIsosceles(Builder next) {
    super(next);
  }

  /**
   * Returns object of the class IsoscelesTriangle.
   *
   * @param firstSide  side of the triangle.
   * @param secondSide side of the triangle.
   * @param thirdSide  side of the triangle.
   * @return object of the class IsoscelesTriangle.
   */
  Triangle buildTriangle(double firstSide, double secondSide, double thirdSide) {
    return new IsoscelesTriangle(firstSide, secondSide, thirdSide);
  }
}

