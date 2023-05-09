public class Guerreiro extends Personagem {
    private String arma;

    public Guerreiro(String nome, String arma) {
        super(nome);
        this.arma = arma;
    }

    @Override
    public Object exibir() {
        System.out.println("Guerreiro " + nome + " com a arma " + arma);
        return null;
    }
}
