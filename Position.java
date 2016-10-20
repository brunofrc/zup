

/**
 * Created by bruno on 19/10/2016.
 */
public class Position {
    private int x, y;
    private Direction direction;


             	public Position(int x, int y, Direction direction) {
                    this.x = x;
        		this.y = y;
         		this.direction = direction;
         	}


           	public int getX() {
         		return x;
         	}


           	public void setX(int x) {
        		this.x = x;
         	}


        	public int getY() {
         		return y;
        	}


          	public void setY(int y) {
         		this.y = y;
        	}


           	public Direction getDirection() {
        		return direction;
        	}


          	public void setDirection(Direction direction) {
         		this.direction = direction;
         	}


            	public void setDirectionLeft() {
         		direction = direction.left();
        	}


             	public void setDirectionRight() {
        		direction = direction.right();
        	}
             	@Override
             	public String toString() {
                 		StringBuilder sb = new StringBuilder();
                	    sb.append(x);
                		sb.append(" ");
                 		sb.append(y);
                 		sb.append(" ");
                 		sb.append(direction);
                		return sb.toString();
                 	}

             }
