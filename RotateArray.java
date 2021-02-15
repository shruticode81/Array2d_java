//code to rotate the 2d arary by 90 degree
import java.util.Scanner;
public class RotateArray{
    public static void print(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int arr[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=s.nextInt();
            }
        }
        //transpose the input array
        //int arr1[][] = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=i;j<m;j++){
               // arr1[j][i]=arr[i][j];
               int temp = arr[i][j];
               arr[i][j]=arr[j][i];
               arr[j][i]=temp;
            }
        } 

        for(int i=0;i<n;i++){
            int li=0;
            int ri=arr[i].length-1;
            while(li<ri){
               int temp=arr[i][li];
                arr[i][li] = arr[i][ri];
                arr[i][ri]=temp;
                li++;
                ri--;
            }
        }

        print(arr);
    }
}