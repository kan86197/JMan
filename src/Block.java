import java.awt.Color;

public class Block extends Piece {
	public Block(int x, int y, int c, Map m){
		super(Piece.BLOCK, m);
		this.setX(x);
		this.setY(y);
		if(c == 0){
        	this.setColor(Color.RED);
        }	else if(c == 1){
        	this.setColor(Color.GREEN);
        }	else if(c == 2){
        	this.setColor(Color.YELLOW);
        }
	}
	
	public Block(int x, int y, Color c, Map m){
        super(Piece.BLOCK, m);
        this.setX(x);
        this.setY(y);
        this.setColor(c);
    }

	@Override
	public void act() {
	}
	
	/** = representation of this piece */
    public String toString() {
        String color= "";
        return getColorWord() + " Block at (" + getX() + ", " + getY() + ")";
    }
}
