package example.e27;

public class E27GradeCalculatorElseIf {
    public static void main(String[] args) {
        // Hint: Declare 'score' as an int and assign 85 to it
        int score=85;
        char grade='-';
        // Hint: Use if-else if statements to check grades A, B, C, D, F in order
        if (score>100){
            System.out.println("It is not possible");
        } else if (score>=90){
            grade='A';
        } else if (score>=80){
            grade='B';
        } else if (score>=70){
            grade='C';
        } else if (score>=60){
            grade='D';
        } else if (score>=0){
            grade='F';
        } else{
            System.out.println("It is not possible");
        }
        // Hint: Print the grade using System.out.println()
        System.out.println("Your grade is: "+grade);
        // Expected output: "Your grade is: B"
    }
}