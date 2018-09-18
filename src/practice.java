import java.util.Scanner;

public class practice {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.println("Please enter a double");
        double a= sc.nextDouble();
        System.out.println("Please enter a double");
        double b= sc.nextDouble();

        System.out.println("Please enter a float");
        float c= sc.nextFloat();
        System.out.println("Please enter a float");
        float d= sc.nextFloat();



        double area1 = a+b*2;
        float area2 = c+d*2;
        System.out.println("The result is: " + area1 + area2); //taglalap terulete


    }

}
