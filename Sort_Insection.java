public class Sort_Insection {
    public static void main(String[] args) {
         int arr[]={6,12,3,7,2,10,1,5,4};
        for(int i=1;i<arr.length;i++){
            int key=arr[i];
            int j=i-1;
            while (j>=0 && arr[j]>key ) {
                arr[j+1]=arr[j];
                j--;                
            }
            arr[j+1]=key;
        }
        for(int nums :arr){
            System.out.println(nums);
        }
    }
     
}