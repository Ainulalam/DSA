import javax.swing.text.html.parser.Element;

public class LinearSearch {

    public static int LinearS(int nums[],int key){
       
        for(int i=0;i<nums.length;i++){
            if(nums[i]==key){
                return i;
            }
            
        }
        return -1;

    }

    public static void main(String[] args) {
        

        int num[]={10,20,30,40,2,201,11,34};
        int key=2;
       int element= LinearS(num,key);
       if(element==-1){
        System.out.println("Element Not Found");
       }
       else{
        System.out.println("Element Found At Index "+ element);
       }
    }
    
}