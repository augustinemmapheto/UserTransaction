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


//while loop, do-while, and 

import java.util.Scanner;
class HelloWorld 
{
    public static void main(String[] args) 
    {
        int iC, iNum, rSum = 0;
        boolean isValid;
        //int iC, iNumSweets, iNumBread, rTotal =0;
        //int rTotSweets = 0, rTotLoafs = 0;
        Scanner kb = new Scanner(System.in);
        
        //System.out.print("1. to begin Transcaction or  \n 2. to Exit \n\n Choice: ");
        //iC = kb.nextInt();
        /*
        while(iC != 2)
        {
            if(iC == 1)
            {
                System.out.print("Num of Bread: ");
                iNumBread = kb.nextInt();
                System.out.print("Num of Sweets: ");
                iNumSweets = kb.nextInt();
                
                rTotSweets += iNumSweets;
                rTotLoafs += iNumBread;
                
                
                
            }
            else
            {
                System.out.println("Invalid Choice, try again");
            }
            
            System.out.print("1. to begin Transcaction or  \n 2. to Exit \n\n Choice: ");
            iC = kb.nextInt();
            
        }
        
        rTotal = rTotSweets + rTotLoafs;
        System.out.println("The total numver of loafs : " + rTotLoafs);
        System.out.println("The rotal of sweets : " + rTotSweets);
         System.out.println("The rotal of sweets : " + rTotal);
        */
        System.out.print("1. to Sum \n 2. to Exit \n\n Choice: ");
        iC = kb.nextInt();
        
        while(iC != 2)
        {
            if(iC == 1)
            {
                do
                {
                    System.out.print("Enter a value to sum: ");
                    iNum = kb.nextInt();
                    if(iNum<1)
                    {
                        System.out.println("Invalid num, try postive num...");
                        isValid = false;
                    }
                    else
                    {isValid = true;
                        
                    }
                }while(!isValid);
                
            }
            else
            {
                System.out.println("Invalid Choice, try again");
            }
            
            System.out.print("1. to Sum \n 2. to Exit \n\n Choice: ");
            iC = kb.nextInt();
        }
        
        System.out.println("The Sum of is : " +rSum);
        
        
        
        
    }
    
    public static int Sum(int iNum)
    {
        
    }
}

//static Method 

import java.util.Scanner;
class HelloWorld 
{
    public static void displayInfo(int Sum)
    {
        System.out.println("The Total sum is: " + Sum );
    }
    
    public static int calSum(int rSum, int iNum)
    {
        return rSum += iNum;
    }
    
    public static void main(String[] args) 
    {
        int iNum, iChoice, rSum= 0;
        
        Scanner kb = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        iNum = kb.nextInt();
        
        int total = calSum(rSum, iNum);
        
        displayInfo(total);
        
        
    }
}


