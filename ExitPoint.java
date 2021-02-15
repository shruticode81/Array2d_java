// code to find a exit point in a 2d array where it's consists of only 0's & 1's
//0 0 1 0 ---> input array  output(0,0)
//0 0 0 1 
//0 0 0 1
//1 0 1 0
import java.util.Scanner;
public class ExitPoint{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt(); //no. of rows
		int m = s.nextInt(); //no. of cols
		int arr[][] = new int[n][m];
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				arr[i][j]=s.nextInt();
			}
		}

		int dir = 0;
		int i=0;
		int j=0;
		while(true){

			dir = (dir+arr[i][j])%4;
			if(dir == 0){
				j++;
			}
			else if(dir == 1){
				i++;
			}
			else if(dir==2){
				j--;
			}
			else if(dir == 3){
				i--;
			}

			if(i<0){
				i++;
				break;
			}
			else if(j<0){
				j++;
				break;

			}
			else if(i==arr.length){
				i--;
				break;
			}
			else if(j==arr[0].length){
				j--;
				break;
			}
		}
		System.out.println(i);
		System.out.println(j);
	}
} 