import java.util.Scanner;

public class UserInterface {
        
     public static void main() {

        boolean exit = false;
        while (exit == false) {
            System.out.println("Welcome to Quizmaster64!\n##################\n");
            System.out.println("Choese an option:\n1: Start a quiz\n2: View results\n3: Create a quiz\n4: Exit");
        
            boolean done = false;
            while (done == false) {
                done = true;

                Scanner scanner = new Scanner(System.in);
                Str userInput = scanner.nextln();

                userInput.strip();
                switch(userInput) {
                    case("1"):
                        startQuiz();
                        break;
                    case("2"):
                        viewResults();
                        break;
                    case("3"):
                        createQuiz();
                        break;
                    case("4"):
                        exit = true;
                        break;
                    defualt:
                        System.out.println("invalid input. Enter 1,2,3 or 4");
                        done = false;
                }       
            }
                
        }
        
    }

    public static void startQuiz() {
        System.out.println("this is the quiz");
    }    
     
    public static void viewResults() {
        System.out.println("this is the quiz");
    }

    public static void createQuiz() {
        System.out.println("this is the quiz");
    }

 }



