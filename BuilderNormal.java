/**
 * Creates object of the class NormalTriangle.
 */
public class BuilderNormal extends Builder {
  public BuilderNormal(Builder next) {
    super(next);
  }

  /**
   * Returns object of the class NormalTriangle.
   *
   * @param firstSide side of the triangle.
   * @param secondSide side of the triangle.
   * @param thirdSide side of the triangle.
   * @return object of the class NormalTriangle.
   */
  Triangle buildTriangle(double firstSide, double secondSide, double thirdSide) {
    return new NormalTriangle(firstSide, secondSide, thirdSide);
  }
}
