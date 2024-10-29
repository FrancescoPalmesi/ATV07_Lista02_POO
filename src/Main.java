public class Main {
    public static void main(String[] args) {
        Animal gato = new Gato();
        Animal cachorro = new Cachorro();
        Animal cavalo = new Cavalo();
        Animal leao = new Leao();
        Animal boi = new Boi();

        gato.emitirSom();
        cachorro.emitirSom();
        cavalo.emitirSom();
        leao.emitirSom();
        boi.emitirSom();
    }
}
