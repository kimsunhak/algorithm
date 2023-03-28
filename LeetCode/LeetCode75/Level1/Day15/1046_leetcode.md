### [1046. Last Stone Weight](https://leetcode.com/problems/last-stone-weight/description/?envType=study-plan&id=level-1)

##### Language : Kotlin

##### Tags: `Array` `Heap (Priority Queue)`

```kotlin
class Solution {
    fun lastStoneWeight(stones: IntArray): Int {

        if (stones.size == 1) return stones[0]

        // 우선순위 Queue
        val heap = PriorityQueue<Int>(stones.size)

        stones.forEach {
            heap.add(it * -1)
        }

        while(heap.size > 1) {
            val heapDiff = heap.poll() - heap.poll()
            if (heapDiff != 0) heap.add(heapDiff)
        }

        return if (heap.isEmpty()) 0 else heap.poll() * -1
    }
}
```

