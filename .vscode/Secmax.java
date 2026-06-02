import java.util.*;
public class Secmax {
    public static void main(String[] args) 
    {
        int arr[]={1,3,7,8,15,17};
        int target=7;
        for(int i=0;i<arr.length;i++)
        {
            if(target==arr[i])
            {
                System.out.println(i);
                break;
            }
            else if(arr[i]>target){
                
                System.out.println(i);
                break;
            }
            else{
                System.out.println(arr.length);
                break;
            }
        }
        

    }
    
}
 