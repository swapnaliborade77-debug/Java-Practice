//On compile time polymorphism we have same function but different number of parameters.

class Adder{
    public int add(int a,int b){
        return a + b;
    }


public long add(long a, long b){
        return a+b;
    }
}
class compile_time{
public static void main(String[] args){
    Adder adder = new Adder();
    System.out.println(adder.add(5,10));
    System.out.println(adder.add(5L,10L));
    }
}