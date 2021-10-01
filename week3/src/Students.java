package week3.src;

import java.rmi.MarshalException;
import java.util.Arrays;

public class Students {
    private int ID;
    private String stdName;
    private double[] marks;

    public Students(int ID, String stdName, double[] marks) {
        this.ID = ID;
        this.stdName = stdName;
        this.marks = marks;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getStdName() {
        return stdName;
    }

    public void setStdName(String stdName) {
        this.stdName = stdName;
    }

    public double[] getMarks() {
        return marks;
    }

    public void setID(double[] marks) {
        this.marks = marks;
    }

    public double Avg() {
        int sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];
        }
        return (double) sum / marks.length;
    }

    public String toString() {
        return "\nStudents\n" + "Student ID: " + ID + "\nName: " + stdName + "\nMark: " + Arrays.toString(marks)
                + "\nAverage: " + Avg();
    }
}
