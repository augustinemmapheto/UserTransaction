
import java.util.Scanner;
class HelloWorld 
{
    public static void main(String[] args) 
    {
        Scanner kb = new Scanner(System.in);
        int[] marks = new int[5];
        int Sum = 0;
        double Avg = 0;
        
        
        
        for(int i = 0; i < marks.length;i++)
        {
            System.out.print("Enter test " + (i + 1) + ": ");
            marks[i] = kb.nextInt();
        }
        
        System.out.println("\n");
        
        
        
        displayResuls(marks);
        
        System.out.println("\n");
        calcSum(marks);
        
        calcAvg(marks, Avg);
        
        /*for(int i = 0; i < marks.length;i++)
        {
            Sum += marks[i];
        }
        
        System.out.println("the tot sum " + Sum);*/
        
    }
    
    public static String displayResuls(int[] marks)
    {
        String sMsg = "";
        
        
        for(int i = 0; i< marks.length; i++)
        {
            sMsg = "The marks for " + (i + 1) + ": "  + marks[i] ;
            System.out.println(sMsg);
        }
        
        /*for(int i = 0; i < marks.length;i++)
        {
            sum += marks[i];
        }
        System.out.println("the total sum  is: " + sum);*/
        return sMsg;
        
    }
    
    public static int calcSum(int[] marks)
    {
        int sum = 0;
        for(int i = 0; i < marks.length;i++)
        {
            sum += marks[i];
        }
        System.out.println("the total sum  is: " + sum);
        return sum;
    }
    public static int calcAvg(int[] marks, double Avg)
    {
        int sum = calcSum(marks);
        Avg = sum/marks.length;
        
        System.out.println("the average: " + Avg);
        return sum;
    }
}
