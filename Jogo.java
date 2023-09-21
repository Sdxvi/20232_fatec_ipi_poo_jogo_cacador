public class Jogo {
    public static void main(String[] args) throws Exception {
        var personagem = new Personagem();
        personagem.nome = "Kleiton";
        while(true){
            personagem.cacar();
            personagem.comer();
            personagem.dormir();
            Thread.sleep(5000);
            System.out.println("******************");
        }
    }
}
