public class practise{
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6};
        rotate(arr,2);

    }
    public static void rotate(int arr[],int r){
        reverse(arr,0,arr.length-1);
        for(int i=0;i<arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void reverse(int arr[],int li,int ri){
        while(li<ri){
            int temp = arr[li];
            arr[li]=arr[ri];
            arr[ri]=temp;
            li++;
            ri--;
        }
    }
}