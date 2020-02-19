public class SnakeGame {
    private boolean[][] game;
    private int[] headPosition;
    private static int exhaustiveChecks;
    private static int recursiveChecks;

    public SnakeGame() {
        game = new boolean[1][1];
    }

    public SnakeGame(boolean[][] arr, int x, int y) {
        for(int i = 0; i < game.length; i++){
            for(int j = 0; j < game.length; j++){
                game[i][j] = arr[i][j];
            }
        }
        headPosition = new int[2];
        headPosition[0] = x;
        headPosition[1] = y;
    }

    public int[] findTailExhaustive() {
        int check = 0;
            for(int i = 0; i < game.length; i++){ // start at 0,0 and check if is part of the snake
                for (int j = 1; j < game.length; j++) {
                    if(game[i][j] = false){
                        check ++;
                }
            }
        }
        //Start at 0,0
        // check if 0,0 part of the snake
        // check ++ then when this is done then its the length counter.
        //check see how many cell we looked at
        // if no move to next cell
        // if yes then how many neighbors are in snake?
        // 1 = tail or head cant return auto becuase you need to keep track of the snake length
        // 2 or more move to the next cell
        // when done
        //return tail(x,y);
    }
}

//find tail looks at every single cell to find the tail

}
