package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >= 18;

        // !

        if(isAutorizadoComprarBebida){   //o if sempre precisa retornar um true ou false
            System.out.println("Autorizado a comprar Bebida Alcólica");
        }else{
            System.out.println("Não foi autorizado a comprar bebida alcólica");
        }
        if(!isAutorizadoComprarBebida){
            System.out.println("Não foi autorizado a comprar bebida alcólica");
        }
            ;
    }
}
