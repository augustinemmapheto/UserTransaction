
package sortnsearch;
import java.util.Scanner;
public class SortnSearch 
{

    public static void main(String[] args) 
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("prompt the user: ");
        int prompt = kb.nextInt();
        //int[] sortNum = {1, 4, 2, 5,3};
        //String[] alfa = {"a ", "b", "c", "d", "e"};
        String[] details = new String[prompt];
        String[] studentNum = new String[details.length];
        
        for(int i = 0; i < details.length; i++)
        {
            System.out.println("enter student names " + (i + 1)+ ": ");
            details[i] = kb.nextLine();
            
            System.out.println("enter student number " + (i + 1)+ ": ");
            studentNum[i] = kb.nextLine();
        }
        
         for(int i = 0; i < prompt; i++)
         {
            //before sort
             System.out.println("Names and Surname \t Student Numbers");
             System.out.println( details[i]  + " \t" + studentNum[i]);
         }
         
         
         
         
         
         
         
         
        
        /*int temp = 0;
        String sMsg = " ";
        for(int j = 0; j < alfa.length - 1; j++)
        {
            for(int i = 0; i < sortNum.length - 1; i++)
            {
                if(sortNum[i] > sortNum[i + 1])
                {
                    temp = sortNum[i];
                    sortNum[i] = sortNum[i + 1];
                    sortNum[i + 1] = temp;
                    
                    sMsg = alfa[i];
                    alfa[i] = alfa[i + 1];
                    alfa[i + 1] = sMsg;
                    
                }
            }
        }
        
        for(int i = 0; i < sortNum.length; i++)
         {
             //after sort
             System.out.println("\n"+ sortNum[i] + " \t" + alfa[i]);
             
         }*/
        
    }
    
}
