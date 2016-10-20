
/**
 * Created by bruno on 19/10/2016.
 */
public class Instruction {

     //metodo para percorrer a string do comando e processa-lo
	
	public Instruction(String comandos, Rover r1){
		for (int i = 0; i < comandos.length(); i++  ) {
			if (comandos.charAt(i) == 'L') {
				r1.left();
			} else if (comandos.charAt(i) =='R') {
				r1.right();
			} else if (comandos.charAt(i)=='M') {
				r1.move();
			} else {
				throw new IllegalArgumentException("Comando invalido");
			}
		}
	}
	public void imprimir(Rover r){
		System.out.println(r.getPosition());
	}
}

