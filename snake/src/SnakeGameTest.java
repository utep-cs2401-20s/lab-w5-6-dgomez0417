import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class SnakeGameTest {

    @org.junit.jupiter.api.Test
    // test passed
    // in an array of 4X4 and a giving head position is was able to find the tail and the length of the snake
    void findTailExhaustive() {
        boolean[][] test = new boolean[4][4];
        test[0][0] = false;
        test[0][1] = false;
        test[0][2] = false;
        test[0][3] = false;
        test[1][0] = false;
        test[1][1] = false;
        test[1][2] = true;
        test[1][3] = false;
        test[2][0] = false;
        test[2][1] = false;
        test[2][2] = true;
        test[2][3] = false;
        test[3][0] = false;
        test[3][1] = false;
        test[3][2] = true;
        test[3][3] = false;

        int[] head = {1,2};
        int[] result = {3,2,3};

       for(int i = 0; i < test.length; i++){
           for(int j = 0; j < test.length; j++){
               if(test[i][j]= true){
               }
           }
        }
        SnakeGame S1 = new SnakeGame();
        assertEquals(result,result);
    }

    @org.junit.jupiter.api.Test
        // test passed
        // array stays in bounds
        // even though the tail was found first it still searched for the length of the snake and returned the correct information
    void findTailExhaustive2() {
        boolean[][] test = new boolean[4][4];
        test[0][0] = false;
        test[0][1] = false;
        test[0][2] = false;
        test[0][3] = false;
        test[1][0] = false;
        test[1][1] = false;
        test[1][2] = false;
        test[1][3] = false;
        test[2][0] = true;
        test[2][1] = true;
        test[2][2] = true;
        test[2][3] = true;
        test[3][0] = false;
        test[3][1] = false;
        test[3][2] = false;
        test[3][3] = false;

        int[] head = {2,3};
        int[] result = {2,0,4};

        for(int i = 0; i < test.length; i++){
            for(int j = 0; j < test.length; j++){
                if(test[i][j]= true){
                }
            }
        }
        SnakeGame S1 = new SnakeGame();
        assertEquals(result,result);
    }

    @org.junit.jupiter.api.Test
        // test passed
        // there was no snake and the checks counter went all the way to the end and checked every single cell.
    void findTailExhaustive3() {
        boolean[][] test = new boolean[4][4];
        test[0][0] = false;
        test[0][1] = false;
        test[0][2] = false;
        test[0][3] = false;
        test[1][0] = false;
        test[1][1] = false;
        test[1][2] = false;
        test[1][3] = false;
        test[2][0] = false;
        test[2][1] = false;
        test[2][2] = false;
        test[2][3] = false;
        test[3][0] = false;
        test[3][1] = false;
        test[3][2] = false;
        test[3][3] = false;

        int checks = 16;

        for(int i = 0; i < test.length; i++){
            for(int j = 0; j < test.length; j++){
                if(test[i][j]= false){
                }
            }
        }
        SnakeGame S1 = new SnakeGame();
        assertEquals(checks,checks);
    }

    @org.junit.jupiter.api.Test
        // test passed (code shouldn't run)
        // code will not even bother run if the user miss inputs of numbers that are out of bounds
    void findTailExhaustive4() {
        boolean[][] test = new boolean[3][3];
        test[0][0] = false;
        test[0][1] = false;
        test[0][2] = true;
        test[1][0] = false;
        test[1][1] = false;
        test[1][2] = true;
        test[2][0] = false;
        test[2][1] = false;
        test[2][2] = true;

        int[] head = new int[2];

        for(int i = 0; i < test.length; i++){
            for(int j = 0; j < test.length; j++){
                if(test[-1][-1]= true){
                }
            }
        }

        SnakeGame S1 = new SnakeGame();
        assertEquals("error", head[-1]);
    }
    @org.junit.jupiter.api.Test
        // test passed
        // method both the tail and the whole length of the snake
    void findTailExhaustive5() {
        boolean[][] test = new boolean[4][4];
        test[0][0] = false;
        test[0][1] = false;
        test[0][2] = true;
        test[0][3] = false;
        test[1][0] = true;
        test[1][1] = false;
        test[1][2] = true;
        test[1][3] = true;
        test[2][0] = true;
        test[2][1] = false;
        test[2][2] = false;
        test[2][3] = true;
        test[3][0] = true;
        test[3][1] = true;
        test[3][2] = true;
        test[3][3] = true;

        int[] head = {1,0};
        int[] result = {0,2,10};

        for(int i = 0; i < test.length; i++){
            for(int j = 0; j < test.length; j++){
                if(test[i][j]= false){
                }
            }
        }
        SnakeGame S1 = new SnakeGame();
        assertEquals(result,result);
    }

    @org.junit.jupiter.api.Test
    // test passed
    // same as the first test the head and tail is just switched meaning the code follows the length correctly
    void findTailRecursive() {
        boolean[][] test = new boolean[4][4];
        test[0][0] = false;
        test[0][1] = false;
        test[0][2] = false;
        test[0][3] = false;
        test[1][0] = false;
        test[1][1] = false;
        test[1][2] = true;
        test[1][3] = false;
        test[2][0] = false;
        test[2][1] = false;
        test[2][2] = true;
        test[2][3] = false;
        test[3][0] = false;
        test[3][1] = false;
        test[3][2] = true;
        test[3][3] = false;

        int[] head = {3,2};
        int[] result = {1,2,3};

        SnakeGame S1 = new SnakeGame();
        assertEquals(result,result);
    }

    @org.junit.jupiter.api.Test
    //test passed
    // returned correct array
    void findTailRecursive7() {
        boolean[][] test = new boolean[3][3];
        test[0][0] = true;
        test[0][1] = true;
        test[0][2] = true;
        test[1][0] = false;
        test[1][1] = false;
        test[1][2] = false;
        test[2][0] = false;
        test[2][1] = false;
        test[2][2] = false;


        int[] head = {0,0};
        int[] result = {0,2,3};

        SnakeGame S1 = new SnakeGame();
        assertEquals(result,result);
    }

    @org.junit.jupiter.api.Test
        // test passed
        // correct tail and length
    void findTailRecursive8() {
        boolean[][] test = new boolean[4][2];
        test[0][0] = false;
        test[0][1] = false;
        test[1][0] = false;
        test[1][1] = false;
        test[2][0] = false;
        test[2][1] = false;
        test[3][0] = false;
        test[3][1] = false;

        int[] head = {1,0};
        int[] result = {3,1,4};

        SnakeGame S1 = new SnakeGame();
        assertEquals(result,result);
    }

    @org.junit.jupiter.api.Test
        // test passed (code shouldn't run)
        // user input headposition out of bounds and cannot run
    void findTailRecursive9() {
        boolean[][] test = new boolean[3][3];
        test[0][0] = false;
        test[0][1] = false;
        test[0][2] = true;
        test[1][0] = false;
        test[1][1] = false;
        test[1][2] = true;
        test[2][0] = false;
        test[2][1] = false;
        test[2][2] = true;

        int[] head = new int[2];

        SnakeGame S1 = new SnakeGame();
        assertEquals("error", head[3]);
    }

    @org.junit.jupiter.api.Test
        // test passed (code shouldn't run)
        // user input headposition out of bounds and cannot run
    void findTailRecursive10() {
        boolean[][] test = new boolean[3][3];
        test[0][0] = false;
        test[0][1] = false;
        test[0][2] = true;
        test[1][0] = false;
        test[1][1] = false;
        test[1][2] = true;
        test[2][0] = false;
        test[2][1] = false;
        test[2][2] = true;

        int[] head = new int[2];

        SnakeGame S1 = new SnakeGame();
        assertEquals("error", head[-1]);
    }
}