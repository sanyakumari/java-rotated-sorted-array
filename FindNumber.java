public class FindNumber {
    static int search(int[] a, int target){
        int st = 0 ,end = a.length - 1;
        while(st <= end){
           int  mid = st + (end - st)/2;
           if(a[mid] == target){
            return mid;
           }
           else if(a[mid] < a[end]){  //mid to end is sorted
             if(target > a[mid] && target <= a[end]){
                st=mid +1;
             }else{
                end = mid -1;
             }
           }else{ //start to mid sorted
             if(target >= a[st] && target < a[mid]){
                end = mid - 1;
             }else{
                st = mid + 1;
             }
           }
        }
        return -1;
    }
    // contains duplicate elements
    static int search_(int[] a, int target){
        int st = 0 ,end = a.length - 1;
        while(st <= end){
           int  mid = st + (end - st)/2;
           if(a[mid] == target){
            return mid;
           }
           else if(a[st] == a[mid] && a[end] == a[mid]){
            st++;
            end--;
           }
           else if(a[mid] <= a[end]){  //mid to end is sorted
             if(target > a[mid] && target <= a[end]){
                st=mid +1;
             }else{
                end = mid -1;
             }
           }else{ //start to mid sorted
             if(target >= a[st] && target < a[mid]){
                end = mid - 1;
             }else{
                st = mid + 1;
             }
           }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] a = {3,4,5,1,2};
        // int[] a = {1,1,1,2,2,3,1,1}
        int target = 4;
        System.out.println(search(a,target));
        
    }
    
}
