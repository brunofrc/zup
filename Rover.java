

package com.example.bruno.zup;

/**
 * Created by bruno on 19/10/2016.
 */
public class Rover  {
         	private Position position;
         	private Plateau plateau;

         		

                 	public Position getPosition() {
            		return position;
            	}

                	public void setPosition(Position position)
                    {this.position = position;
                    
             	}


                 	public Rover()
                    {this.position = position;
                    
             		this.position = position;
             		//this.setPlateau(plateau);
            	}


                 	public void left() {
             		position.setDirectionLeft();
            	}


                 	public void right() {
            		position.setDirectionRight();
             	}


                 	public void move() {
            	switch (position.getDirection()) {
                 		case N:
                 			   if(position.getY()<= plateau.getY())
                     			position.setY(position.getY() + 1);
                     			break;
                 		case E:
                 				if(position.getY()<= plateau.getX())
                    			position.setX(position.getX() + 1);
                     			break;
                		case W:
                				if(position.getY()<= plateau.getX())
                     			position.setX(position.getX() - 1);
                     			break;
                 		case S:
                 				if(position.getY()<= plateau.getY())
                     			position.setY(position.getY() - 1);
                     			break;
                        default:
                            throw new IllegalArgumentException(" Comando nao valido!");
                }
             	
                 	}

					public Plateau getPlateau() {
						return plateau;
					}

					public void setPlateau(Plateau plateau) {
						this.plateau = plateau;
					}

					
}

         


