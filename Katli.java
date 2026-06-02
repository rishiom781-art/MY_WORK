import java.util.*;

public class Katli 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        
        String s=sc.nextLine();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch>=97)
                {

                    ch=(char)(ch-32);
                    System.out.print(ch);
                
                }
            else
                {
                    ch=(char)(ch+32);
                    System.out.print(ch);
                }
        }
    }
}