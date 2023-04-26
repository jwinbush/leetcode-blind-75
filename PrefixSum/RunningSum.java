//https://youtu.be/ZoyAUCdWFFo
package PrefixSum;

public class RunningSum {
    public int[] runningSum(int[] nums) {
        int[] myArray = new int[nums.length];
        int num = 0; //starts with num = 0
        for(int i = 0; i < nums.length; i++) { //if the index is less than the amount of amount of indexes in the nums array, add the index number to index number
            num += nums[i]; //the num is added to each number in array "nums" until i is greater than nums.length
            myArray[i] = num; //each index in the array has a specific number
        }
        return myArray;
    }
}
