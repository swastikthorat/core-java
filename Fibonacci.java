import java.util.*;
public class Fibonacci {
    public static void main(String args[]){
        int firstTerm=0,secondTerm=1;
    Scanner sc=new Scanner (System.in);
    int n=sc.nextInt();
    System.out.println("Fibonacci series upto"+n+":");
    while(firstTerm<=n){
        System.out.print(firstTerm+",");
        int nextTerm=firstTerm+secondTerm;
        firstTerm=secondTerm;
        secondTerm=nextTerm;
    }

}
    
}
