def surfaceArea(grid):
        result = 0
        for row in range(len(grid)):
            for col in range(len(grid)):
                if grid[row][col] != 0:
                    result += 6

                    if grid[row][col] > 1:
                        result += 4 * (grid[row][col] - 1)

                    if row != 0:
                        n = grid[row-1][col]
                        result -= min(n, grid[row][col])
                    if row != len(grid) -1:
                        n = grid[row+1][col]
                        result -= min(n, grid[row][col])
                    if col != 0:
                        n = grid[row][col-1]
                        result -= min(n, grid[row][col])
                    if col != len(grid) -1:
                        n = grid[row][col+1]
                        result -= min(n, grid[row][col])

        return result