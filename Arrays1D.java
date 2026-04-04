//Array:-container that holds a fixed number of values of single type in variable
//contiguous memory locations
//Accessed value with the help of index(starting 0 to n-1)
//Arrays in ajava are dynamically allocated
//length of the array calculated using.length

//syntax:- datatype array_name = new datatype[array_size];

//new -->keyword is used to allocate the memmory

import java.util.Arrays;
import java.util.Scanner;
public class Arrays1D{
    public static void main(String[] args){
        
        
        /*int[] arr = new int[5];//declare array
        Scanner sc = new Scanner(System.in);
        int len = arr.length;
        for (int index =0;index<len;index++){
            arr[index] = sc.nextInt();

        }
        // binary search //array is sorted

        Array.sort(arr);//ascending order
        System.out.println(x:"Enter the number to be searched:");
        int key = sc.nextInt();

        System.out.println(Arrays.binarySearch(arr,key));*/

        

        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i =0;i<5;i++){
            arr[i] = sc.nextInt();
        }
        for(int i :arr){                //enhance for loop run n times
            System.out.println("array:{"+i+"}");
        }
    
        /*compare arrays :-
        int[] arr1={1,2,3,4,5,6};
        int[] arr2={1,2,3,4,5,6};
        System.out.println(Arrays.equals(arr1,arr2));

        int[] arr = new int[4]; //declare array
        Arrays.fill(arr,5);
        for(int index=0;index <4;index ++){
             System.out.println(arr[index]+" ");
        }


        //using for each loop---->advanced form
        for(Integer value:arr){
            System.out.println(value);
        }*/
}
}
















  