//Q1 in a program , input 3 number : A,B and C . you have to output the average of these 3 numbers
import java.util.*;
public class Average{
    public static void main (String[] args){
        Scanner ac= new Scanner(System.in);
        System.out.println("Enter the Value of A : -");
        int a = ac.nextInt();
       
        System.out.println("Enter the Value of B : -");
        int b = ac.nextInt();
         System.out.println("Enter the Value of C : -");
        int c = ac.nextInt();

        int d = ((a+b+c )/3);
        System.out.println("The Average of A,B,C  is :- " +d);


}

}