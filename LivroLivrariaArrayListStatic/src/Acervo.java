import java.util.ArrayList;

public class Acervo {

	private static ArrayList<LivroLivraria> listaLivros = new ArrayList<>();

	// Método get
	public static ArrayList<LivroLivraria> getListaLivros() {
		return listaLivros;
	}

	// Método adicionar um objeto na lista
	static public void adicionar(LivroLivraria l) {
		listaLivros.add(l);
	}

	// Lista os dados de todos os objetos da lista
	public static String listar() {
		String saida = "";

		int i = 1;
		for (LivroLivraria l : listaLivros) {
			saida += "\n======= LIVRO Nº " + (i++) + "=======\n";
			saida += l.imprimir() + "\n";
		}
		return saida;
	}

	// pesquisar por gênero
	public static int pesquisar(String genero) {
		int qtd = 0;

		for (LivroLivraria l : listaLivros) {
			if (l.getGenero().equalsIgnoreCase(genero)) {
				qtd++;
			}
		}

		return qtd;
	}

	// pesquisar faixa de preço
	public static int pesquisar(double vInicial, double vFinal) {
		int qtd = 0;

		for (LivroLivraria l : listaLivros) {
			if (l.getPreco() >= vInicial && l.getPreco() <= vFinal) {
				qtd++;
			}
		}

		return qtd;
	}

	// Remove um titulo pelo título
	public static boolean remover(String titulo) {
		for (LivroLivraria l : listaLivros) {
			if (l.getTitulo().equalsIgnoreCase(titulo)) {
				listaLivros.remove(l);
				return true;
			}
		}
		return false;
	}

	//total acervo
	static double calcularTotalAcervo() {
		double total = 0;
		
		for(LivroLivraria l : listaLivros) {
			total += l.getPreco();
		}
		
		return total;
	}
	
}
