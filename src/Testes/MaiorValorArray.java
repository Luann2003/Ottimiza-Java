package Testes;

public class MaiorValorArray {

	public static void main(String[] args) {
		
		int numbers[] = {334, 568, 123, 796, 225};
		int maior = 0;
		
		
		for(int lista : numbers) {
			if(maior > lista) {
				
			}else {
				maior = lista;
			}
		}
		System.err.println("O maior valor é: " + maior);

	}

}
