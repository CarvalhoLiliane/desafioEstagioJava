package desafio;

import java.util.HashMap;
import java.util.Map;

public class DesafioTeste {

	public static void main(String[] args) {
		//toLowerCase para ignorar letras maiusculas
		System.out.println(frangoComBatataDoce("Desenvolvimento".toLowerCase()));
	}

	//recebe o nome a ser compactado
	static String frangoComBatataDoce(String name) {
		//criando mapa que ir� armazenar as letras e as contagens
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		//dividindo a palavra num vetor de letras
		String[] listaDeLetras = name.split("");
		
		// iterando sobre o vetor de letras e inicializando cada chave do mapa com o valor 0, para evitar nullpointer
		for (String letraUsadaComoChave : listaDeLetras) {
			map.put(letraUsadaComoChave, 0);
		}
		
		//iterando sobre o vetor de letras e contando a ocorr�ncia de cada letra
		for (String letraUsadaComoChave : listaDeLetras) {
			//cada letra vai ser usada como chave do mapa, e o valor da chave ser� o valor adicionando anteriormente +1
			map.put(letraUsadaComoChave, map.get(letraUsadaComoChave) + 1); // adicionar dentro da chave letra, o valor que ela j� tem + 1
		}
		
		//stringBuilder para concatenar o resultado
		StringBuilder nomeCompacto = new StringBuilder();
		
		//iterando sobre o vetor de letras para concatenar as letras com o n�mero de vezes que elas ocorreram
		for (String letraUsadaComoChave : listaDeLetras) {
			//s� concatena a letra se ela j� n�o tiver sido concatenada antes.
			if (!nomeCompacto.toString().contains(letraUsadaComoChave))
				//concatenando a letra com o n�mero de vezes que ela ocorreu
				nomeCompacto.append(letraUsadaComoChave).append(map.get(letraUsadaComoChave));
		}

		return nomeCompacto.toString();
	}
}
