import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Desafio {

	public static void main(String[] args) {

		List<Item> itens = new ArrayList<Item>();
		List<String> emails = new ArrayList<String>();

		itens.add(new Item("Picanha", 1, 100));

		

		emails.add("barbara@gmail.com");
		emails.add("diego_jr@homail.com");
		emails.add("djanir_ribeiro@uol.com");

	

		Map<String, Integer> resultado = Desafio.calcula(emails, itens);
		System.out.println("Valor dividido : " + " " + resultado); // printa o resultado
	}

	private static Map<String, Integer> calcula(List<String> emails, List<Item> itens) {

		int somaValores = 0;

		for (int indice = 0; indice < itens.size(); indice++) {
			somaValores += (itens.get(indice).getQuantidade() * itens.get(indice).getPreco());

		}

		int divSobra = somaValores / emails.size();

		int divSemsobra = divSobra * emails.size();
		int totalSobra = somaValores - divSemsobra;

		Map<String, Integer> valoresPagConta = new HashMap<String, Integer>();

		int novoValor;
		for (String email : emails) {

			valoresPagConta.put(email, divSobra);
			novoValor = valoresPagConta.compute("barbara@gmail.com", (key, value) -> divSobra + totalSobra);

		}

		return valoresPagConta;
	}

}
