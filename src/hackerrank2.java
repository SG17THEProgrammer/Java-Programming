
// import java.util.*;

// public class hackerrank2 {
//     public static boolean hasZeroSumSubarray(int[] nums) {
//         if (nums == null || nums.length == 0) {
//             return false;
//       }
       
//         Set<Integer> prefixSums = new HashSet<>();
//         int prefixSum = 0;
        
//         for (int i = 0; i < nums.length; i++) {
//             prefixSum += nums[i];
//             if (prefixSum == 0 || prefixSums.contains(prefixSum)) {
//                 return true;
//             }
//             prefixSums.add(prefixSum);
//         }
//         return false;
//     }
 
//    public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int n = scanner.nextInt();
//         int[] nums = new int[n];
//         for (int i = 0; i < n; i++) {
//             nums[i] = scanner.nextInt();
//         }
//         System.out.println(hasZeroSumSubarray(nums) ? 1: 0);
// }
// }

