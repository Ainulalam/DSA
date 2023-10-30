import javax.swing.text.html.parser.Element;

public class BinarySearch {


    public static int BinaryS(int numbers[],int key){
        int low =0;
        int high=numbers.length;
        

        while(low<=high){
            int mid=(low+high)/2;

            // element found at center 
            if(numbers[mid]==key){
                return mid;
            }

            if(numbers[mid]<key) { 
                low=mid+1;           // Right side 
            }  

            if(numbers[mid]>key){
                high=mid-1;         // Left Side
            }

            mid=(low+high)/2;

        }

        return -1;
    }
    public static void main(String[] args) {
        int nums[]={10,20,30,40,50};
        int key=2;
        

        int Status=BinaryS(nums,key);

        if(Status==-1){
            System.out.println("Element Not Found");
        }else{
            System.out.println("Element Found at Index "+ Status);
        }
    }
}
