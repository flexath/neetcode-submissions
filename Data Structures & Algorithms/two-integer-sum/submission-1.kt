class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val result = hashMapOf<Int,Int>()
        for(i in 0..nums.size-1) {
            val num = target-nums[i]
            if(num in result) {
                return intArrayOf(result[num] ?: -1,i)
            }
            result[nums[i]] = i
        }
        return intArrayOf()
    }
}