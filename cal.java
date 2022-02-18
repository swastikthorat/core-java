import java.util.*;
public class cal {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int button=sc.nextInt();
        int multy;
        int add;
        int sub;
        int div;

        switch(button){
            case 1: 
            multy= a*b;
            System.out.println("Answer:"+multy);
            break;
            case 2: 
            add= a+b;
            System.out.println("Answer:"+add);
            break;
            case 3:
            sub = a-b;
            System.out.println("Answer:"+sub);
            break;
            case 4:
            div=a/b;
            System.out.println("Answer:"+div);
            break;

        }
        


    }
    
}
