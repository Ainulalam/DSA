public class MaxSubArray {

    public static void MaxSub(int arr[]){
        int maxsub=Integer.MIN_VALUE;
        int prefix []=new int[arr.length];
        int currentSum=0,start,end;

        // Calculate Pefrix
        for(int i= 1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        
        for(int i=0;i<arr.length;i++){
            start=i;
            for(int j=i;j<arr.length;j++){
                // Prefix method
                end=j;
                currentSum=start==0?prefix[end]:prefix[end]-prefix[start-1];
                
                // MaxArray
                if(currentSum>maxsub){
                    maxsub=currentSum;
                }
                

            }
        }
        System.out.println(" Maximum Sub array is "+ maxsub);    // Maximum of Sub Array
    }
    public static void main(String[] args) {
        
        int arr[]={2,4,8,10};

        MaxSub(arr);
    }
}
