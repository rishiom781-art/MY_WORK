import java.util.*;
public class Profile
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int us=sc.nextInt();
        int ps=sc.nextInt();
        int keys=sc.nextInt();
        if(us==ps && ps==keys)
        {
            System.out.println("access");
        }
        else if(us==keys || us==ps || keys==ps)
        {
            System.out.println("forget");
        }
        else
        {
            System.out.println("DENIED");
        }
        

    }
}