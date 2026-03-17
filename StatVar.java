//static varibles --static--class

class XYZ{
    static int c=300; //satic var of another class we can call it with the help of only class name here also no need to create object
}
public class StatVar{
    int a = 100;//instance variable, to call instance variable we need to crate object
    static int b= 200;//static variable ,for this we need not to create object we can direcly call it
    public static void main(String args[]){

        StatVar SV = new StatVar();
        System.out.println(SV.a);

        System.out.println(b);

        System.out.println(XYZ.c);//static var of another class ,called with the help of class
        // we can also called it with by creating the object---->not required ,not recommended
         XYZ obj = new XYZ();
         System.out.println(obj.c);
    }
}