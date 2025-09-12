import java.util.Scanner;

public class OnlineExamination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // login credentials
        String username = "student";
        String password = "1234";

        // login process
        System.out.print("Enter Username: ");
        String u = sc.nextLine();
        System.out.print("Enter Password: ");
        String p = sc.nextLine();

        if (!u.equals(username) || !p.equals(password)) {
            System.out.println("Login Failed!");
            return;
        }

        System.out.println("Login Successful!\n");

        int score = 0;

        // Question 1
        System.out.println("1. What is the capital of India?");
        System.out.println("a) Mumbai");
        System.out.println("b) New Delhi");
        System.out.println("c) Chennai");
        System.out.println("d) Kolkata");
        System.out.print("Your Answer: ");
        char ans1 = sc.next().charAt(0);
        if (ans1 == 'b') score++;

        // Question 2
        System.out.println("\n2. Who invented Java?");
        System.out.println("a) Dennis Ritchie");
        System.out.println("b) James Gosling");
        System.out.println("c) Bjarne Stroustrup");
        System.out.println("d) Guido van Rossum");
        System.out.print("Your Answer: ");
        char ans2 = sc.next().charAt(0);
        if (ans2 == 'b') score++;

        // Question 3
        System.out.println("\n3. Which keyword is used for inheritance in Java?");
        System.out.println("a) super");
        System.out.println("b) extends");
        System.out.println("c) this");
        System.out.println("d) implements");
        System.out.print("Your Answer: ");
        char ans3 = sc.next().charAt(0);
        if (ans3 == 'b') score++;

        // result
        System.out.println("\nExam Finished!");
        System.out.println("Your Score: " + score + "/3");
        System.out.println("Logout Successful. Thank you!");
    }
}
 