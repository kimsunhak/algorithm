### [383. Ransom Note](https://leetcode.com/problems/ransom-note/?envType=study-plan&id=data-structure-i)

##### Language : Kotlin

##### Tags: `Hash Table` `String` `Counting`

```kotlin
class Solution {
    fun canConstruct(ransomNote: String, magazine: String): Boolean {
        val mutableList = mutableListOf<Char>()

        ransomNote.forEach { mutableList.add(it) }

        for (i in magazine) {
            if (i in mutableList) {
                mutableList.remove(i)
            }
        }

        return mutableList.isEmpty()
    }
}
```

