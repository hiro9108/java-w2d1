import java.util.Scanner;
import java.nio.charset.StandardCharsets;

class VowelOrCons {
    public static void main(String[] args) {
        System.out.print("Enter a Letter: ");
        Scanner input = new Scanner(System.in);
        String character = input.next();
        byte[] bytes = character.getBytes(StandardCharsets.US_ASCII);

        if ((bytes[0] >= 65 && bytes[0] <= 90) || (bytes[0] >= 97 && bytes[0] <= 122)) {
            if (bytes[0] == 65 || bytes[0] == 69 || bytes[0] == 73 || bytes[0] == 79 || bytes[0] == 85) {
                System.out.println(character + " is a Capital Vowel");
            } else if (bytes[0] == 97 || bytes[0] == 101 || bytes[0] == 105 || bytes[0] == 111 || bytes[0] == 117){
                System.out.println(character + " is a Lower Vowel");
            } else {
                System.out.println(character + " is a Consonant");   
            }
        } else {
            System.out.println(character + " is an invalid input");
        }
    }
}