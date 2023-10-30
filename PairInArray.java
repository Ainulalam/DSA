public class PairInArray {

    public static void pairs(int nums[]){


        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){

                System.out.print("( " + nums[i]+ ","+nums[j]+" )" );
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        int arr []={10,20,30,40,50,60};

        System.out.println(" pair of [10,20,30,40,50,60]");
         pairs(arr);
    }
}
