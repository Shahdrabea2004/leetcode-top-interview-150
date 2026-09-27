import java.util.Scanner;

public class Main {
<<<<<<< HEAD
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

=======
    static Scanner input = new Scanner(System.in);
    static void mergeSortedArray(){
>>>>>>> 1a871f4 (feat: add Two Sum solution)
        // nums1
        int m = input.nextInt();
        int[] nums1 = new int[m];

        for (int i = 0; i < m; i++) {
            nums1[i] = input.nextInt();
        }

        // n
        int n = input.nextInt();

        // nums2
        int[] nums2 = new int[n];

        for (int i = 0; i < n; i++) {
            nums2[i] = input.nextInt();
        }

        // Create nums1 with size m + n
        int[] newNums1 = new int[m + n];

        for (int i = 0; i < m; i++) {
            newNums1[i] = nums1[i];
        }

        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        mergeSortedArray.merge(newNums1, m, nums2, n);
    }
<<<<<<< HEAD
=======

    static void twoSum(){
        int[]nums={2,7,11,15};
        int target=9;
        TwoSum twoSum=new TwoSum();
        int[]res=twoSum.twoSum(nums,target);
        for (int i=0;i<res.length;i++){
            System.out.println(res[i]+" ");
        }
    }
    public static void main(String[] args) {
        twoSum();
    }
>>>>>>> 1a871f4 (feat: add Two Sum solution)
}
