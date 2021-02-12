//introduction code to 2d array
//print the 2d array by getting input from user

import java.util.Scanner;
public class Array2d{
	public static void print(int arr[][]){
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt(); //no. of rows
		int m = s.nextInt(); //no. of cols
		int arr[][]=new int[n][m];
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				arr[i][j]=s.nextInt();
			}
		}
	//calling print method to print the 2d array
		print(arr);
	}
}