import java.util.Scanner;

public class areaoftriangle {

        public static void main(String args[])
        {

            Scanner triangle= new Scanner(System.in);

            System.out.println("Enter the width of the Triangle:");
            int a= triangle.nextInt();

            System.out.println("Enter the height of the Triangle:");
            int b= triangle.nextInt();

            int area=(a*b)/2;
            System.out.println("Area of Triangle is: " + area);
        }
    }

