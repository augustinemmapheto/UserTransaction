import java.util.Scanner;
class LoopPin
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        int iSPin = 0000;
        int iPin = 0;
        
        boolean isCorrect = false;
        
        while(!isCorrect)
        {
             System.out.print("Enter pin: ");
             iPin = kb.nextInt();
            if(iPin == iSPin)
            {
                isCorrect = true; 
                System.out.println("pin correct.");
                
            }
            else
            {
               System.out.println("incorrect pin!!!, please try again");
            }
                        
        }
       
    }
}
