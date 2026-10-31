class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        var i = 0
        nums.sort()

        while (i < (nums.size - 1)) {
            if (nums.get(i) == nums.get(i+1)) return true
            i++
        }
        return false
    }
}
