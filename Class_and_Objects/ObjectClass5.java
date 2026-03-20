/*finalize() method:- 
-It is called by the  garbage collector.
Just before an object is destroyed (removd from memeory) 
Used to erform cleanup activities such as closing file,releasing daatabse connections,freeing resources.
finalize method called only once even though object is allow to called it multiple times.

Syntax:- protected void finalize() throws Throwable{
//cleanup code
         }*/


class ObjectClass5{

    
    public static void main(String[] args){
        ObjectClass5 obj = new ObjectClass5();
        System.out.println(obj.hashCode());
        obj = null; //make object eligible for GC
        System.gc(); //request garbage collection
        System.out.println("end");
    }

    protected void finalize(){
    System.out.println("Finalize");

}
}



