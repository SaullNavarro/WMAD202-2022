package ca.ciccc.assignment8.main.problem3;

class ApplicationDriver {

    static class MyGeometry {
        public void calculateAreaAndPerimeter(Shape shape) {
            if (!shape.shapeType.equals(ShapeType.Custom)) {
                shape.perimeter();
                shape.area();
            } else {
                shape.perimeter();
            }
        }
    }

    enum ShapeType {
        Rectangle,
        Triangle,
        Circle,
        Square,
        Custom
    }

    public static void main(String args[]) {
        MyGeometry mg = new MyGeometry();

        int[] s1Sides = {10, 20};
        ShapeType s1Type = ShapeType.Rectangle;
        mg.calculateAreaAndPerimeter(new Shape(s1Type, s1Sides) {
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
        });

        int[] s2Sides = {10};
        ShapeType s2Type = ShapeType.Square;

        mg.calculateAreaAndPerimeter(new Shape(s2Type, s2Sides) {
            @Override
            float perimeter() {
                return this.sides[0] * 4;
            }

            @Override
            float area() {
                return this.sides[0] * 2;
            }
        });

        int[] s3Sides = {12};
        ShapeType s3Type = ShapeType.Circle;
        mg.calculateAreaAndPerimeter(new Shape(s3Type, s3Sides) {
            private final float PI = 3.14f;

            @Override
            float perimeter() {
                return (this.sides[0] * 2) * PI;
            }

            @Override
            float area() {
                return this.sides[0] * this.sides[0] * PI;
            }
        });

        int[] s4Sides = {8, 12, 12};
        ShapeType s4Type = ShapeType.Custom;
        mg.calculateAreaAndPerimeter(new Shape(s4Type, s4Sides) {
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
        });
    }
}
