package ca.ciccc.assignment8.main.problem2;

abstract class Shape {
    ApplicationDriver.ShapeType shapeType;
    int[] sides;
    public Shape(ApplicationDriver.ShapeType shapeType, int[] sides) {
        this.shapeType = shapeType;
        this.sides = sides;
    }

    abstract float perimeter();
    abstract float area();
}
