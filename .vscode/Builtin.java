import java.util.*;
public class Builtin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double n=sc.nextDouble();
        System.out.println(Math.sqrt(n));// square root
        System.out.println(Math.cbrt(n));// cube root
        System.out.println(Math.PI);//pi ki value
        System.out.println(Math.abs(-8));// minus haat jayega
        System.out.println(Math.floor(-6.8));//isse just chota no point mei
        System.out.println(Math.floor(7.8));//isse just chota no point mei
        System.out.println(Math.ceil(6.00001));//iska just ek bada no
        System.out.println(Math.ceil(-6.00001));// iska point ke age vala no point mei
        //sbse jyada use hone vala function
        System.out.println(Math.min(3,8));// dono ka minimum
        System.out.println(Math.max(3,8));//dono ka maximum
        System.out.println(Math.round(5.099920));
        System.out.println(Math.round(5.566));


        // 3 no ka maximum
        //System.out.println(Math.max((a,b),c));
        System.out.println(Math.max(Math.max(Math.max(5,4),3),9));
    }
    
}
