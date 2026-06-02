/*import java.util.*;
public class Remove {
    public static void main(String[] args) {
        int[] arr= {1,2,3,2,5,5};
        Arrays.sort(arr);
        int n=arr.length;
        int j=0;
        for(int i=0;i<n-1;i++){
            if(arr[i]!=arr[j]){
                j++;
                arr[j]=arr[i];
            }
        }
        for(int i=0;i<=j;i++){
            System.out.print(arr[i]);
        }
    }
    
}

 */
import java.util.*;
public class Remove{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=arr[j])
            {
                j++;
                arr[j]=arr[i];
            }

            
        }
        for(int i=0;i<=j;i++){
            System.out.print(arr[i]+" ");
        }

    }
}