import java.util.Scanner;
class HelloWorld
{
    
    public static void main(String[] args) 
    { 
        Scanner kb = new Scanner(System.in);
        System.out.print("enter the number of students : ");
        int numMarks =  kb.nextInt();

        String[] names = new String[numMarks];
        int[] marks = new int[numMarks];
        
        for(int i = 0; i< numMarks; i++)
        {
            System.out.print("Enter name " + (i + 1) + " : ");
            names[i] = kb.next();
            System.out.print("Enter marks for  " + (i + 1) + " : ");
            marks[i] = kb.nextInt();
        }
        
        for(int i = 0; i< marks.length; i++)
        {
            System.out.println(names[i] + "\t" + marks[i]);
        }
        int temp = 0;
        //sorting using bubble
        for(int j = 0; j < names.length - 1; j++)
        {
            for(int i = 0; i < names.length - 1; i++)
            {
                if(marks[i] >  marks[i + 1] )
                {
                    temp = marks[i];
                    marks[i] = marks[i + 1];
                    marks[j + 1] = temp;
                }
            }
        }
    }
}
