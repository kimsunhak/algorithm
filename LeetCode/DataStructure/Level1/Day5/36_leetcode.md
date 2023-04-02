### [36. Valid Sudoku](https://leetcode.com/problems/valid-sudoku/?envType=study-plan&id=data-structure-i)

##### Language : Kotlin

##### Tags: `Array` `Hash Table` `Matrix`

```kotlin
class Solution {
    fun isValidSudoku(board: Array<CharArray>): Boolean {
        return checkRow(board) && checkCol(board) && checkSquares(board)
    }


    private fun checkRow(board: Array<CharArray>): Boolean {
        for (i in board) {
            val filter = i.filter { it != '.' }
            if (filter.size > HashSet(filter).size) return false
        }
        return true
    }

    private fun checkCol(board: Array<CharArray>): Boolean {
        for (i in 0 until 9) {
            val col = mutableListOf<Char>()
            for (j in board.indices) {
                if (board[j][i] != '.') col.add(board[j][i])
            }

            if (col.size > HashSet(col).size) return false
        }

        return true
    }

    private fun checkSquares(board: Array<CharArray>): Boolean {
        val set = hashSetOf<Char>()

        for (i in 0 until 9) {
            val colS = (i % 3) * 3
            val rowS = (i / 3) * 3
            for (row in rowS until rowS  + 3) {
                for (col in colS until colS + 3) {
                    val char = board[row][col]
                    if (char == '.') continue
                    if (set.contains(char)) return false
                    set.add(char)
                }
            }
            set.clear()
        }
        return true
    }
}
```

