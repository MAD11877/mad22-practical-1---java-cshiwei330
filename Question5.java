import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    int n;
    System.out.print("Enter a number: ");
    n = in.nextInt();

    List<Integer> list = new ArrayList<Integer>();
    for (int i = 1; i < n+1; i++)
    {
      System.out.print("Enter number " + i + " : ");
      int number = in.nextInt();
      list.add(number);
    }
    in.close();

    int maxValue = -1;
    int maxCount = 0;

    for(int j = 0; j < list.size(); j++)
    {
      int count = 0;
      for(int k = 0; k < list.size(); k++)
      {
        if (list.get(k)==list.get(j))
        {
          count++;
        } 
      }
      if(count > maxCount) 
      {
      maxValue = (int) list.get(j);
      maxCount = count;
      }
    }
    System.out.print(maxValue);
  }
}
