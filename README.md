# stone-desafio
programa-exilir

Código escrito em Java;
Foram criadas duas classes Desafio (main), Classe Item;

______________________________________________________
    LISTAS CRIADA NO CÓDIGOS

    itens.add(new Item("Picanha", 3, 40));
		itens.add(new Item("Linguiça", 2, 25));
		itens.add(new Item("Alcatra", 2, 45));
		itens.add(new Item("Aza", 5, 10));
		itens.add(new Item("Contra-filé", 5, 30));
		

		emails.add("barbara@gmail.com");
		emails.add("diego_jr@homail.com");
		emails.add("djanir_ribeiro@uol.com");

_______________________________________________________

O valor final da lista acima é 460, foi encontrado através do FOR.



FOI UTILIZADO O METODO COMPUTE PARA ALTERAR O MEU HASHMAP.

for (String email : emails) {

			valoresPagConta.put(email, divSobra);
			novoValor = valoresPagConta.compute("barbara@gmail.com", (key, value) -> divSobra + totalSobra);

		}
    
    VALOR FINAL RETORNADO: Valor dividido :  {diego_jr@homail.com=153, djanir_ribeiro@uol.com=153, barbara@gmail.com=154}
