class Solution {
    

    fun twoSum(nums: IntArray, target: Int): IntArray {
    val hash = HashMap<Int, Int>()

        for (i in 0 until nums.size) {
            val diff = target - nums[i]

            if (hash.get(diff) != null) {
                return intArrayOf(hash[diff]!!, i)
            } else {
                hash[nums[i]] = i
            }
            
        }
    
    return intArrayOf()
    }
}
