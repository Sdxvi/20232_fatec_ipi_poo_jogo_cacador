import java.util.Random;
public class Jogo {
    public static void main(String[] args) throws Exception {
        var gerador = new Random();
        var personagem = new Personagem();
        personagem.nome = "Kleiton";

        while(true){
            int oQueFazer = gerador.nextInt(3); //[0...3[
            switch(oQueFazer){
                case 0:
                    personagem.cacar();
                    break;
                case 1:
                    personagem.comer();
                    break;
                case 2:
                    personagem.dormir();
                    break;
            }
            System.out.printf(
            "e: %d, f: %d, s: %d \n", 
            personagem.energia,
            personagem.fome,
            personagem.sono
            );
            Thread.sleep(5000);
            System.out.println("******************");
        }
    }
}
