### [589. N-ary Tree Preorder Traversal](https://leetcode.com/problems/n-ary-tree-preorder-traversal/?envType=study-plan&id=level-1)

##### Language : Kotlin

##### Tags: Stack Tree Depth-First Search

```kotlin
/**
 * Definition for a Node.
 * class Node(var `val`: Int) {
 *     var children: List<Node?> = listOf()
 * }
 */

class Solution {
    fun preorder(root: Node?): List<Int> {
        val list = mutableListOf<Int>()

        fun dfs(root: Node?) {
            if (root == null) return

            list.add(root.`val`)

            for (node in root.children) {
                dfs(node)
            }
        }

        dfs(root)

        return list
    }
}
```

