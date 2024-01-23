package Testes;

public class MetodoReturnString {

	public static void main(String[] args) {
		String name[] = {"CARLOS", "EDUARDO", "DA", "COSTA", "XAVIER"};
		
		
		StringBuilder sb = new StringBuilder();
		for(String nameCompleted : name) {
			
			  sb.append(nameCompleted);
			  sb.append(" ");
			
		}
		System.err.println(sb.toString().trim());
		// Imprime a string, removendo espaços em branco extras no final
	}

}
