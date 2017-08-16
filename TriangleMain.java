public class TriangleMain {
  public static void main(String[] args) {
    InputSide input = new InputSide();
    input.inputSide();
    double firstSide = input.getFirstSide();
    double secondSide = input.getSecondSide();
    double thirdSide = input.getThirdSide();
    BuilderEquilateral builderEquilateral = new BuilderEquilateral(new BuilderIsosceles(new BuilderNormal(null)));
    Triangle triangle = builderEquilateral.build(firstSide, secondSide, thirdSide);
      if (triangle != null) {
        System.out.println(triangle.toString());
      }
  }
}