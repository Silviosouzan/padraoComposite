public class Mago extends Personagem {
    private String magia;

    public Mago(String nome, String magia) {
        super(nome);
        this.magia = magia;
    }

    @Override
    public Object exibir() {
        System.out.println("Mago " + nome + " com a magia " + magia);
        return null;
    }
}
