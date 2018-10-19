import java.util.Scanner;
        import java.util.Stack;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] input = {2,1,5,6,2,3};
        int result = new Solution().largestRectangleArea(input);
        System.out.println(result);

    }
    static class Solution {
        public int largestRectangleArea(int[] heights) {
            Stack<Integer> s = new Stack<>();
            int maxArea = 0;
            int topIndex =0;
            int currentMax = 0;
            int i = 0;
            while(i < heights.length){
                if(s.isEmpty() || heights[s.peek()] <= heights[i]){
                    s.push(i);
                    i++;
                }else{
                    topIndex = s.pop();
                    if(s.isEmpty()){
                        currentMax = heights[topIndex] * i;
                    }else {
                        currentMax = heights[topIndex] * (i - s.peek() - 1);
                    }
                    maxArea = Math.max(maxArea, currentMax);
                }
            }
            while(!s.isEmpty()){
                topIndex = s.pop();
                if(s.isEmpty()){
                    currentMax = heights[topIndex] * i;
                }else {
                    currentMax = heights[topIndex] * (i - s.peek() - 1);
                }
                maxArea = Math.max(maxArea, currentMax);
            }
            return maxArea;
        }
    }
}
