### [102. Binary Tree Level Order Traversal](https://leetcode.com/problems/binary-tree-level-order-traversal/?envType=study-plan&id=level-1)

##### Language : Kotlin

##### Tags: `Tree` `Breadth-First Search` `Binary Tree`

```kotlin
/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    val array = ArrayList<ArrayList<Int>>()
    fun levelOrder(root: TreeNode?): List<List<Int>> {
        dfs(root, 0)
        return array
    }

    // DFS로 검증
    private fun dfs(root: TreeNode?, level: Int) {
        if (root == null) return

        if (level !in array.indices) {array.add(level, arrayListOf())}

        array[level].add(root.`val`)
        dfs(root.left, level + 1)
        dfs(root.right, level + 1)
    }
}
```

