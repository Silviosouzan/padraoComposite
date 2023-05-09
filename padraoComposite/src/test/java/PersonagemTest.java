import org.junit.Test;

import org.junit.Test;

public class PersonagemTest {

    @Test
    public void testExibirHabilidade() {
        // Criando alguns personagens
        Personagem guerreiro1 = new Guerreiro("Guerreiro 1", "Espada");
        Personagem guerreiro2 = new Guerreiro("Guerreiro 2", "Machado");
        Personagem mago1 = new Mago("Mago 1", "Fogo");
        Personagem mago2 = new Mago("Mago 2", "Gelo");

        // Criando algumas habilidades
        Habilidade bolaDeFogo = new BolaDeFogo();
        Habilidade furia = new Furia();

        // Adicionando personagens às habilidades
        bolaDeFogo.addPersonagem(mago1);
        bolaDeFogo.addPersonagem(mago2);
        furia.addPersonagem(guerreiro1);
        furia.addPersonagem(guerreiro2);

        // Exibindo as habilidades
        bolaDeFogo.exibir();
        furia.exibir();
    }
}
