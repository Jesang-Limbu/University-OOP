/* Java Programming - Joyce Farrell
   Chapter 1 Exercise 9
*/

public class Triangle {
    public static void main(String args[]) {
        int rows = 7;
        for (int i=0; i<rows;i++) {
            for (int j=rows-1;j>i;j--) {
                System.out.print(" ");
            }
            int repeat_t = (2*i)+1;
            for (int k=0;k<repeat_t;k++) {
                System.out.print("T");
            }
            System.out.println();
        }
    }
}
