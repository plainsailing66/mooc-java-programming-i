/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author plainsailing66
 */
import java.util.Scanner;
public class UI {
    private Grade Grades;
    private Scanner scanner;
    
    public UI(Grade Grades, Scanner scanner) {
        this.Grades = Grades;
        this.scanner = scanner;
    }
    
    public void start() {
        readPoints();
        System.out.println("Point average (all): " + Grades.allAverage());
        System.out.println("Point average (passing): " + Grades.passAverage());
        System.out.println("Pass percentage: " + Grades.passPercentage());
        System.out.println("Grade distribution:");
        printGradeDistribution();
    }
    
    public void readPoints() {
        System.out.println("Enter point totals, -1 stops:");
        while(true) {
            int point = Integer.valueOf(scanner.nextLine());
            if (point == -1) {
                break;
            }
            if (point < 0 || point > 100) {
                continue;
            }
            this.Grades.addGradeBasedOnPoints(point);
        }
    }
    
    public void printGradeDistribution() {
        int grade = 5;
        while (grade >= 0) {
            int stars = Grades.numberOfGrades(grade);
            System.out.print(grade + ": ");
            printsStars(stars);
            System.out.println("");

            grade = grade - 1;
        }
    }

    public static void printsStars(int stars) {
        while (stars > 0) {
            System.out.print("*");
            stars--;
        }
    }
}
