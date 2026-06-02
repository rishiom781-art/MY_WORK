/*import java.util.*;
public class Exam2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int smallest=arr[0];
        int largest=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]<smallest){
                smallest=arr[i];
            }
            if(arr[i]>largest)
            {
                largest=arr[i];
            }


        }
        System.out.println(smallest);
        System.out.println(largest);
    }
    
}

import java.util.*;
public class Exam2{
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int n=sc.nextInt();
          int arr[]=new int[n];
          for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
          }
          
          int smallest=arr[0];
          int largest=arr[0];
            for(int i=0;i<n;i++){
                if(arr[i]<smallest){
                    smallest=arr[i];
            }
                if(arr[i]>largest){
                    largest=arr[i];
            }
            
            

          }
          System.out.println(smallest);
          System.out.println(largest);
            
    }
}
import java.util.*;
public class Exam2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+ " ");
        

    }
}

import java.util.*;
public class Exam2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}
import java.util.*;
public class Exam2
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();

        int arr[]=new int[n];
        
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        int idx=-1;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==target)
            {
            idx=i;
            break;
                
            }
        }
        
        System.out.println(idx);
 



        
        
    }
}
import java.util.*;
public class Exam2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int even=0;
        int odd=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){

                even++;
                                
            }
            else{
                odd++;
                
            }
        }
        System.out.println(even);
        
        System.out.println(odd);
    }
}



import java.util.*;
public class Exam2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
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

  

import java.util.*;
public class Exam2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        for(int i=1;i<=20;i++){
            if(i%3==0 && i%5==0){
                System.out.println("fizbuz");
            }
            else if(i%5==0){
                System.out.println("buzz");
            }
            else if(i%3==0){
                System.out.println("fizz");
            }
            else{
                System.out.println(i);
            }
        }
    }
}*/
// Program 18: Rotate Array by k steps (right rotation)
// public class Exam2{
// public static void main(String[] args){
//   int[] arr={1,2,3,4,5,6,7};
//   int k =3;
//   reverse(arr,0,arr.length-1);
//   reverse(arr,0,k-1);
//   reverse(arr,k,arr.length-1);
//   for(int num : arr){
//     System.out.print(num);
//   }
// }
// public static void reverse(int[] arr,int start,int end){
//      while(start<end){
//       int temp =arr[start];
//       arr[start]=arr[end];
//       arr[end]=temp;
//       start++;
//       end--; 
//      }
// }
// }

public class Exam2{
    public static void main(String[] args){
         int[] arr={1,2,3,4,5,6,7};
         int n=arr.length;
         int k =3;
         reverse(arr,0,n-1);
         reverse(arr,0,k-1);
         reverse(arr,k,n-1);
         for(int i=0;i<n;i++){
            System.out.print(arr[i] +" ");
         }
    }
    public static void  reverse(int[] arr,int start,int end){
        while(start<end){
            int temp =arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}