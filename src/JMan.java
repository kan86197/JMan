import java.awt.*;

/** An instance of this class is a J*Man.
 There should at most one J*Man in a game board at a time*/
public class JMan extends Piece {
    
    /** Constructor: a new J*Man at position (x, y) on Map m
     with color red if c = 0, green if c = 1, and yellow if c = 2. */
    public JMan(int x, int y, int c, Map m){
        super(Piece.JMAN, m);
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
    
    /** Constructor: a new J*Man at position (x, y) on Map m
     with color c. Precondition: c is one of
     Color.RED, Color.GREEN, and Color.YELLOW.*/
    public JMan(int x, int y, Color c, Map m){
        super(Piece.JMAN, m);
        this.setX(x);
        this.setY(y);
        this.setColor(c);
    }
    
    /** J*Man should move based on what button is pushed.
     This method is not used. */
    public void act(){}
    
    /** Move J*Man one step based on the value of i:
        0 = up, 1 = down, 2 = left, 3 = right. */
    public void step(int i){
        setActed(true);
        int x = this.getX();
		int y = this.getY();
		try{
			if(i == 0) this.setY(y - 1);
			else if(i == 1) this.setY(y + 1);
			else if(i == 2) this.setX(x - 1);
			else if(i == 3) this.setX(x + 1);
			this.getMap().move(x, y, this.getX(), this.getY());
		} catch(ArrayIndexOutOfBoundsException e){
			this.setX(x);
			this.setY(y);
		}
    }
    
    /** = representation of this piece */
    public String toString() {
        String color= "";
        return getColorWord() + " J*Man at (" + getX() + ", " + getY() + ")";
    }
}
