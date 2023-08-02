package principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import modelo.Filme;
import modelo.Serie;
import modelo.Titulo;

public class PrincipalComLista {
	public static void main(String[] args) {
        Filme meuFilme = new Filme("O Poderoso Chefão", 1970, 100);
        meuFilme.avalia(6);
        Filme outroFilme = new Filme("Avatar" , 2023, 100);
        outroFilme.avalia(9);
        Filme filme1 = new Filme("Toy Story", 2005, 110);
        filme1.avalia(10);
        Serie lost = new Serie("Lost", 2000);
        
        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(filme1);
        lista.add(lost);
        
        for (Titulo item : lista) {
			System.out.println(item.getNome());
			if (item instanceof Filme) {
				Filme filme = (Filme) item;
				System.out.println("Classificação: " + filme.getClassificacao());
			}
		}
        
        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Gabriel");
        buscaPorArtista.add("Adam");
        buscaPorArtista.add("Neymar");
        System.out.println(buscaPorArtista);
        
        Collections.sort(buscaPorArtista);
        System.out.println(buscaPorArtista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        
	}

}
