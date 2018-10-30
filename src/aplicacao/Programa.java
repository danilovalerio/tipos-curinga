package aplicacao;

import java.util.Arrays;
import java.util.List;

public class Programa {

	public static void main(String[] args) {
		List<Integer> myInts = Arrays.asList(5, 2, 10);
		printList(myInts);
		
		List<String> myStrings = Arrays.asList("Jo�o", "Maria", "Antonio");
		printList(myStrings);
	}
	
	/* 
	 * ? (interrogac�o) � quem determina o tipo curinga
	 * Veja no m�todo printList abaixo que com o mesmo podemos
	 * imprimir qualquer tipo de lista 
	 */
	public static void printList(List<?> list) {
		for (Object obj : list) {
			System.out.println(obj);
		}

	}

}
