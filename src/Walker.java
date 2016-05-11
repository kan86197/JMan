import java.awt.Color;
/**
 * A Walker randomly wander around the grid. It can be consume by JMan if the color is correct.
 * @author Kan Kamalanon
 *
 */
public class Walker extends Piece {
	/** Constructor: a new Walker at position (x, y) on Map m
    with color red if c = 0, green if c = 1, and yellow if c = 2. */
	public Walker(int x, int y, int c, Map m){
		super(Piece.WALKER, m);
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
	
	 /** Constructor: a new Walker at position (x, y) on Map m
    with color c. Precondition: c is one of
    Color.RED, Color.GREEN, and Color.YELLOW.*/
	public Walker(int x, int y, Color c, Map m){
		super(Piece.WALKER, m);
		this.setX(x);
		this.setY(y);
		this.setColor(c);
	}
	
	/**
	 * Define how a Walker should act. It has a 33% chance of moving, if it moves, it will randomly move up, down, left
	 * or right for 1 tile.
	 */
	@Override
	public void act() {
		if(Piece.rand(0, 2) > 1){
			
			int i = Piece.rand(0, 3);
			int x = this.getX();
			int y = this.getY();
			if(i == 0) {
				if(this.getMap().isInGrid(x, y - 1) && getMap().isEmpty(x, y-1))
				this.setY(y - 1);
			}
			else if(i == 1) this.setY(y + 1);
			else if(i == 2) this.setX(x - 1);
			else if(i == 3) this.setX(x + 1);
			this.getMap().move(x, y, this.getX(), this.getY());
			}
		}

		/** = representation of this piece */
		public String toString() {
			String color= "";
			return getColorWord() + " Walker at (" + getX() + ", " + getY() + ")";
		}
	}
