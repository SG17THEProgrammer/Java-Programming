package leetcode;

import java.util.Arrays;

class problem_33 {

    public static int search(int[] nums, int target) {
        Arrays.sort(nums);
        int low =1;
        int high = nums.length ;
        int mid = ( high + low )/2 ;

        while(low<high){
        if (mid == target )
            return mid;
        
        else if (mid>target)
            high = mid -1 ;

        else 
            low = mid+1;

    }
    return mid ;
}
public static void main(String[] args) {
    int nums[] = {2,4,3,5};
    System.out.println(search(nums, 3));
}
}