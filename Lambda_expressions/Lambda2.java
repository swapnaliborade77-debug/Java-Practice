class Lambda2{
    final static String s1 = "Hello!";
    public static void main(String[] args){
       // System.out.println(s1);
       Greeting obj = meassage ->System.out.println(s1 +" " + meassage);
       obj.message("Lambda");
    }

    interface Greeting{
        void message(String message);
    }
}