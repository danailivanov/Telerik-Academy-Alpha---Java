import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [][] input = {{1,1,0},{1,1,0},{0,0,1}};
        int result = Solution.findCircleNum(input);
        System.out.println(result);
    }

    static class Solution {
        static public int findCircleNum(int[][] M) {
            boolean[] visited = new boolean[M.length];
            int count = 0;
            for (int i = 0; i < M.length; i++) {
                if(!visited[i]){
                    dfs(M,visited,i);
                    count++;
                }
            }
            return count;
        }

        private static void dfs(int[][] m, boolean[] visited, int i) {
            for (int j = 0; j < m.length; j++) {
                if(m[i][j] == 1 && !visited[j]){
                    visited[j] = true;
                    dfs(m,visited,j);
                }
            }
        }
    }
}
