package Calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int a1,a2,i,b;
        System.out.println("Enter the numbers: ");
        Scanner sc = new Scanner(System.in);
        a1 = sc.nextInt();
        a2 = sc.nextInt();
        System.out.println("Select operation: ");
        i= sc.nextInt();
        if (i==1)
        {
            b=a1+a2;
            System.out.println("Addition: " + b);
        }        else if (i==2)
        {
            b=a1-a2;
            System.out.println("Subtraction: " + b);
        }
        else if (i==3)
        {
            b=a1*a2;
            System.out.println("Multiplication: " + b);
        }
        else
        {
            b=a1/a2;
            System.out.println("Division: " + b);
        }
    }
}
