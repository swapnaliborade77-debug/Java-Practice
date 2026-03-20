/*hashCode() method:-

 It returns distinct integer for distinct object.
 It convert internal address of the object to an integer by using an algorithm.
 It uses a languages like c or  c++   to find the address of the object which is impossible in java.
It returns the hash value that is easy to search the object.
Java virtual machine uses this method while saving object related to hashCode() data structure like hashSet,hashMap,hashTable etc.
Searching becomes very easy due to hashCode().

*/


class Student{
    static int last_roll = 100;
    int roll_no;
    Student(){
        roll_no = last_roll;
        last_roll++;
    }
    public int hashCode(){
        return roll_no;
    }
}

class ObjectClass2{
    public static void main(String[] args){
        Student obj = new Student();
        System.out.println(obj);
        System.out.println(obj.toString());
    }
}