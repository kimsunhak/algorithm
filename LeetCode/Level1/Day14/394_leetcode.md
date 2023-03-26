### [394. Decode String](https://leetcode.com/problems/decode-string/description/?envType=study-plan&id=level-1)

##### Language : Kotlin

##### Tags: `String` `Stack` `Recursion`

```kotlin
class Solution {
    fun decodeString(s: String): String {
        val stack = Stack<String>()
        var count = 0
        for (i in s) {
            when (i) {
                in '0'..'9' -> count = (10 * count) + (i - '0')
                '[' -> {
                    stack.push(count.toString())
                    stack.push("$i")
                    count = 0
                }
                ']' -> {
                    // "["가 나오기 전까지 문자열 추출
                    val sb = StringBuffer()
                    var w: String?
                    while (stack.pop().also { w = it } != "[") {
                        sb.insert(0, w)
                    }
                    stack.push(sb.repeat(stack.pop().toInt()))
                }
                else -> stack.push("$i")
            }
        }
        return stack.joinToString("")
    }
}
```

