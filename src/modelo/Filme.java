package modelo;
import calculos.Classificavel;
import modelo.Titulo;

public class Filme extends Titulo implements Classificavel {
	private String diretor;
	private int tempo;
	
	public Filme() {
		super();
	}
	
	public Filme(String nome, int anoDeLancamento, int tempo) {
		super(nome, anoDeLancamento);
		this.tempo = tempo;
	}
	
	public int getTempo() {
		return tempo;
	}

	public void setTempo(int tempo) {
		this.tempo = tempo;
	}



	public String getDiretor() {
		return diretor;
	}

	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}

	@Override
	public int getClassificacao() {
		return (int) pegaMedia() / 2;
	}

	@Override
	public String toString() {
		return "Filme: " + this.getNome() + " (" + this.getAnoDeLancamento() + ")";
	}

}
