### [235. Lowest Common Ancestor of a Binary Search Tree](https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/?envType=study-plan&id=level-1)

##### Language : Kotlin

##### Tags: `Tree` `Depth-First Search` `Binary Search Tree` `Binary Tree`

```kotlin
/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int = 0) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun lowestCommonAncestor(root: TreeNode?, p: TreeNode?, q: TreeNode?): TreeNode? {

        if (root == null) return null

        // leftNode
        if (p!!.`val` < root!!.`val` && q!!.`val` < root!!.`val`) return lowestCommonAncestor(root.left, p, q)

        // rightNode
        if (p!!.`val` > root!!.`val` && q!!.`val` > root!!.`val`) return lowestCommonAncestor(root.right, p, q)

        return root
    }
}
```

