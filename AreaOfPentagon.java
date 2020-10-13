import java.util.Scanner;

class AreaOfPentagon {
    public static void main(String[] args) {
        System.out.print("Enter the length from the center to a vertex: ");
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();

        double s = 2 * radius * Math.sin(Math.PI / 5);

        double area = (5 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 5));
        double result = Math.floor(area * 100) / 100;

        System.out.println("The area of the pentagon is: " + result);
    }
}
