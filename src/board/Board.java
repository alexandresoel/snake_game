package board;

import cell.Cell;
import cell.CellType;

public class Board {
	final int ROW_COUNT, COL_COUNT;
	private Cell[][] cells;
	
	public Board(int rowCount, int colCount) {
		ROW_COUNT = rowCount;
		COL_COUNT = colCount;
		
		cells = new Cell[ROW_COUNT][COL_COUNT];
		for(int row = 0; row < ROW_COUNT; row++ ) {
			for (int column = 0; column < COL_COUNT; column++) {
				cells[row][column] = new Cell(row, column);
			}
			
		}
		
		
		
	}
	
	public Cell[][] getCells()
    {
        return cells;
    }
 
    public void setCells(Cell[][] cells)
    {
        this.cells = cells;
    }
    
    public void generateFood() {
    	System.out.println("Gerando comida");
    	while(true) {
    		int row = (int)(Math.random() * ROW_COUNT);
    		int column = (int)(Math.random() * COL_COUNT);
    		if(cells[row][column].getCellType()!=CellType.SNAKE_NODE)
    			break;
    		cells[row][column].setCellType(CellType.FOOD);
            System.out.println("Comida gerada em: " + row + " " + column);
    	}
    	
    }

}
