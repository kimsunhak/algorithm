### [98. Validate Binary Search Tree](https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/?envType=study-plan&id=level-1)

##### Language : Kotlin

##### Tags: `Tree` `Depth-First Search` `Binary Search Tree` `Binary Tree`

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
    fun isValidBST(root: TreeNode?): Boolean {
        return checkBST(root, Long.MIN_VALUE, Long.MAX_VALUE)
    }

    // checkBST Min, Max
    private fun checkBST(root: TreeNode?, min: Long, max: Long): Boolean {
        if (root == null) return true

        if (min !== null && root.`val` <= min || max !== null && root.`val` >= max) return false

        return checkBST(root.left, min, root.`val`.toLong()) && checkBST(root.right, root.`val`.toLong(), max)
    }
}
```

