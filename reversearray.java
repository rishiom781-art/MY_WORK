import java.util.*;
public class reversearray {
    public static void main(String[] args) {
        int arr[]={2,4,5,8,10};
        int n=arr.length;
        int first=0;
        int last=n-1;
        while(first<last){
            int temp=arr[first];
            arr[first]=arr[last];
            arr[last]=temp;
            first++;
            last--;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    

}
