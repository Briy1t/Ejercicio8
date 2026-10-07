public class Ejercicio8 {
    static void main() {
        int file = 10;
        int column= 10;

        int[][] matriz =new int[file][column];

        for(int f = 0; f <file; f++){
            for (int c=0; c < column ; c++){

                if (f ==0 && c ==4){
                    matriz[f][c] = 8;
                }else if (f ==2 && c ==6){
                    matriz[f][c] = 8;
                }else if (f ==3 && c ==1){
                    matriz[f][c] = 8;
                }else if (f ==8 && c ==6){
                    matriz[f][c] = 8;
                }else {
                    matriz[f][c] = 0;
                }
            }
        }

        for (int f = 0; f < file; f++){
            for(int c = 0; c < column; c++){

                if (matriz[f][c] == 8) {
                    System.out.print(" 8 ");
                } else {
                    System.out.print(" | ");
                }
            }
            System.out.println();
        }
    }
}
