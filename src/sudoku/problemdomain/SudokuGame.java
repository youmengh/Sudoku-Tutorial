package sudoku.problemdomain;

import sudoku.computationlogic.SudokuUtilities;
import sudoku.constants.GameState;

import java.io.Serializable;

public class SudokuGame implements Serializable {
    private final GameState gameState;
    private final int[][] gridState;

    public static final int GRID_BOUNDARY = 9;

    public SudokuGame(GameState gameState, int[][] gridSate){
        this.gameState = gameState;
        this.gridState = gridSate;
    }

    public GameState getGameState(){
        return gameState;
    }

    public int[][] getCopyOfGridSate(){
        return SudokuUtilities.copyToNewArray(gridState);
    }
}
