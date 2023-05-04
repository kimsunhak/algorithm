### [649. Dota2 Senate](https://leetcode.com/problems/dota2-senate/description/)

##### Language : Kotlin

##### Tags: `String` `Greedy` `Queue`

```kotlin
class Solution {
    fun predictPartyVictory(senate: String): String {
        val queueR = LinkedList<Int>()
        val queueD = LinkedList<Int>()

        var result = ""
        val n = senate.length

        for (i in senate.indices) {
            if (senate[i]== 'R') {
                queueR.add(i)
            } else {
                queueD.add(i)
            }
        }

        while (queueR.isNotEmpty() && queueD.isNotEmpty()) {
            val r = queueR.poll()
            val d = queueD.poll()

            if (r < d) {
                queueR.add(r + n)
            } else {
                queueD.add(d + n)
            }
        }

        result = if (queueR.size > queueD.size) {
            "Radiant"
        } else {
            "Dire"
        }

        return result
    }
}
```

