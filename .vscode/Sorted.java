
import java.util.*;
public class Sorted {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<arr.length;i++){//initialising the value to index 3
            arr[i]=sc.nextInt();

        }
        for(int i =0;i<arr.length;i++){
            if(i%2==0)
            {
                System.out.print(arr[i] + " ");
            }
        }
    }
    
}
