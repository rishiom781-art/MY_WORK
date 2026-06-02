import java.util.*;
public class sortarraycheck 
{ 
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int arr[]=new int[n];
        
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            
        }
        int arr2[]=Arrays.copyOf(arr, n);
        
        Arrays.sort(arr2);
        
        if(Arrays.equals(arr,arr2))
            {
            System.out.println("yes");
        }
        else
            {
            System.out.println("no");
        }

    }

}