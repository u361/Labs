import java.util.*;

public class text {


    static int[][] getMatrix(int length, int stolbi) {
        int i, j;
        Random rand = new Random();
        int[][] mat = new int[length][stolbi];
        for (i = 0; i < stolbi; i++) {
            int[] z = new int[length];
            for (j = 0; j < length; j++) {
                z[j] = rand.nextInt(199) - 99;
                mat[i] = z;
            }
        }
        return mat;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 0;
        int j = 0;
        int length, stolbi;
        System.out.print("enter length: ");
        length = scan.nextInt();
        System.out.print("enter stolbi: ");
        stolbi = scan.nextInt();
        int[][] mat = getMatrix(length, stolbi);
        int tmp = 0;
        int x = stolbi - 1;
        int p = length - 1;
        int q = length - 1;
        int[][] mat2 = new int[length][stolbi];

        System.out.println();
        for (int[] o : mat)
            System.out.println(Arrays.toString(o));

        for (i = 0; i < length; i++) {
            for (j = 0; j < stolbi; j++) {
                mat2[i][j] = mat[i][j];
            }
        }

        System.out.println();
        for (int[] o : mat2)
            System.out.println(Arrays.toString(o));
        for (i = 0; i < length - 1; i++, stolbi--) {
            p = q;
            for (j = 0; j < stolbi - 1; j++, p--) {
                tmp = mat2[i][j];
                mat2[i][j] =
                        mat2[p][x];
                mat2[p][x] = tmp;
            }
            x--;
        }
        System.out.println();
        for (int[] o : mat2)
            System.out.println(Arrays.toString(o));

    }
}

