import java.util.*;
public class Try { 
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        Float pencil = sc.nextFloat();
        Float pen = sc.nextFloat();
        Float eraser = sc.nextFloat();
        float sum = pencil + pen + eraser ;
        float tax = 0.18f*sum;
        float bill = sum + tax ;

        System.out.println(bill); 


         
    }

}
