### [392. Is Subsequence](https://leetcode.com/problems/is-subsequence/description/?envType=study-plan&id=level-1)

##### Language : Kotlin

##### Tags: `Two Pointers` `String` `Dynamic Programming`

```kotlin
class Solution {
    fun isSubsequence(s: String, t: String): Boolean {
        var pointer = 0

        if (s.isEmpty()) return true else if (t.isEmpty()) return false

        // Loop String
        for (i in t) {
            // 같은 문자열이 발견되면 pointer 증가
            if (i == s[pointer]) pointer++

            // 포인터 길이가 문자열 길이랑 같으면 true 반환
            if (pointer == s.length) return true
        }
        return false
    }
}
```

