/**
 *  Creates a triangle.
 */
abstract class Builder {
  Builder next;

  Builder(Builder next) {
    this.next = next;
  }

  /**
   * Returns object of the class Triangle.
   *
   * @param firstSide side of the triangle.
   * @param secondSide side of the triangle.
   * @param thirdSide side of the triangle.
   * @return object of the class Triangle.
   */
  abstract Triangle buildTriangle(double firstSide, double secondSide, double thirdSide);

  /**
   * Checks the type of the entered triangle.
   *
   * @param firstSide side of the triangle.
   * @param secondSide side of the triangle.
   * @param thirdSide side of the triangle.
   * @return object of the class Triangle.
   */
  public Triangle build(double firstSide, double secondSide, double thirdSide) {
    Triangle triangle = null;
    try {
      triangle = buildTriangle(firstSide, secondSide, thirdSide);
    } catch (IllegalArgumentException e) {
      if (next != null) {
        triangle = next.build(firstSide, secondSide, thirdSide);
      }
      System.out.println(e.getMessage());
    }
    return triangle;
  }
}


