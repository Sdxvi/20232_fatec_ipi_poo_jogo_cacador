public class Personagem{
    //atributos ou propriedades
    private String nome;
    private int energia=10;
    private int fome = 0;
    private int sono = 0;


    //Construtor Padrão tem a lista de parâmetros vazia, viabilizando a construção de New sem parametros
    Personagem(String nome){
        this.nome = nome;
    }

    Personagem(String nome, int energia, int fome, int sono){
        this.nome = nome;
        if (energia >= 0 && energia <= 10) this.energia = energia;
        if (fome >= 0 && fome <=10) this.fome = fome;
        if (sono >= 0 && sono <= 10) this.sono = sono;
    }

    //comportamentos (métodos)
    void cacar(){
        if(energia >= 2){
            System.out.println(nome + " cacando . . .");
            energia -= 2; //energia = energia - 2
        }
        else{
            System.out.println(nome + " sem energia para caçar . . .");
        }
        fome = Math.min(fome + 1, 10);
        sono = Math.min(sono + 1, 10);
    }

    void comer(){
        if(fome >= 1){
        System.out.println(nome + " comendo . . .");
        fome -= 1;
        energia = energia + 1 > 10 ? 10 : energia + 1; //Operador ternário, caso energia + 1 seja maior que 10, energia vai receber 10, caso contrário recebe energia + 1
        }
        else{
            System.out.println(nome + " ta de buxo cheio já.");
        }
    }

    void dormir(){
        if(sono >= 1){
        System.out.println(nome + " nanando . . .");
        sono -= 1;
        energia = Math.min(energia + 1, 10);
        }
        else{
            System.out.println(nome + " sem sono.");
        }
    }

    void exibirEstado(){
        System.out.printf("%s: e: %d, f: %d, s: %d\n", nome, energia, fome, sono);
    }

}