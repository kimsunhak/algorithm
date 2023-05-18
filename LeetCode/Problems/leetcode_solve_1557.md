### [1557. Minimum Number of Vertices to Reach All Nodes](https://leetcode.com/problems/minimum-number-of-vertices-to-reach-all-nodes/description/)

##### Language : Kotlin

##### Tags: `Graph`

```kotlin
class Solution {
    fun findSmallestSetOfVertices(n: Int, edges: List<List<Int>>): List<Int> {

        val visited = BooleanArray(n) { true }
        val result = mutableListOf<Int>()

        for (edge in edges) {
            visited[edge[1]] = false
        }

        for (i in visited.indices) {
            if (visited[i]) {
                result.add(i)
            }
        }

        return result
    }
}
```

