import java.util.Scanner;

public class MultiArray {
    public static void main(String[] args) {
        int[][] array = new int[3][3];
        int i = 0, j = 0;
        Scanner scan = new Scanner(System.in);
        while (i < array.length) {
            j = 0;
            while (j < array[i].length) {
                System.out.println("Podaj liczbę " + i + " : " + j);
                array[i][j] = scan.nextInt();
                j++;
            }
            i++;
        }

        int biggestRow = 0;
        int biggestRowIndex = -1;
        i = 0;
        while (i < array.length) {
            int currentRowSum = 0;
            j = 0;
            while (j < array[i].length) {
                currentRowSum += array[i][j];
                j++;
            }
            if (currentRowSum > biggestRow) {
                biggestRow = currentRowSum;
                biggestRowIndex = i;
            }
            i++;
        }
        if(biggestRowIndex != -1)
            System.out.println("Największa suma liczb jest w wierszu " + (biggestRowIndex + 1));
    }
}
