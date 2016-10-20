 // classe com build de teste JUnit
 import org.junit.Test; 
 
 
 public class RoverTest { 
 

     @Test 
     public void canTurnLeft() { 
         //Entrada
         Plateau plateau = new Plateau(5,5); 
         Position p1 = new Position(1,2,Direction.N);
         Rover r1 = new Rover(p1, plateau); 
         //Execução
         r1.left(); 
 
         //saída
         System.out.println(r1.getPosition());
     } 
     
     @Test 
     public void canTurnRight() { 
         //Entrada
         Plateau plateau = new Plateau(5,5); 
         Position p1 = new Position(1,2,Direction.N);
         Rover r1 = new Rover(p1, plateau); 
         //Execução
         r1.right(); 
 
         //saída
         System.out.println(r1.getPosition());
     } 
     @Test 
     public void canMove() { 
         //Entrada
         Plateau plateau = new Plateau(5,5); 
         Position p1 = new Position(1,2,Direction.N);
         Rover r1 = new Rover(p1, plateau); 
         //Execução
         r1.move(); 
 
         //saída
         System.out.println(r1.getPosition());
     } 
     @Test 
     public void canGoLeft() { 
         //Entrada
         Plateau plateau = new Plateau(5,5); 
         Position p1 = new Position(1,2,Direction.N);
         Rover r1 = new Rover(p1, plateau);
         
         //Execução
         Instruction i = new Instruction("L",r1);
 
         //saída
         i.imprimir(r1);
     } 
     @Test 
     public void canGoRight() { 
         //Entrada
         Plateau plateau = new Plateau(5,5); 
         Position p1 = new Position(1,2,Direction.N);
         Rover r1 = new Rover(p1, plateau); 
         //Execução
         Instruction i = new Instruction("R",r1);
 
         //saída
         i.imprimir(r1);
     }      @Test 
     public void canGoAhead() { 
         //Entrada
         Plateau plateau = new Plateau(5,5); 
         Position p1 = new Position(1,2,Direction.N);
         Rover r1 = new Rover(p1, plateau); 
         //Execução
         Instruction i = new Instruction("M",r1);
 
         //saída
         i.imprimir(r1);
     } 
 }
