package desafio;

import java.util.HashMap;
import java.util.Map;

public class ExibirValor {
	public static void main(String[] args) {
		Map<String, Integer> pessoa = new HashMap<>();
		
		pessoa.put("Liliane ", 39);
		pessoa.put("Sergio ", 40);
		pessoa.put("Ilanna ", 20);
		pessoa.put("Raphael ", 31);
		
		System.out.println("Liliane tem "+ pessoa.get("Liliane") + " anos de idade.");
		System.out.println("Raphael tem "+ pessoa.get("Raphael") + " anos de idade.");
		System.out.println("Ilanna tem "+ pessoa.get("Ilanna") + " anos de idade.");
		System.out.println("Sergio tem "+ pessoa.get("Sergio") + " anos de idade.");
		System.out.println();
		
		for(String pessoas: pessoa.keySet()) {
			System.out.println("Chave ->" + pessoas);
		}
		System.out.println();
		for(Integer pessoas: pessoa.values()) {
			System.out.println("Valor -> " + pessoas);
		}
		
		System.out.println();
		System.out.println(pessoa.size());
		
		
		String keyTSearch = "Camila";
		
		if(pessoa.containsKey(keyTSearch)) {
			System.out.println("Valor da chave " + keyTSearch + " = " + pessoa.get(keyTSearch));
		}else {
			System.out.println("Chave não existe");
		}
		
		
		System.out.println(pessoa.keySet()); // pega chave
		System.out.println(pessoa.values()); // pega valor
		System.out.println(pessoa.entrySet()); // pega os dois ao mesmo tempo
	}
	
}
