### [844. Backspace String Compare](https://leetcode.com/problems/backspace-string-compare/description/?envType=study-plan&id=level-1)

##### Language : Kotlin

##### Tags: `Two Pointers` `String` `Stack` `Simulation`

```kotlin
class Solution {
    fun backspaceCompare(s: String, t: String): Boolean {
        return next(s) == next(t)
    }

    private fun next(s: String): String {
        var count = 0 // BackSpace Count
        val builder = StringBuilder()

        for (i in s.lastIndex downTo 0) {
            when {
                s[i] == '#' -> count++
                count > 0 -> count--
                else -> builder.append(s[i])
            }
        }
        return builder.toString()
    }
}
```

