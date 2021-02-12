//code to multiple two matrixs and  print the 2d array
import java.util.Scanner;

public class Multiple2d{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int r1 = s.nextInt();
		int c1 = s.nextInt();
		int one[][]= new int[r1][c1];
		for(int i=0;i<one.length;i++){
			for(int j=0;j<one[0].length;j++){
				one[i][j]=s.nextInt();
			}
		}
		int r2 = s.nextInt();
		int c2 = s.nextInt();
		int two[][]= new int[r2][c2];
		for(int i=0;i<two.length;i++){
			for(int j=0;j<two[0].length;j++){
				two[i][j]=s.nextInt();
			}
		}

		if(c1!=r2){
			System.out.println("Invalid input");
			return;
		}
			int product[][]=new int[r1][c2];
			for(int i=0;i<product.length;i++){
				for(int j=0;j<product[0].length;j++){
					for(int k=0;k<c1;k++){
						product[i][j]+=one[i][k]*two[k][j];
					}
				}
			}
		

		for(int i=0;i<product.length;i++){
			for(int j=0;j<product[0].length;j++){
				System.out.print(product[i][j]+" ");
			}
		}
		System.out.println();
	}
}