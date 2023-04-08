### [104. Maximum Depth of Binary Tree](https://leetcode.com/problems/maximum-depth-of-binary-tree/?envType=study-plan&id=data-structure-i)

##### Language : Kotlin

##### Tags: `Tree` `Depth-First Search` `Breadth-First Search` `Binary Tree`


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

    fun maxDepth(root: TreeNode?): Int {
        return dfs(root)
    }

    private fun dfs(node: TreeNode?): Int {
        if (node == null) return 0
        return Math.Max(dfs(node.left), (dfs(node.right)) + 1)
    }
}
```

