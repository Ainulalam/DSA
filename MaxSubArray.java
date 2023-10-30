public class MaxSubArray {

    public static void MaxSub(int arr[]){
        int maxsub=Integer.MIN_VALUE;
        
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int currentSum=0;
                for(int k=i;k<=j;k++){
                    // Sum of SUB aray
                    currentSum +=arr[k];
                }
                if(maxsub<currentSum){
                    maxsub=currentSum;
                }
                System.out.println("Curent Max Sub Array "+ currentSum);   // Current Max 
            }
        }
        System.out.println(" Maximum Sub array is "+ maxsub);    // Maximum of Sub Array
    }
    public static void main(String[] args) {
        
        int arr[]={2,4,8,10};

        MaxSub(arr);
    }
}
