### [387. First Unique Character in a String](https://leetcode.com/problems/first-unique-character-in-a-string/?envType=study-plan&id=data-structure-i)

##### Language : Kotlin

##### Tags: `Hash Table` `String` `Queue`

```kotlin
class Solution {
    fun firstUniqChar(s: String): Int {
        return s.indexOfFirst { s.indexOf(it) == s.lastIndexOf(it)}
    }
}
```

