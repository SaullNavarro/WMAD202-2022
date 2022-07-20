package ca.ciccc.assignment7.main.problem1;

public class Student implements Specificable{
    private String NameOfStudent;
    private String Course;
    private double GPA;

    public Student(String NameOfStudent, String Course, double GPA){
        this.NameOfStudent = NameOfStudent;
        this.Course = Course;
        this.GPA = GPA;
    }
    @Override
    public boolean hasSpecificProperty() {
        return this.GPA > 4;
    }
}
