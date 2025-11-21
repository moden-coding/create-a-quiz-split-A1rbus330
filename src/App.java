import java.util.*;
//The problem should include the split method. You might also add in any String methods
//or array skills. Think about Practice Quiz problem or CodingBat problems.
//Create a question AND a solution to that question

//Give instructions for your problem below:
// write a program that takes a sentence input from the user, and then the user
//inputs a letter, and then it prints how many times that letter appears.

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a sentence");
        String input = scanner.nextLine();
        input = "." + input + ".";
        String letter;
        while (true) {
            System.out.println("Give a letter");
            letter = scanner.nextLine();
            if (letter.length() > 1 || letter.length() < 1 || input.equals(".")) {
                System.out.println("Not working");
            } else {
                break;
            }
        }
        String[] sentence = input.split(letter);
        System.out.println(sentence.length - 1);
    }
}
