public class SnakeGame {

    private boolean[][] game;
    private int[] headPosition;
    private static int exhaustiveChecks;
    private static int recursiveChecks;

    public SnakeGame() { // default constructor
        game = new boolean[1][1];
    }

    public SnakeGame(boolean[][] arr, int x, int y) { // constructor
        for(int i = 0; i < game.length; i++){ // copying the game board to the new board
            for(int j = 0; j < game.length; j++){
                game[i][j] = arr[i][j];
            }
        }
        headPosition = new int[2]; // creating array for head position
        headPosition[0] = x; // giving head position values
        headPosition[1] = y;
    }

    public int[] findTailExhaustive() {
        resetCounters(); // resetting the counter
        int length = 0; // to store the length of the snake
        int n = 0; // keep track of how many neighbors are around the tail position
        int[]arr =  new int[3]; // array that will be returned

        for(int i = 0; i < game.length; i++){ // looking through the board to find snake
            for (int j = 0; j < game[i].length; j++) {
                if(game[i][j] = true) { // checks if the cell is part of the snake
                    length++;
                    if(i+1 <= game.length && i-1 > -1 && j+1 <= game.length && j-1 > -1 ){ // make sure that the if statement below will not go out of bounds
                        if (game[i + 1][j]) { // checking the cells around the true cell
                            n++;
                        }
                        if (game[i - 1][j]) {
                            n++;
                        }
                        if (game[i][j + 1]) {
                            n++;
                        }
                        if (game[i][j - 1]) {
                            n++;
                        }
                        length += n; // adding the neighbors to length

                        if (i != headPosition[0] && j != headPosition[1] && n == 1) { // checking if the true cell found is the tail
                            arr[0] = i; // storing tail position into returned array
                            arr[1] = j;
                        }
                    }
                }
                if(game[i][j] = false) { // snake still not found
                    exhaustiveChecks++;
                }
                else{
                    exhaustiveChecks--; // makes sure there is no double counting.
                }
            }
        }
        arr[2] = length;
        return arr;
    }

    public int[] findTailRecursive(){
        resetCounters(); // resting the counter
        return findTailRecursive(headPosition, headPosition); // returning what the private
    }
    private int[] findTailRecursive(int[] currentPosition, int[] previousPosition){

    }

    private void resetCounters(){
        exhaustiveChecks = 0;
        recursiveChecks = 0;
    }
    public static int getRecursiveChecks(){
        return recursiveChecks;
    }
    public static int getExhaustiveChecks(){
        return exhaustiveChecks;
    }
}