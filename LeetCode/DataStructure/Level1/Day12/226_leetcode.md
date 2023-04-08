### [226. Invert Binary Tree](https://leetcode.com/problems/invert-binary-tree/?envType=study-plan&id=data-structure-i)

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

    private lateinit var nodes: MutableList<Int>

    fun invertTree(root: TreeNode?): TreeNode? {
        if (root == null) return null

        val temp = root.left
        root.left = root.right
        root.right = temp

        invertTree(root?.left)
        invertTree(root?.right)

        return root
    }
}
```

