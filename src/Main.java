import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);

    static void mergeSortedArray() {
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

    static void twoSum() {

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        TwoSum twoSum = new TwoSum();
        int[] res = twoSum.twoSum(nums, target);

        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i] + " ");
        }
    }

    static void removeDuplicates() {
        int[] res = {1, 2, 3};
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        int ans = removeDuplicates.removeDuplicates(res);
        System.out.println(ans);
        for (int i = 0; i < ans; i++) {
            System.out.print(res[i] + " ");
        }

    }

    static void removeElement() {
        int[] res = {2};
        RemoveElement removeElement = new RemoveElement();
        int ans = removeElement.removeElement(res, 3);
        System.out.println(ans);
        for (int i = 0; i < ans; i++) {
            System.out.print(res[i] + " ");
        }
    }

    static void majorityElement() {
        int[] res = {2,2,1,1,1,1,1};
        MajorityElement majorityElement = new MajorityElement();
        int ans = majorityElement.majorityElement(res);
        System.out.println(ans);
    }

    static void bestTimeToBuyAndSellStock(){
        int[] res = {7,1,5,3,6,4};
        BestTimeToBuyAndSellStock bestTimeToBuyAndSellStock=new BestTimeToBuyAndSellStock();
        int ans=bestTimeToBuyAndSellStock.maxProfit(res);
        System.out.println(ans);
    }

    static void  romanToInteger(){
        RomanToInteger romanToInteger=new RomanToInteger();
        System.out.println(romanToInteger.romanToInt("MCDLXXVI"));
    }

    static void lengthOfLastWord(){
        LengthOfLastWord lengthOfLastWord =new LengthOfLastWord();
        System.out.println(lengthOfLastWord.lengthOfLastWord("Hello World"));
    }

    static void longestCommonPrefix(){
        String[] strs = {"aaa","aa","aaa"};
        LongestCommonPrefix longestCommonPrefix=new LongestCommonPrefix();
        System.out.println(longestCommonPrefix.longestCommonPrefix(strs));
    }

    static void findIndexOfFirstOccurrence(){
        FindIndexOfFirstOccurrence findIndexOfFirstOccurrence=new FindIndexOfFirstOccurrence();
        System.out.println(findIndexOfFirstOccurrence.strStr("abc","c"));
    }

    static void validPalindrome(){
        ValidPalindrome validPalindrome=new ValidPalindrome();
        System.out.println(validPalindrome.isPalindrome("A man, a plan, a canal: Panama"));
    }

    static void isSubsequence(){
        IsSubsequence isSubsequence=new IsSubsequence();
        System.out.println(isSubsequence.isSubsequence("axc","ahbgdc"));
    }

    static void ransomNote() {
        RansomNote ransomNote = new RansomNote();
        System.out.println(ransomNote.canConstruct("aaac", "aabca"));
    }

    static void isomorphicStrings() {
        IsomorphicStrings isomorphicStrings = new IsomorphicStrings();
        System.out.println(isomorphicStrings.isIsomorphic("paper", "title"));
    }

    static void wordPattern() {
        WordPattern wordPattern = new WordPattern();
        System.out.println(wordPattern.wordPattern("abba", "dog cat cat dog"));
    }

    static void validAnagram() {
        ValidAnagram validAnagram = new ValidAnagram();
        System.out.println(validAnagram.isAnagram("rat", "car"));
    }

    static void happyNumber() {
        HappyNumber happyNumber = new HappyNumber();
        System.out.println(happyNumber.isHappy(1));
    }

    static void containsDuplicateII() {
        int[] res = {1,2,3,1,2,3};
        ContainsDuplicateII containsDuplicateII=new ContainsDuplicateII();
        System.out.println(containsDuplicateII.containsNearbyDuplicate(res,2));
        System.out.println(containsDuplicateII.containsNearbyDuplicateMoreOptimize(res,2));
    }

    public static void main(String[] args) {
        containsDuplicateII();
    }
}