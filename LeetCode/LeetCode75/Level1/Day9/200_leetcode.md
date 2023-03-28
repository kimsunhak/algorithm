### [200. Number of Islands](https://leetcode.com/problems/number-of-islands/description/?envType=study-plan&id=level-1)

##### Language : Kotlin

##### Tags: `Array` `Depth-First Search` `Breadth-First Search` `Union Find` `Matrix`

```kotlin
class Solution {
    fun numIslands(grid: Array<CharArray>): Int {
        var islands = 0

        for (row in grid.indices) {
            for (col in grid.first().indices) {
                if (grid[row][col] == '1') {
                    dfs(grid, row, col)
                    islands++;
                }
            }
        }
        return islands
    }

    // DFS Method
    private fun dfs(grid: Array<CharArray>, row: Int, col: Int) {

        if (row >= 0 &&  row < grid.size && col >= 0 &&  col < grid.first().size && grid[row][col] == '1') {
            grid[row][col] = '0'

            dfs(grid, row + 1, col) // 위
            dfs(grid, row - 1, col) // 아래
            dfs(grid, row, col + 1) // 왼쪽
            dfs(grid, row, col - 1) // 오른쪽
        }
    }
}
```

