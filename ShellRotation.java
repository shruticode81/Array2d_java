// given a 2d array we will be given s=2 ,we will fill the oned array with s=2 and rotate the oned array with the given r 
//then fill the oned array elements back to 2d array
import java.util.Scanner;
public class ShellRotation{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(); // no. of rows
        int m = s.nextInt(); // no. of cols
        int arr[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=s.nextInt();
            }
        }
        int shell = s.nextInt();
        int r = s.nextInt();
        int oned[]=filloned(arr,shell);
        rotate(oned,r);
        fillarray(arr,oned,shell);
        display(arr);

    }
    public static void display(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int[] filloned(int arr[][],int s){
        int minr = s-1;
        int minc = s-1;
        int maxr = arr.length-s;
        int maxc = arr[0].length-s;
        //int size = 2*(maxr-minr+1)+2*(maxc-minc+1)-4;
        int size = 2*(maxr-minr+maxc-minc);
        int oned[] = new int[size];
        int k=0;
        for(int i=minr,  j=minc;i<=maxr;i++ ){
            oned[k]=arr[i][j];
            k++;

        }
        for(int i=maxr,j=minc+1;j<=maxc;j++){
            oned[k]=arr[i][j];
            k++;
        }
        for(int i=maxr-1, j=maxc;i>=minr;i--){
            oned[k]=arr[i][j];
            k++;
        }
        for(int i=minr, j=maxc-1;j>=minc+1;j--){
            oned[k]=arr[i][j];
            k++;
        }
        return oned;
    }
    public static void rotate(int oned[],int r){
        r = r%oned.length;
        if(r<0){
            r=r+oned.length;
        }
        reverse(oned,0,oned.length-r-1);
        reverse(oned,oned.length-r,oned.length-1);
        reverse(oned,0,oned.length-1);
    }
    public static void reverse(int oned[],int li,int ri){
        while(li<ri){
            int temp = oned[li];
            oned[li]=oned[ri];
            oned[ri]=temp;
            li++;
            ri--;
        }
    }
    public static void fillarray(int arr[][],int oned[],int s){
        int minr = s-1;
        int minc = s-1;
        int maxr = arr.length-s;
        int maxc = arr[0].length-s;
        // int size = 2*(maxr-minr+1)+2*(maxc-minc+1)-4;
        // int oned[] = new int[size];
        int k=0;
        for(int i=minr,j=minc;i<=maxr;i++ ){
           // oned[k]=arr[i][j];
           arr[i][j]=oned[k];
            k++;

        }
        for(int i=maxr,j=minc+1;j<=maxc;j++){
            arr[i][j]=oned[k];
            k++;
        }
        for(int i=maxr-1, j=maxc;i>=minr;i--){
            //oned[k]=arr[i][j];
            arr[i][j]=oned[k];
            k++;
        }
        for(int i=minr, j=maxc-1;j>=minc+1;j--){
           // oned[k]=arr[i][j];
           arr[i][j]=oned[k];
            k++;
        }
    }

}