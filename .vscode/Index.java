import java.util.*;
public class Index {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int target=5;
        int flag=-1;
        
        int arr[]=new int[n];

        for(int i=0;i<arr.length;i++){//initialising the value to index 3
            arr[i]=sc.nextInt();

        }
        for(int i =0;i<arr.length;i++){
            if(arr[i]==target)
            {
                flag=i;
                
                
                
                
            }

           
        }
        System.out.println(flag);
        
    }
    
}
