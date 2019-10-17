import java.util.*;
// class leastpositive1 {
//     public static void main(String[] args) {
//         int arr[] = { 0 , -1 , 2 , 4 , 5 , 1 };
//         Arrays.sort(arr);
//         for (int i = 0;i < arr.length; i++) 
//             System.out.println(arr[i]);
//         System.out.println(arr[0]+1);
//     }
// }

class leastpositive1 {
    public static void main(String[] args) {
        int nums[] = { 0 , -1 , 2 , 4 , 5 , 1 };
        // int m = firstMissingPositive(nums);
        // System.out.println(m);
        int result = 1;
        for (int i = 0;i < nums.length; i++ ) {
            if (nums[i] == result) 
                result++;
        }
        System.out.println(result);
    }
}