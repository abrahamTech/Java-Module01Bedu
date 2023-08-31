import java.util.Scanner;

public class Challenge02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String msj = "";

        System.out.println("Enter your grade: ");
        double score = scanner.nextDouble();

        if(score == 10){
            msj = "Excelent!";
        } else if (score >= 8) {
            msj = "Very Good!";
        } else if (score >= 7) {
            msj = "Good Work";
        } else if (score >= 6) {
            msj = "You Pass";
        } else {
            msj = "Try Again";
        }
        System.out.print("Your score is: " + score + " - " + msj);
    }
}
