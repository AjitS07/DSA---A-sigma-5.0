
import java.util.Scanner;

//Entercostof3itemsfromtheuser(usingfloatdatatype)-apencil,apenandan eraser. 
//You have to output the total cost of the items back to the user as their bill.
//(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced proble
public  class  total{

public static void main(String[] args) {
    Scanner ac= new Scanner(System.in);
    System.out.println("Enter a cost of pencil:- ");
    float pencil = ac.nextFloat();
    System.out.println("Enter a cost of Eraser:-");
    float eraser = ac.nextFloat();
    System.err.println("Enter a cost of Pen ");
    float pen = ac.nextFloat();
    Float total =  pencil + eraser + pen;
    System.err.println("Total cost of 3 Items :- "+total );

    float Totalcost = total+(0.18f *total);
    System.err.println("Total cost with 18% of 3 Items :- "+Totalcost );






}

}
