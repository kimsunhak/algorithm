### [20. Valid Parentheses](https://leetcode.com/problems/valid-parentheses/?envType=study-plan&id=data-structure-i)

##### Language : Kotlin

##### Tags: `String` `Stack`

```kotlin
class Solution {
    fun isValid(s: String): Boolean {
        val stack = Stack<Char>()

        s.forEach {
            when(it) {
                '(' -> stack.push(')')
                '[' -> stack.push(']')
                '{' -> stack.push('}')
                else -> if (stack.isEmpty() || stack.pop() != it) return false
            }
        }

        return stack.isEmpty()
    }
}
```

