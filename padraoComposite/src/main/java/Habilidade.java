import java.util.ArrayList;
import java.util.List;

public abstract class Habilidade extends Personagem {
    private List<Personagem> personagens = new ArrayList<>();

    public Habilidade(String nome) {
        super(nome);
    }

    public void addPersonagem(Personagem personagem) {
        personagens.add(personagem);
    }

    public void removePersonagem(Personagem personagem) {
        personagens.remove(personagem);
    }

    public Object exibir() {
        System.out.println("Habilidade " + nome + ":");
        for (Personagem personagem : personagens) {
            personagem.exibir();
        }
        System.out.println();
        return null;
    }
}
