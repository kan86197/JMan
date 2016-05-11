import java.awt.Color;

/**
 * An instance of this class is a block.
 * A block doesn't move and is always white. It only purpose is to be in the way of JMan and Walker.
 * @author Kan Kamalanon
 *
 */
public class Block extends Piece {
    /** Constructor: a new block at position (x, y) on Map m
    with color red if c = 0, green if c = 1, and yellow if c = 2. */
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
	
	/** Constructor: a new Block at position (x, y) on Map m
    with color c. Precondition: c is one of
    Color.RED, Color.GREEN, and Color.YELLOW.*/
	public Block(int x, int y, Color c, Map m){
        super(Piece.BLOCK, m);
        this.setX(x);
        this.setY(y);
        this.setColor(c);
    }
	
	
	/**
	 * Define how the block should act. It does nothing.
	 */
	@Override
	public void act() {
	}
	
	/** = representation of this piece */
    public String toString() {
        String color= "";
        return getColorWord() + " Block at (" + getX() + ", " + getY() + ")";
    }
}
