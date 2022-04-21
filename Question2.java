import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    /**
     * Prompts user for height and weight, calculate and print out the BMI of the user
     * 
     * Hint: in.nextDouble() to read double
     */
    double height, weight, bmi;
    Scanner in = new Scanner(System.in);
    System.out.print("Enter your height(m): ");
    height = in.nextDouble(); // Read user input

    System.out.print("Enter your weight(kg): ");
    weight = in.nextDouble(); // Read user input

    in.close();

    bmi = weight / (height*height);
    System.out.println("BMI: " + bmi);

  }
}
