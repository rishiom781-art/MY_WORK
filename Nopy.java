import java.util.*;
public class Nopy
{
    public static void main(String[] args) {
        
        double num1,num2,result=0;
        char operator;
        Scanner sc=new Scanner(System.in);
        num1=sc.nextDouble();
        num2=sc.nextDouble();
        operator=sc.next().charAt(0);
        switch(operator){
            case '+':

                result=num1+num2;
                System.out.println(result);
                
                


                break;
            case '-':
                result=num1-num2;
                System.out.println(result);
                break;
            case '*':
                result=num1*num2;
                System.out.println(result);
                break;
            case '/':
                result=num1/num2;
                System.out.println(result);
                break;
            case '%':
                result=num1%num2;
                System.out.println(result);
                break;
            default:
                System.out.println("INVALID");
                break;
            
            

            

        }
        





    }

    
}
