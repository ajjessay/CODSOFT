import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" STUDENT GRADE CALCULATOR ");

      
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        double totalMarks = 0;
        
        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter marks obtained in subject " + i + " (out of 100): ");
            double marks = scanner.nextDouble();

            if (marks < 0 || marks > 100) {
                System.out.println("❌ Invalid marks! Please enter a value between 0 and 100.");
                i--; 
                continue; 
            }
            
            totalMarks += marks; 
        }
        double averagePercentage = totalMarks / numSubjects;
        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F'; 
        }

        System.out.println(" RESULTS ");
        System.out.printf("Total Marks Obtained : %.2f / %d\n", totalMarks, (numSubjects * 100));
        System.out.printf("Average Percentage   : %.2f%%\n", averagePercentage);
        System.out.println(" Grade   : " + grade);
        System.out.println("=========================================");

        scanner.close();
    }
}