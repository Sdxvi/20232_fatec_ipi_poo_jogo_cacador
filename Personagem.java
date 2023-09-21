public class Personagem{
    //atributos ou propriedades
    String nome;
    int energia;
    int fome;
    int sono;

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

}