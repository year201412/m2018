package sw.melody.algorithm.leetcode1.array;

/***
 * Created by ping on 2018/5/25
 *
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 * 示例:
 * 输入: [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 * 说明:
 * 必须在原数组上操作，不能拷贝额外的数组。
 * 尽量减少操作次数。
 */
public class ArrayMoveZeroes {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1};
        moveZeroes(nums);
        for (int n : nums) {
            System.out.println(n);
        }
    }

    static void moveZeroes(int[] nums) {
        int length = nums.length;
        for (int i=length-1; i>=0; i++) {
            if (nums[i] != 0) {
                for (int j=i; j<length-1; j++) {
                    nums[j] = nums[j+1];
                }
                nums[length - 1] = 0;
            }
        }
    }
}
