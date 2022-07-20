package ca.ciccc.assignment8.main.problem2;

public class ApplicationDriver {
    public enum ShapeType {
        Rectangle,
        Triangle,
        Circle,
        Square,
        Custom
    }

    public static void main(String args[]) {

        int[] s1Sides = {10, 20};
        Shape s1 = new Shape(ShapeType.Rectangle, s1Sides) {
            @Override
            float perimeter() {
                if (this.sides.length == 2) {
                    return this.sides[0] * 2 + this.sides[1] * 2;
                } else {
                    return -1;
                }
            }

            @Override
            float area() {
                if (this.sides.length == 2) {
                    return this.sides[0] * this.sides[1];
                } else {
                    return -1;
                }
            }
        };

        System.out.println("S1's perimeter is: " + s1.perimeter());
        System.out.println("S1's area is: " + s1.area());

        int[] s2Sides = {10};
        Shape s2 = new Shape(ShapeType.Square, s2Sides) {
            @Override
            float perimeter() {
                return this.sides[0] * 4;
            }

            @Override
            float area() {
                return this.sides[0] * 2;
            }
        };

        System.out.println("S2's perimeter is: " + s2.perimeter());
        System.out.println("S2s area is: " + s2.area());

        int[] s3Sides = {12};
        Shape s3 = new Shape(ShapeType.Circle, s3Sides) {
            private final float PI = 3.14f;

            @Override
            float perimeter() {
                return (this.sides[0] * 2) * PI;
            }

            @Override
            float area() {
                return this.sides[0] * this.sides[0] * PI;
            }
        };

        System.out.println("S3's perimeter is: " + s3.perimeter());
        System.out.println("S3s area is: " + s3.area());

        int[] s4Sides = {8, 12, 12};
        Shape s4 = new Shape(ShapeType.Triangle, s4Sides) {
            @Override
            float perimeter() {
                float total = 0;
                for (int side : this.sides) {
                    total += side;
                }
                return total;
            }

            @Override
            float area() {
                if (this.sides.length == 3) {
                    float height = (float) Math.sqrt(Math.pow(this.sides[1], 2) - Math.pow(this.sides[0] / 2f, 2));
                    return this.sides[0] * height / 2f;
                } else {
                    return -1;
                }
            }
        };

        System.out.println("S4's perimeter is: " + s4.perimeter());
        System.out.println("S4s area is: " + s4.area());
    }
}
