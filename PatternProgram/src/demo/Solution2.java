package demo;

public class Solution2 {
    static int[] dx = { 1, -1, 0, 0 };
    static int[] dy = { 0, 0, 1, -1 };
    public static int longestIncreasingPath(int[][] matrix) {
        if (matrix.length == 0)
            return 0;
        int m = matrix.length, n = matrix[0].length;
        int[][] dis = new int[m][n];
        int ans = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                ans = Math.max(ans, dfs(i, j, m, n, matrix, dis));
            }
        }
        return ans+1;
    }

    static int dfs(int x, int y, int m, int n, int[][] matrix, int[][] dis) {
        if (dis[x][y] != 0)
            return dis[x][y];

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx >= 0 && ny >= 0 && nx < m && ny < n && matrix[nx][ny] > matrix[x][y]) {
                dis[x][y] = Math.max(dis[x][y], dfs(nx, ny, m, n, matrix, dis));
            }
        }
        return ++dis[x][y];
    }

    public static void main(String[] args) {
        int arr[][] = { 
        		  { 8, 2, 4},
                  { 0, 7, 1 },
                  { 3, 7, 9}
                 
        };
        System.out.println(longestIncreasingPath(arr));
    }
}