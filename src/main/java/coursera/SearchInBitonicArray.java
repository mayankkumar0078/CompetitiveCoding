package coursera;

public class SearchInBitonicArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,50,21,20,30,0,-1,-5,-10};
        System.out.println(search(arr,20,0,arr.length-1));
    }

    private static int search(int arr[],int num,int start,int end) {

        while(start<end) {
            int mid =(start+end)/2;
            if(num == arr[mid]) {
                return mid;
            }
            System.out.println("start "+start+"   end   "+end +"  mid   "+mid);
            if(arr[mid]>=arr[mid-1] && arr[mid]<=arr[mid+1]) {
                if(num>arr[mid]) {
                    start = mid+1;
                } else {
                    end =mid-1;
                }
            }else if(arr[mid]<=arr[mid-1] && arr[mid]>=arr[mid+1]) {
                if(num<arr[mid]) {
                    start = mid+1;
                } else {
                    end = mid-1;
                }
            } else if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]) {
                int index1 = search(arr,num,0,mid-1);
                int index2 = search(arr,num,mid+1,arr.length-1);
                System.out.println("came here");
                if(index1 !=-1) {
                    return index1;
                }else if(index2 !=-1) {
                    return index2;
                }
            }
        }
        return -1;
    }
}
