import java.util.Scanner;

public class a7DylanJamison {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = in.nextInt();
        int[] scores = new int[numberOfStudents];

        for(int i = 0; i < numberOfStudents; i++)
{
        System.out.print("Enter " + numberOfStudents + " scores: ");
        scores[i] = in.nextInt();  
}
        displayGrades(scores);
    }

    public static void displayGrades(int[] grades) {
        int highScore = bestGrade(grades);
        
        for (int i = 0; i < grades.length; i++) {
            System.out.printf("Student %d score is %d and grade is %s%n",
                i, grades[i], assignLetterGrade(grades[i], highScore));
        }
    }

    public static char assignLetterGrade(int grade, int highScore) {

        if (highScore - grade <= 10)
            return 'A';
        else if (highScore - grade > 10 && highScore - grade <= 20)
            return 'B';
        else if (highScore - grade > 20 && highScore - grade <= 30)
            return 'C';
        else if (highScore - grade > 30 && highScore - grade <= 20)
            return 'D';
        else 
            return 'F';
    }

    public static int bestGrade(int[] grades) {
        int highScore = grades[0];

        for (int grade : grades) {

            if (grade > highScore)
                highScore = grade;
        }

        return highScore;
    }
}



import java.util.Scanner;



 public class Exercise09 {

    static final int SIZE = 10;

    public static void main(String[] args) {

        double[] n = new double[SIZE];
        Scanner input = new Scanner(System.in);

        System.out.print("Enter " + SIZE + " numbers: ");
        for (int i = 0; i < n.length; i++) n[i] = input.nextDouble();

        System.out.println("The minimum number is: " + min(n));
    }

    public static double min(double[] array) {

        double min = array[0];
        for (int i = 0; i < array.length; i++) {

            if (min > array[i]) min = array[i];
        }

        return min;
    }
}
