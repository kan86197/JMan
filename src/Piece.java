import java.awt.*;

/** An instance is a piece for use in the J*Man!! assignment 2.*/
public abstract class Piece{
	private boolean acted;
	private Color color;
	private int x, y, type;
	private Map m;
    /** Constants that identify the kind of a piece. */
    public static final int BLOCK= 0;  // piece is a block
    public static final int JMAN= 1;   // piece is the J*man
    public static final int WALKER= 2; // piece is a walker
    public static final int PILLAR= 3; // piece is a pillar
    /** Constructor: a Piece on Map m with type t.
        Precondition: type is one of the four constants of this class. */
    public Piece(int t, Map m){
        this.type = t;
        this.m = m;
        this.acted = false;
    }
    
    /** = this piece's type: (one of the four constants of this class. */
    public int getType(){
        return type;
    }
    
    /** = this piece's x location. */
    public int getX(){
        return x;
    }
    
    /** = this piece's y location. */
    public int getY(){
        return y;
    }
    
    /** = this piece's color. */
    public Color getColor(){
        return color;
    }
    
    /** = the color of this piece, as a capitalized word (e.g. "Red").
        = the empty string if it is not one of red, green, yellow, or white*/
    public String getColorWord() {
        // complete this
    	String colorWord = "";
    	if(color.equals(Color.RED)){
    		colorWord = "Red";
    	}	else if(color.equals(Color.YELLOW)){
    		colorWord = "Yellow";
    	}	else if(color.equals(Color.GREEN)){
    		colorWord = "Green";
    	}	else if(color.equals(Color.WHITE)){
    		colorWord = "White";
    	}
        return colorWord;
    }
    
    /** = "This piece has already acted this round". */
    public boolean hasActed(){
        return acted;
    }
    
    /** = the map this piece is on. */
    public Map getMap(){
        return m;
    }
    
    /** Set this piece's x location to x. */
    public void setX(int x){
        this.x = x;
    }
    
    /** Set this piece's y location to y. */
    public void setY(int y){
        this.y = y;
    }
    
    /** Set this piece's color to the c.
        Precondition: c is Color.WHITE and this is a block,OR
        c is Color.RED, Color.GREEN, or Color.YELLOW. */
    public void setColor(Color c){
        this.color = c;
    }
    
    /** Set the state of this piece to the value of acted.*/
    public void setActed(boolean acted){
        this.acted = acted;
    }
    
    /** Make this piece take one action. What a piece does on
        its action is defined in the assignment. */
    public abstract void act();
    
    /** = a random integer in the range lo..hi, with all integers in
          the range being equally likely. 
          Precondition lo < hi. */
    public static int rand(int lo, int hi){
        return (int)(Math.random()*(hi-lo+1))+lo;
    }
    
}