//method overriding is the example of the run time polymorphism.

class parent{
    public void display(){
        System.out.println("This is parent class");
    }
}

class child extends parent{
    public void display(){
        System.out.println("This is child class");
    }
}
class run_time{
    public static void main(String[] main){
        parent p =new parent();
        p.display();

        parent c = new child();
        c.display();
    }
}