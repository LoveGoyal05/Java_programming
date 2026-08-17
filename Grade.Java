import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter marks for Subject 1: ");
        double sub1 = scanner.nextDouble();
        System.out.print("Enter marks for Subject 2: ");
        double sub2 = scanner.nextDouble();

        System.out.print("Enter marks for Subject 3: ");
        double sub3 = scanner.nextDouble();

        double totalMarks = sub1 + sub2 + sub3;
        double average = totalMarks / 3;

    char grade;
        if (average >= 90) {
            grade = 'A';
        } else if (average >=80) {
            grade ='B';
        } else if (average >= 70) {
            grade = 'C';
        } else if (average >=60){
            grade ='D';
        } else {
            grade = 'F';
        }
        System.out.println("\n Result");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average: " + String.format("%.2f", average)); 
        System.out.println("Grade: " + grade);
    }
}