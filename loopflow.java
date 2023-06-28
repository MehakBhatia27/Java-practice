import java.util.*;
public class loopflow{
    public static void main(String args[]){
        //while loop
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0 ;
        int i = 1;
        while (i <= n){
            sum = sum + i ;
            i += 1 ;
        }
        System.out.println(sum);


        //for loop

        for ( int a = 1 ; a <= 10 ; a++ ){
            System.out.println("Hello world");
        }



    }
}