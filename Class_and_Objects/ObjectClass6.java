/*clone() method:-
It return the new object as exactly same as the previous old object*/

import java.util.Date;
class ObjectClass6{
    public static void main(String[] args){
        Date date = new Date();
        System.out.println(date.toString());
        Date date2 = (Date)date.clone();        //take the cloned object and treat it as a date object.
        System.out.println(date2.toString());
    }
}