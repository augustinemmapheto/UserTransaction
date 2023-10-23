import java.util.Scanner;

public class BasicMenu {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        
        while (true) {
            System.out.println("Welcome to Our Loan Solution");
            System.out.println("Transactions:");
            System.out.println("1. Log in");
            System.out.println("2. Loans");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

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
                    System.out.println("Calculate your monthly installment right here!!!\n");
                    
                    int iPayNo;
        double rInterestRate = 6.0/100;
        double rAmount, rMonthly, rUpper, rLower;
        double rInner = 1 + rInterestRate;
        
        System.out.print("Enter loan amount:");
        rAmount = kb.nextDouble();
        System.out.print("Enter no. of monthly payments: ");
        iPayNo = kb.nextInt();

        if((iPayNo>0) && (iPayNo < 24))
        {
            rUpper = rInterestRate * Math.pow(rInner, iPayNo);
            rLower = Math.pow(rInner, iPayNo) -1;
            rMonthly = rAmount * (rUpper/rLower);
            
            System.out.println("Your monthly installment which needs to be paid is: R" + rMonthly);
        }
        else
        {
            System.out.println("incorrect number of monthly payment");
        }
                    
                    break;
                case 3:
                    System.out.println("Exiting the program.");
                    kb.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }//end main method
}//end class
