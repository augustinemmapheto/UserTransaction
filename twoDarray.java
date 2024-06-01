
package twodarr;

import java.util.Scanner;
public class TwoDarr 
{
    public static void main(String[] args) 
    {
        // TODO code application logic here
        Scanner input= new Scanner(System.in);
        
        int progr1, compFund, compMath, noSession;
        double payment = 0;
        double calFee;
        boolean Qualify;
        
        System.out.print("Enter PPA115D marks:" );
        progr1 = input.nextInt();
        
        System.out.print("Enter COH115D marks:");
        compMath = input.nextInt();
        
        System.out.print("Enter CFA115D marks:");
        compFund = input.nextInt();
        
        Qualify = qualify(progr1, compMath, compFund);
        
        if(Qualify)
        {
            System.out.print("Enter number of session (2 - 8)");
            noSession = input.nextInt();
            
            calFee = calcTutfee(noSession);
            
            displayfee(payment);
        }
        
    }
    
    public static boolean qualify(int progrl, int compMath, int compFund)
    {
        boolean qualify = false;
        
        if(qualify)
        {
            if(progrl >= 60 && compMath >= 60 || compFund >= 50)
            {
                qualify = true;
            }
            else
            {
                System.out.println("You do not qualify");
            }
        }
        
        return qualify;
    }
    
    public static double calcTutfee(int noSession )
    {
        if(noSession >= 2 && noSession < 8)
        {
        }
        else
        {
            System.out.println("Invalid number of sessions");
        }
        
        return 0.0;
    }
    
    public static void displayfee(double tutFee)
    {
        System.out.println("Your tutoring  fee " + tutFee);
    }
    
}
