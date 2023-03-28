### [1046. Last Stone Weight](https://leetcode.com/problems/last-stone-weight/description/?envType=study-plan&id=level-1)

##### Language : Kotlin

##### Tags: `Hash Table` `String` `Trie` `Sorting` `Heap (Priority Queue)` `Bucket Sort` `Counting`

```kotlin
class Solution {
    fun topKFrequent(words: Array<String>, k: Int): List<String> {
        val map = mutableMapOf<String, Int>()

        for (word in words) {
            map[word] = map.getOrDefault(word, 0) + 1
        }

        // 내림차순 정렬
        val sorted = map.toList().sortedBy{
            it.first
        }.sortedByDescending{
            it.second
        }

        return sorted.take(k).map { it.first }
    }
}
```

