package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {

        // prefiro essa lógica pra criar arrayz multidimensionais

        int[][] arrayInt = new int[3][];
        arrayInt[0] = new int[]{35, 56};
        arrayInt[1] = new int[]{1, 2, 3};
        arrayInt[2] = new int[]{1, 2, 3, 4, 87, 42};


        //outra forma de incializar um array
        int [][] arrayInt2 = {{0, 0}, {0, 6, 34}, {0, 7, 8, 9, 5, 3}};


        //usando o foreach para printar os valores de um
        for(int[] arrayBase : arrayInt2){
            System.out.println("\n------------");
            for (int num : arrayBase){
                System.out.println(num);
            }
        }

    }
}
