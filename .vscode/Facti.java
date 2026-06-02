import java.util.*;
public class Facti{
    public static int factorial(int n){
        int f=1;
        for(int n=1;i<=n;i++){
            f=f*i;
        }
        return f;
    }
    public static void facti(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(factorial(num));

    }
}