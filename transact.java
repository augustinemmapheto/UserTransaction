import java.util.Scanner;

public class BasicMenu {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        while (true) {
            // Display the menu options
            System.out.println("Transactions:");
            System.out.println("1. Log in");
            System.out.println("2. Loans");
            System.out.println("3. Bills");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            // Get the user's choice
            int choice = kb.nextInt();

            // Use a switch statement to perform actions based on the user's choice
            switch (choice) {
                case 1:
                    System.out.println("Welcome, Thabo\n");
                    int iSPin = 0000;
                    int iPin = 0;
                    
                    boolean isCorrect = false;
                    
                    while(!isCorrect)
                    {
                         System.out.print(" please enter your pin to log in: ");
                         iPin = kb.nextInt();
                        if(iPin == iSPin)
                        {
                            isCorrect = true; 
                            System.out.println(" You have successfully logged in!!!");
                            
                        }
                        else
                        {
                           System.out.println("incorrect pin!!!, please try again");
                        }
                    }
                    break;
                case 2:
                    System.out.println("Calculate your monthly installment right here!!!");
                    // Add code for Option 2 here
                     int iPayNo;
                     double rIntrestRate = 6/100;
                     double rAmount, rMonthly, rUpper, rLower;
                    
                    System.out.print("Enter loan amount");
                    iAmount = kb.nextInt();
                    System.out.print("Enter no. of monthly payments");
                    iAmount = kb.nextInt();

                    if(iPayNo>0)
                    {
                        rUpper = rIntrestRate * Math.pow((1 + rIntrestRate), iPayNo);
                    }
                    else
                    {
                        System.out.println("incorrect number of monthly payment");
                    }
                    
                    break;
                case 3:
                    System.out.println("You can pay your bills here");
                    // Add code for Option 3 here
                    break;
                case 4:
                    System.out.println("Exiting the program.");
                    kb.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
}
