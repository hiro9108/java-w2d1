import java.util.Scanner;
import java.util.Arrays;

class OrderThreeCities {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first city: ");
        String firstInputCity = input.next();

        System.out.print("Enter the second city: ");
        String secondInputCity = input.next();

        System.out.print("Enter the third city: ");
        String thirdInputCity = input.next();

        String[] sort = {firstInputCity, secondInputCity, thirdInputCity};

        Arrays.sort(sort);

        System.out.println("The three cities in alphabetical order are " + sort[0] + " " + sort[1] + " " + sort[2]);
    }
}