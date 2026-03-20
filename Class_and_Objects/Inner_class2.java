class OuterClass{
    
    void outerMethod(){
        final String value = "Iamneo";
        System.out.println("outer class");

        /*local inner class:-
        A local inner class is a class defined inside a method.
        Scope:only inside that class
        cannot be accessed outside the metho
         */
        class InClass{
            public void print(){
                System.out.println("Inner class "+value);
            }
        } 

        InClass in = new InnerClass();//object of the inner class,do not create obj.outside the method. 
        in.print();//access metod print()
    }
}

class Inner_class2{
    public static void main(String[] args){
        OuterClass out = new OuterClass();//object of outer object.
        out.outerMethod();
    }
}