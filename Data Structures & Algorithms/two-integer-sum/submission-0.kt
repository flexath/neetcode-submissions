class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val result = mutableListOf<Int>()
        for(i in 0..nums.size-2) {
            for(j in i+1..nums.size-1) {
                if(nums[i]+nums[j] == target) {
                    result.add(i)
                    result.add(j)
                    break
                }
            }
        }
        return result.toIntArray()
    }
}