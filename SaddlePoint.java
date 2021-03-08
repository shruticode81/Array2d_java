//java program to find saddle point in 2D array 
//SaddlePoint is point where element is minimum in row and max in column
//input : [[1,2,3],[4,5,6],[7,8,9]]  output ---> 7

import java.util.Scanner;
public class SaddlePoint{
    public static void findSaddle(int arr[][]){
        //1stly we will search for minj with min element in a row then 
        //find if that particular element is max in it's coln
        for(int i=0;i<arr.length;i++){
            int svj = 0;
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]<arr[i][svj]){
                    svj = j;
                }
            }
            boolean flag=true;
            for(int k=0;k<arr.length;k++){
                if(arr[k][svj]>arr[i][svj]){
                    flag=false;
                    break;
                }
            }
            if(flag == true){
                System.out.println(arr[i][svj]);
                return;
            }
        }
        System.out.println("Invalid input");
    }
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[][] = new int[n][n];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=s.nextInt();
            }
        }

        findSaddle(arr);

    }
}