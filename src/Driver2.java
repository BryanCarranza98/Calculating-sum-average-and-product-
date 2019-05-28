import java.io.File;
import java.util.Scanner;

public class Driver2
{
    public static void main(String[] args) throws Exception
    {
        Scanner fin = new Scanner(new File("number.txt"));
        int count= 0;
        double numbers = 0.0;

        double sum=0.0;
        double average = 0.0;
        double product = 1;


        count = fin.nextInt(); // knowing the numbers of numbers
        System.out.println(String.format("The count is: %d", count));


        for (int i=0; i<count; i++)
        {

            numbers= fin.nextDouble();
            System.out.println(String.format("The # entered is: %2f", numbers));


        }

        sum=fin.nextDouble(); // knowing the sum
        System.out.println(String.format("The Sum number: %2f", sum)); //outputting the message

        average=fin.nextDouble(); // knowing the average
        System.out.println(String.format("The Average number: %2f", average));

        product=fin.nextDouble();
        System.out.println(String.format("The Product number: %2f", product));



        fin.close();
    }


}

