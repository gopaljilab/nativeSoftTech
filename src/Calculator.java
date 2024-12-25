import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Calculator !");
        boolean continueCalculating = true;

        while(continueCalculating){
            try{

                //take input jj
                System.out.println("Enter A First Number: ");
                double firstNum = Double.parseDouble(sc.nextLine());

                System.out.println("Enter The Second Number: ");
                double secondNum = Double.parseDouble(sc.nextLine());

                System.out.println("Please Enter the operator which you want to perform on these number !");
                System.out.println("Enter Operator : +, -, *, /");
                char operator = sc.nextLine().charAt(0);

                double result;
                switch (operator){
                    case '+':
                        result = firstNum + secondNum;
                        break;
                    case '-':
                        result = firstNum - secondNum;
                        break;
                    case '*':
                        result = firstNum * secondNum;
                        break;
                    case '/':
                        result = firstNum / secondNum;
                        break;
                    default:
                        System.out.println("Error: Invalid operator. Please use +, -, *, or /.");
                        continue;
                }
                System.out.println("Result : "+result);
            }
            catch (NumberFormatException e) {
                System.out.println("Error: Invalid input. Please enter numeric values.");
            }

            System.out.println("Do you Want to perform another Calculation?(yes/no): ");
            String response = sc.nextLine().toLowerCase();
            if (!response.equals("yes")){
                continueCalculating=false;
                System.out.println("Thank you for using the Calculator.");
                System.out.println("GoodBye!!");
            }
        }
    }
}
