class Toyota
{
    String model;
    String name;
    int price;
    int seat;
public void prt()
{
    System.out.println(model);
    System.out.println(name);
    System.out.println(price);
} 
}
class Demo{
    public static void main(String[] args) {
        Toyota f1=new Toyota();
        f1.model="Fortuner";
        f1.name="tony";
        f1.price=4500000;
        f1.seat=5;
        f1.prt();
        Toyota f2=new Toyota();
        f2.model="Helix";
        f2.name="Captain america";
        f2.price=10000000;
        f2.seat=7;
        f2.prt()
        
    }
}