### [205. Isomorphic Strings](https://leetcode.com/problems/isomorphic-strings/description/?envType=study-plan&id=level-1)

##### Language : Kotlin

##### Tags: `HashTable` `String`

```kotlin
class Solution {
    fun isIsomorphic(s: String, t: String): Boolean {
        val hashMap = HashMap<Char, Char>()
        for (i in s.indices) {
            val charS = s[i]
            val charT = t[i]
            if (charS !in hashMap) {
                if (charT in hashMap.values) return false
                hashMap[charS] = charT
            } else if (hashMap[charS] != charT) return false
        }
        return true
    }
}
```

