// classe simulando execução
public class Teste {

	public static void main(String[] args) {
		
		//entrada das coordenadas de Plateau
		Plateau p = new Plateau(5,5);
		
		//entrada da posição do primeiro e segundo rover
		Position p1 = new Position(1,2,Direction.N);
		Position p2 = new Position(3,3,Direction.E);
		
		//atribuição da posição ao rover 1 e 2 e seus plateau
		Rover r1 = new Rover(p1,p);
		Rover r2 = new Rover(p2,p);
		
		//processa a instrução de entrada
		Instruction i1 = new Instruction("LMLMLMLMM",r1);
		Instruction i2 = new Instruction("MMRMMRMRRM",r2);
		
		//saída mostra as cooredenadas finais do rover
		i1.imprimir(r1);
		i2.imprimir(r2);
		
		
}
}
