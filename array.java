
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
        
        /*for(int i = 0; i < name.length; i++)
        {
            
        }*/
        
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
