package sth;

class Solution {
    public static int sumTotal(int[][] board){
        int sum = 0;
        for(int i[] : board)
            for(int j : i)
                sum += j;
        return sum;
    }
    
    public static int sumArea(int[][] board, int min, int k){
        int sum = 0;
        for(int i = 0; i <= min; i++){
            for(int j = 0; j <= k - i; j++){
                // System.out.println(i + " | " + j + " | " + sum);
                sum += board[i][j];
            }
        }
        return sum;
    }
    
    public static int solution(int[][] board, int k) {
        int x = board[0].length;
        int y = board.length;
        int result = 0;
        
        if(x < k && y < k)
                result = sumArea(board, (x > y ? y : x), k); 
        else if(x < k || y < k)
                result = sumArea(board, (x > y ? y : x), k); 
        else
            result = sumArea(board, k, k);
        
        return result;
    }
    
    public static void main(String[] args) {
		int[][] board = {{0, 1, 2},{1, 2, 3},{2, 3, 4},{3, 4, 5}};
		int k = 2;
		System.out.println(solution(board, k));
	}
}