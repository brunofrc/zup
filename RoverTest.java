 // classe com build de teste JUnit
 import org.junit.Test; 
 
 
 public class RoverTest { 
 

     @Test 
     public void canTurnLeft() { 
         //Entrada
         Plateau plateau = new Plateau(5,5); 
         Position p1 = new Position(1,2,Direction.N);
         Rover r1 = new Rover(p1, plateau); 
         //Execu��o
         r1.left(); 
 
         //sa�da
         System.out.println(r1.getPosition());
     } 
     
     @Test 
     public void canTurnRight() { 
         //Entrada
         Plateau plateau = new Plateau(5,5); 
         Position p1 = new Position(1,2,Direction.N);
         Rover r1 = new Rover(p1, plateau); 
         //Execu��o
         r1.right(); 
 
         //sa�da
         System.out.println(r1.getPosition());
     } 
     @Test 
     public void canMove() { 
         //Entrada
         Plateau plateau = new Plateau(5,5); 
         Position p1 = new Position(1,2,Direction.N);
         Rover r1 = new Rover(p1, plateau); 
         //Execu��o
         r1.move(); 
 
         //sa�da
         System.out.println(r1.getPosition());
     } 
     @Test 
     public void canGoLeft() { 
         //Entrada
         Plateau plateau = new Plateau(5,5); 
         Position p1 = new Position(1,2,Direction.N);
         Rover r1 = new Rover(p1, plateau);
         
         //Execu��o
         Instruction i = new Instruction("L",r1);
 
         //sa�da
         i.imprimir(r1);
     } 
     @Test 
     public void canGoRight() { 
         //Entrada
         Plateau plateau = new Plateau(5,5); 
         Position p1 = new Position(1,2,Direction.N);
         Rover r1 = new Rover(p1, plateau); 
         //Execu��o
         Instruction i = new Instruction("R",r1);
 
         //sa�da
         i.imprimir(r1);
     }      @Test 
     public void canGoAhead() { 
         //Entrada
         Plateau plateau = new Plateau(5,5); 
         Position p1 = new Position(1,2,Direction.N);
         Rover r1 = new Rover(p1, plateau); 
         //Execu��o
         Instruction i = new Instruction("M",r1);
 
         //sa�da
         i.imprimir(r1);
     } 
 }
