//2D array:-
//syntax:- datatype array_name[][] = new datatype[row_size][column_size];
//Drawback--->array size is fixed-->this can be overome by using collection.
import java.util.Scanner;
import java.util.Arrays;
public class Arrays2D{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int rows=sc.nextInt();
        int cols = sc.nextInt();
        int arr[][] = new int[rows][cols]; //declare array 
        for(int i = 0; i<rows; i++){
            for(int j=0;j<cols; j++){
                arr[i][j] = sc.nextInt();

            }
        } 
        for(int i = 0;i<rows;i++){
            for(int j =0;j<cols;j++){
                System.out.println(arr[i][j]);
            }
        } 

    }
}