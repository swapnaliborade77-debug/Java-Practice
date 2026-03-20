/*Every class in java is directly or indirectly derived from the object class. 
object class has below methods 
--toString Method
--hashCode() Method
--equals(Object obj) Method
--getClass() Method
--finalize() Method
--clone() Method
--wait(),notify() notifyAll Methods
*/

//1.toString Method():-

class person{
    private String fname;
    private String lname;

    public String getFname(){ //only read value or give value
        return fname;
    }

    public void setFname(String fname){  //set value or update
        this.fname = fname;//assign the value of the parameter (fname) to the class variable
    }

    public String getLname(){  
        return lname;
    }

    public void setLname(String lname){
        this.lname = lname;
    }

    public String toString(){
        return "person [firstname=" + fname + " ,lastname=" +lname+"]";
    }
}

class ObjectClass1{
    public static void main(String[] args){
        person obj = new person();
        obj.setFname("Iam");
        obj.setLname("Neo");
        System.out.println(obj.toString());//we called tOString method externally like this

    }
}