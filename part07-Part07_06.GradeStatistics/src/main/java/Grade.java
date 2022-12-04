/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author plainsailing66
 */
import java.util.ArrayList;
public class Grade {
    private ArrayList<Integer> Grades;
    private ArrayList<Integer> Points;
    private int allCount;
    private int passCount;
    
    public Grade() {
        this.Grades = new ArrayList<>();
        this.Points = new ArrayList<>();
    }
    
    public void addGradeBasedOnPoints(int points) {
        this.Grades.add(pointsToGrade(points));
        this.Points.add(points);
    }
    
    public static int pointsToGrade(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }
    
    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.Grades) {
            if (received == grade) {
                count++;
            }
        }
        return count;
    }
    
    public double allAverage() {
        int count = 0;
        int sum = 0;
        for (int point: Points) {
            count++;
            sum += point;
        }
        this.allCount = count;
        return (double) sum / count;
    }
    
    public double passAverage() {
        int count = 0;
        int sum = 0;
        for (int point: Points) {
            if (point >= 50) {
                count++;
                sum += point;
            }
        }
        this.passCount = count;
        return (double) sum / count;
    }
    
    public double passPercentage() {
        return (double) this.passCount / this.allCount * 100;
    }
    
    
}
