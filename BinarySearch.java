public class BinarySearch {
    int Bsearch(int arr[],int left, int right, int target)
    {
        while(left<=right)
        {
            int mid=(left+right)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target)
                right=mid-1;
            else left=mid+1;
        }
        return -1;
    }


    public static void main(String[] args) {
        BinarySearch binarySearch=new BinarySearch();

        int arr[]={1,2,3,4,5,6,7,8,9,10};
        int len=arr.length;
        int target=7;
        int result=binarySearch.Bsearch(arr,0,len-1,target);
        if (result==-1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at index "+result);

    }

}


