### [424. Longest Repeating Character Replacement](https://leetcode.com/problems/longest-repeating-character-replacement/description/?envType=study-plan&id=level-1)

##### Language : Kotlin

##### Tags: `Hash Table` `String` `Sliding Window`

```kotlin
class Solution {
    fun findAnagrams(s: String, p: String): List<Int> {

        val sCurrent = IntArray(26)
        val pCurrent = IntArray(26)

        val answer = mutableListOf<Int>()

        if (s.length < p.length) return listOf()

        for (i in p.indices) {
            pCurrent[p[i] - 'a']++
            sCurrent[s[i] - 'a']++
        }

        for (i in 0 until s.length - p.length) {
            if (sCurrent.contentEquals(pCurrent)) answer.add(i)
            sCurrent[s[i + p.length] - 'a']++
            sCurrent[s[i] - 'a']--
        }

        if (sCurrent.contentEquals(pCurrent)) answer.add(s.length - p.length)

        return answer
    }
}
```

