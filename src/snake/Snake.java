package snake;

import java.util.LinkedList;
import cell.Cell;
import cell.CellType;

public class Snake {
	private LinkedList<Cell> snakePartList = new LinkedList<>();
	private Cell head;
	
	public Snake(Cell initPos) {
		head = initPos;
		snakePartList.add(head);
		head.setCellType(CellType.SNAKE_NODE);
	}
	
	public void grow() {
		snakePartList.add(head);
	}
	
	public void move(Cell nextCell) {
		System.out.println("A cobra esta se movendo para: "+ nextCell.getRow()+" "+ nextCell.getCol());
		Cell tail = snakePartList.removeLast();
		tail.setCellType(CellType.EMPTY);
		
		head = nextCell;
		head.setCellType(CellType.SNAKE_NODE);
		snakePartList.addFirst(head);
		
	}
	
	public boolean checkCrash(Cell nextCell) {
		System.out.println("Checando batida");
		for (Cell cell : snakePartList) {
			if(cell == nextCell) {
				return true;
			}
		}
		return false;
	}
	
	public LinkedList<Cell> getSnakePartList(){
		return snakePartList;
	}
	
	public void setSnakePartList(LinkedList<Cell> snakePartList) {
		this.snakePartList = snakePartList;		
	}
	
    public Cell getHead() { 
    	return head; 
    	}
    
    public void setHead(Cell head) { 
    	this.head = head;
    	}
}
