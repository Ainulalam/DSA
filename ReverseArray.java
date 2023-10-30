public class ReverseArray {
    
    public static void ReverseArr(int arr[]){
        int temp;
        int len =arr.length/2;
        int j=arr.length-1;
        for(int i=0;i<len;i++){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print("  "+arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60};

         ReverseArr(arr);
    }
}
