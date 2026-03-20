/*getClass() method:- 
Return the class object of the this object.
It is used to get the runtime class (actual class)  of an object.*/

class Object_Class4{
    public static void main(String[] args){
        Object obj = new String("Neo");//object for object class and passing a string value
        Class c = obj.getClass();//class object and stored returned value in class object.
        System.out.println(c.getClass());

    }
}