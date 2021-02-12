//code to print wave pattern of 2d arary martic
//input --> 1 2 3   output--> 1 4 5 2 3 6
//          4 5 6

import java.util.Scanner;
public class WavePattern{
	
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

		for(int j=0;j<m;j++){
			if(j%2==0){
				for(int i=0;i<n;i++){
					System.out.print(arr[i][j]+" ");
				}
			}else{
				for(int k=n-1;k>=0;k--){
					System.out.print(arr[k][j]+" ");
				}
			}
		}

		
	}
	
}