package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais01 {
    public static void main(String[] args) {
        // 1, 2, 3, 4, 5
        // 31, 28, 31, 30 dias em cada mês
        int [][] dias = new int[3][3];    // isso são arrays multidimensionais

        dias [0][0] = 31;
        dias [0][1] = 28;
        dias [0][2] = 31;

        dias [1][0] = 24;
        dias [1][1] = 1;
        dias [1][2] = 78;

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[0].length; j++) {    //é interessante usar i porque eu não sei direito qual o tamanho
                System.out.println(dias[i][j]);
            }
        }
        System.out.println("---------------------");


//        //usando o foreach
//        for(int [] arrBase : dias){
//            for (int num : arrBase){
//                System.out.println(num);
//            }
//        }

    }
}
