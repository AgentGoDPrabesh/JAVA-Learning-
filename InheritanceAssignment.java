class Shape {
  double length, breadth, height;

  Shape(double length, double breadth, double height) {
      this.length = length;
      this.breadth = breadth;
      this.height = height;
  }
}

class Cube extends Shape {
  Cube(double length) {
      super(length, length, length);
  }

  double volume() {
      return length * length * length;
  }
}

class Cuboid extends Shape {
  Cuboid(double length, double breadth, double height) {
      super(length, breadth, height);
  }

  double volume() {
      return length * breadth * height;
  }
}

public class InheritanceAssignment {
  public static void main(String[] args) {
      Cube cube = new Cube(5);
      System.out.println("Volume of cube: " + cube.volume());

      Cuboid cuboid = new Cuboid(4, 6, 7);
      System.out.println("Volume of cuboid: " + cuboid.volume());
  }
}
