//java program to print diagonal elements of upper triangle
//input : [[12,4],[5,7]]  output --> 12 7 4 

//import java.util.*;
import java.util.Scanner;
public class Diagonal{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[][]= new int[n][n];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=s.nextInt();
            }
        }
        for(int g=0;g<arr.length;g++){
            for(int i=0,j=g;j<arr.length;i++,j++){
                System.out.print(arr[i][j]+" ");
            }
        }
    }
}
