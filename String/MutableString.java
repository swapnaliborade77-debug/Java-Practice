    //In all of following example object is mutable
    //append,inser,replace,delete,reverse

import java.util.Scanner;
public class MutableString{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder sb = new StringBuilder(s);//stringBuilder obejct
        sb.append("java");
        System.out.println(sb);
        
        //hello --->1--->habello----->>>work like this insert at 1 index insert.
        sb.insert(0,"ab");
        System.out.println(sb);

        sb.replace(0, 2,"teasda");//(0 and 1)-->syntax-->obj.replace(start,end,str)-->end index is excluded
        //chra between 0 and 2 replace with teasda
        System.out.println(sb);

        sb.delete(1,3);  //syntax-->obj.delete(start,end)-->end index excluded
        System.out.println(sb);

        //string result = sb.toString(); -->build in fun in java used to convert every single object to string 
                        //|
                        //V
        //even though user defined class also be converted into string
        
    }
}