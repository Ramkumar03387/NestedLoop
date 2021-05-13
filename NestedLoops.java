import java.util.*;  

public class NestedLoops
{
public static void main(String args[])
{
NestedLoops loop = new NestedLoops();
loop.run();
} 
public void run()
{
 int row = 1; 
    Scanner sc = new Scanner(System.in); 
    System.out.println("Enter no. of rows ");
    int maxRow = sc.nextInt(); 
    
    System.out.println("Enter no. of cols "); 
    int maxCol = sc.nextInt();
    
    while(row<=maxRow)
    {
    int column = 1; 
    while(column<=maxCol)
      {
        System.out.print(column+" ");
        column=column+1; 
      }
    System.out.println(); 
    row= row+1;
    }
}
}