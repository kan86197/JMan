import java.awt.Color;
/**
 * A pillar has a chance to randomly change it's color. It does not move and it can be consume by JMan if the color is
 * correct.
 * @author Kan Kamalanon
 *
 */
public class Pillar extends Piece {
	/** Constructor: a new Pillar at position (x, y) on Map m
    with color red if c = 0, green if c = 1, and yellow if c = 2. */
	public Pillar(int x, int y, int c, Map m){
		super(Piece.PILLAR, m);
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
	 /** Constructor: a new Pillar at position (x, y) on Map m
    with color c. Precondition: c is one of
    Color.RED, Color.GREEN, and Color.YELLOW.*/
	public Pillar(int x, int y, Color c, Map m){
        super(Piece.PILLAR, m);
        this.setX(x);
        this.setY(y);
        this.setColor(c);
    }
	
	/**
	 * Define how a pillar should act. There are 33% chance that it will change it's color each turn. If it change the 
	 * color, the color is select randomly between red, green and yellow.
	 */
	@Override
	public void act() {
		if(Piece.rand(0, 2) > 1){
			int randColor = Piece.rand(0, 2);
			if(randColor == 0) this.setColor(Color.RED);
			else if(randColor == 1) this.setColor(Color.YELLOW);
			else if(randColor == 2) this.setColor(Color.GREEN);
		}
	}
	
	/** = representation of this piece */
    public String toString() {
        String color= "";
        return getColorWord() + " Pillar at (" + getX() + ", " + getY() + ")";
    }
}
