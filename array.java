
package overnight;

import java.util.Scanner;
public class Overnight 
{

    public static void main(String[] args) 
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("Input: ");
        String sName = kb.nextLine();
        
        String[] names = {"Mbali", "Karabo", "Tiyani", "Shaun", "Vinny"};
        int[] ages = {19, 30, 21, 20, 17};
        int index = -1;
        
        int temp = 0;
        String temp1 = "";
        for(int i = 0; i < names.length -1; i++)
        {
            for(int j = 0; j < ages.length -1; j++)
            {
                //less< represent descending whereas great > is assending
                if(ages[j] > ages[j + 1])
                {
                    temp = ages[j];
                    ages[j] = ages[j + 1];
                    ages[j + 1] = temp;
                    
                    temp1 = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = temp1;
                }
            }
        }
        
        for(int i = 0; i < ages.length; i++)
        {
           System.out.println( names[i] + "\t " + ages[i]);
        }
        
        for(int i = 0; i < names.length; i++)
        {
            if(sName.equalsIgnoreCase(names[i]))
            {  
                index = i;
            }
        }
        
        if(index > -1)
        {
            System.out.println( names[index] + " was found and is " + ages[index] +" years old" ); 
        }
        else{
            System.out.println( sName + " doesn't exist " ); 
        }
        
        
        //String xtract = sName.substring(sName.indexOf(" "));
        // extract the word java
        
        /*String sWord = "I LOVE JAVA programming";
        
        
        
        String x = sWord.substring(sWord.indexOf("J") , sWord.lastIndexOf(" "));
        
         System.out.println( x);*/
        
        
       
        //System.out.println(xtract);
        
       
        
        
        
        
    }
    
}
