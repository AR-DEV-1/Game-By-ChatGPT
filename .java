import java.util.Scanner;

public class AdventureGame {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        int age, choice;
        boolean playAgain = true;
        
        System.out.println("Welcome to Adventure Game!");
        System.out.print("What is your name? ");
        name = scanner.nextLine();
        System.out.print("How old are you? ");
        age = scanner.nextInt();
        
        while (playAgain) {
            System.out.println("Hello, " + name + "! You are " + age + " years old.");
            System.out.println("You find yourself in a dark room. What do you do?");
            System.out.println("1. Look around");
            System.out.println("2. Wait");
            System.out.println("3. Leave the room");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.println("You find a key on the ground.");
                    break;
                case 2:
                    System.out.println("You wait for a while, but nothing happens.");
                    break;
                case 3:
                    System.out.println("You leave the room and find yourself in a corridor.");
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
            
            System.out.println("Do you want to play again? (y/n)");
            String playAgainStr = scanner.next();
            if (playAgainStr.equalsIgnoreCase("n")) {
                playAgain = false;
            }
        }
        
        System.out.println("Thanks for playing Adventure Game!");
    }
}
