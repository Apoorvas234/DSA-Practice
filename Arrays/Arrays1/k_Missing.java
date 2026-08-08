class solution {
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : nums) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }
}

public class k_Missing {
    public static void main(String[] args) {
        int[] nums = {3, 0, 1};
        int missing = solution.missingNumber(nums);
        System.out.println("Missing number: " + missing);
    }
}