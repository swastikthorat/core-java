import java.util.*;
public class Factorial {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println("Entered number:"+num);
        long factorial=1;
        for(int i=1;i<=num;++i){
            factorial=factorial*i;
        }
       System.out.println("Factorial of number is:"+factorial);
    }
    
}
