### [242. Valid Anagram](https://leetcode.com/problems/valid-anagram/?envType=study-plan&id=data-structure-i)

##### Language : Kotlin

##### Tags: `Hash Table` `String` `Sorting`

```kotlin
class Solution {
    fun isAnagram(s: String, t: String): Boolean = s.toList().sorted().equals(t.toList().sorted())
}
```

