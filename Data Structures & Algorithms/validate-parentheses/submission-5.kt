class Solution {
    val menu = hashMapOf(
        "}" to "{",
        "]" to "[",
        ")" to "("
    )

    fun isValid(str: String): Boolean {
        val opening: MutableCollection<String> = menu.values
        val closing: MutableCollection<String> = menu.keys

        var stack: MutableList<String> = mutableListOf()

        for (s in str) {
            if (opening.contains(s.toString())) {
                stack.add(s.toString())
                continue
            }
            
            if (closing.contains(s.toString())) {
                if (stack.isEmpty()) return false
                
                if (stack.removeLast().toString() != menu[s.toString()]) {
                    return false
                }
            }
        }

        return if (stack.isEmpty()) true
        else false
    }
}
