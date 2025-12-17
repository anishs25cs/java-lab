import java.util.Scanner;

class Student {
    String usn, name;
    int[] credits = new int[5];
    int[] marks = new int[5];

    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("USN: ");
        usn = sc.next();
        System.out.print("Name: ");
        name = sc.next();

        for (int i = 0; i < 5; i++) {
            System.out.print("Credits of subject " + (i + 1) + ": ");
            credits[i] = sc.nextInt();
            System.out.print("Marks of subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }
    }

    double calculateSGPA() {
        int totalCredits = 0;
        int weightedSum = 0;

        for (int i = 0; i < 5; i++) {
            totalCredits += credits[i];
            weightedSum += credits[i] * (marks[i] / 10);
        }
        return (double) weightedSum / totalCredits;
    }

    void display() {
        System.out.println("USN: " + usn);
        System.out.println("Name: " + name);
        System.out.println("SGPA: " + calculateSGPA());
    }
}

public class StudentMain {
    public static void main(String[] args) {
        Student s = new Student();
        s.accept();
        s.display();
    }
}
