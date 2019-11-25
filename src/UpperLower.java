import java.util.Scanner;

public class UpperLower {
    public static void main(String[] args){
        //String sentence = "I love eating rice";
        Scanner input  = new Scanner(System.in);
        System.out.println("Enter a sentence to transform");
        String sentence = input.nextLine();

        System.out.println(sentence.toUpperCase());
        System.out.println(sentence.toLowerCase());
    }
}
