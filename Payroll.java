import java.util.Scanner;

class Payroll {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter employee's name: ");
        String employeeName = input.next();

        System.out.print("Enter number of hours of worked in a week: ");
        double workedTime = input.nextDouble();

        System.out.print("Enter hourly pay rate: ");
        double payRate = input.nextDouble();

        System.out.print("Enter federal tax withholding rate: ");
        double federalRate = input.nextDouble();

        System.out.print("Enter state tax withholding rate: ");
        double stateRate = input.nextDouble();


        double grossPay = workedTime * payRate;

        double federal = grossPay * federalRate;
        double showFederal = Math.floor(federal * 100) / 100;

        double state = grossPay * stateRate;
        double showState = Math.floor(state * 100) / 100;

        double totalDeduction = showFederal + showState;
        double netPay = Math.floor((grossPay - federal - state) * 100) / 100;


        // Discribe
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Hours Worked: " + workedTime);
        System.out.println("Pay Rate: $" + payRate);
        System.out.println("Gross pay: $" + grossPay);
        System.out.println("Deductions:");
        System.out.println("\tFederal Withholding(" + federalRate * 100 + "): $" + showFederal);
        System.out.println("\tFederal Withholding(" + stateRate * 100 + "): $" + showState);
        System.out.println("\tTotal Deduction: $" + totalDeduction);
        System.out.println("Net Pay $" + netPay);
    }
}