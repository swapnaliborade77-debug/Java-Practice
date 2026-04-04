interface ZeroParam {
    void sayHello();
}

interface OneParam {
    void print(String s);
}

interface TwoParam {
    void add(int a, int b);
}

class Lambda1 {
    public static void main(String[] args) {

        // lambda expression with zero parameter
        ZeroParam obj1 = () -> System.out.println("Hello, World!");
        obj1.sayHello();

        // with type
        OneParam obj2 = (String s) -> System.out.println(s);
        obj2.print("Hello");

        // without type
        OneParam obj3 = s -> System.out.println(s);
        obj3.print("Hi");

        // two parameters
        TwoParam obj4 = (s1, s2) -> System.out.println(s1 + s2);
        obj4.add(10, 20);
    }
}