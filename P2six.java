import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int fact=1;
        do
        {
            fact=fact*n;
            n=n-1;
        }
        while(n>0);
        System.out.println(fact);
    }
}