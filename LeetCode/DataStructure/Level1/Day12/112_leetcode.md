### [112. Path Sum](https://leetcode.com/problems/path-sum/?envType=study-plan&id=data-structure-i)

##### Language : Kotlin

##### Tags: `Tree` `Depth-First Search`


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
    fun hasPathSum(root: TreeNode?, targetSum: Int): Boolean {
        if (root == null) return false

        if (root.left == null && root.right == null) return root.`val` == targetSum

        return hasPathSum(root.left, targetSum - root.`val`) || hasPathSum(root.right, targetSum - root.`val`)
    }
}
```

