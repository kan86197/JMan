import java.awt.Color;

public class Pillar extends Piece {
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
	
	public Pillar(int x, int y, Color c, Map m){
        super(Piece.PILLAR, m);
        this.setX(x);
        this.setY(y);
        this.setColor(c);
    }

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
