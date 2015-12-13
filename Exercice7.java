import java.util.Scanner;
class Exercice7 {
    
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        
        int num = (int)(Math.random() * 101);
        System.out.println("I've chosen a number between 1 and 100. Have a guess:");
        int guess = sc.nextInt();
        int i = 0; //* Number of guesses */
        
        while (i<8) {
            if (guess==num) {
                System.out.println("Congratulations! You correctly guessed the number in " + i + " goes.");
            } else if (guess>num) {
                System.out.println("The number you guessed is too big. Try again:");
                guess = sc.nextInt();
            } else {
                System.out.println("The number you guessed is too small. Try again:");
                guess = sc.nextInt();
            }
            i = i+1;
        }
        if (guess==num) {
            System.out.println("Congratulations! You correctly guessed the number in 8 goes.");
        } else {
            System.out.println("Sorry... You guessed wrong 8 times. The number I chose was " + num);
        }
    }
}