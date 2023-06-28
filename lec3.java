import java.util.*;
public class lec3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age >= 18){
            System.out.println("Can vote");
        }
        else{
            System.out.println("Cannot vote");
        }

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a>=b && a>=c ){
            System.out.println("A is greater than B");
        }
        else if(b>=c){
            System.out.println("B is greater than A");
        }
        else{
            System.out.println("C is greater than A");
        }
        
        String type = ((a%2)==0)?"even":"false";
        System.out.println(type);
        int marks = sc.nextInt();
        String status = (marks>=33)?"pass":"fail";
        System.out.println(status);
        int num = sc.nextInt();
        switch(num) {


            

        }
         
        



    }
}