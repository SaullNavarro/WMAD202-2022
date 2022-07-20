package ca.ciccc.assignment8.main.problem3;


import ca.ciccc.assignment8.main.problem2.ApplicationDriver;

abstract class Shape {
    ApplicationDriver.ShapeType shapeType;
    int[] sides;
    public Shape(ApplicationDriver.ShapeType shapeType, int[] sides) {
        this.shapeType = shapeType;
        this.sides = sides;
    }

    public Shape(ca.ciccc.assignment8.main.problem3.ApplicationDriver.ShapeType s1Type, int[] s1Sides) {
    }

    abstract float perimeter();
    abstract float area();
}