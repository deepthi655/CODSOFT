
import java.util.Scanner;

public class  Student_Grade_Calculator{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Student Grade Calculator. Please enter the required details to compute your grades.");
        System.out.print("Enter the number of subjects:");
        int subjectCount = sc.nextInt();

        int cumulativeMarks = 0;
        for (int i = 1; i <= subjectCount; i++) {
            System.out.print("Enter marks obtained in subject " + i + ": ");
            int obtainedMarks = sc.nextInt();
            cumulativeMarks += obtainedMarks;
        }

        double percentageScore = (double) cumulativeMarks / subjectCount;

        char finalGrade;
        if (percentageScore >= 90) {
            finalGrade = 'A';
        } else if (percentageScore >= 80) {
            finalGrade = 'B';
        } else if (percentageScore >= 70) {
            finalGrade = 'C';
        } else if (percentageScore >= 60) {
            finalGrade = 'D';
        } else if (percentageScore >= 50) {
            finalGrade = 'E';
        } else {
            finalGrade = 'F';
        }

        System.out.println("\nCumulative Marks: " + cumulativeMarks);
        System.out.println(String.format("Average Percentage: %.2f%%", percentageScore));
        System.out.println("Final Grade: " + finalGrade);

        sc.close();
    }
}
