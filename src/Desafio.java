import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Desafio {

	  public static void main(String[] args) {
		  
		  List<Item> itens = new ArrayList<>();
		
		  
		itens.add(new Item("Picanha", 1, 4));
		  itens.add(new Item("Linguiça", 1, 3 ));
		  
		    List<String> emails = new ArrayList<>();
		    
		    emails.add("barbara@gmail.com");
		    emails.add("diego_jr@homail.com");
		    emails.add("djanir_ribeiro@uol.com");
		    
		    
		    Map<String, Integer> resultado = Desafio.calcula(itens, emails);
		    System.out.println( resultado); // printa o resultado
		  }

	private static Map<String, Integer> calcula(List<Item> itens, List<String> emails) {
		int qtdParticipantes = emails.size();
		int somaValores = 0;
		
				
		for(int indice = 0; indice < emails.size() -1 ; indice++) {
			
			somaValores += (itens.get(indice).getQuantidade() * itens.get(indice).getPreco());
			
		}
		
		int divSemSobra = somaValores / qtdParticipantes;
		int divSObra = somaValores % qtdParticipantes;
		
		Map<String, Integer> valoresPagConta = new HashMap<String, Integer>();
		for(String email : emails ) {
			valoresPagConta.put(email, divSemSobra);
		}
			
		return valoresPagConta;
	}
	
		}
