import java.util.Formatter;
import java.util.Scanner;

public class Driver
{
    public static void main(String[] args)     throws Exception
    {
        Scanner cin = new Scanner(System.in);
        Formatter output= new Formatter("number.txt");

        int count= 0;
        double number=0.0;

        double sum=0.0;
        double average = 0.0;
        double product = 1;




        System.out.print("How many numbers will you be inputting? ");
        count = cin.nextInt();
        output.format("%d\n", count); // how numbers they would like to input


        for ( int i=0; i<count; i++)
        {
            System.out.print(" Enter a decimal number: "); // entering the number with decimal
            number= cin.nextDouble();
            output.format("%.2f\n",number);

            sum +=number; // finding the sum
            average = sum / count; // finding the average
            product *= number; // finding the product

        }

        output.format("%.2f\n",sum); // ouputting the result
        System.out.printf("The Sum is : %.2f\n", sum);

        output.format("%.2f\n",average);
        System.out.printf("The Average is : %.2f\n", average);

        output.format("%.2f\n",product);
        System.out.printf("The product is : %.2f\n", product);



        output.close();


    }

}
