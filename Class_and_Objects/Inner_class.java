class OuterClass{
    void print(){
        System.out.println("Outer class");
    }
}

class Inner_class{ //main class
    static OuterClass out = new OuterClass(){
        void print(){
            super.print();
            System.out.println("Anonyous class");

            
    }
};

public static void main(String[] args){
    out.print();

}
}
