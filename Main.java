public class Main {

    public static int[][] MULTIPLICATION_TABLE;

    public static void main(String[] args) {
        //напишите тут ваш код
      MULTIPLICATION_TABLE = new int[10][10];
       for (int i = 0; i < 10; i++) {
           for (int j = 0; j < 10; j++) {
                MULTIPLICATION_TABLE[i][j] = (i + 1) * (j + 1);
            }


       }
        for(int i =0; i < 10; i++)  {
         for (int j = 0; j < 10; j++) {
        System.out.print(MULTIPLICATION_TABLE[i][j]+" ");
      }
        System.out.println();
     }
    }
}
