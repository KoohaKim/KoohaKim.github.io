package CodeUp;

import java.util.Scanner;

public class CodeUp4596 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int xIdx = 0;
        int yIdx = 0;


        int maxValue = 0;
        for (int row = 1; row <= 9; row++) {
            for (int col = 1; col <= 9; col++) {
                int now = sc.nextInt();
                if(maxValue < now){
                    maxValue = now;
                    xIdx = col;
                    yIdx = row;
                }

            }
        }
        System.out.println(maxValue);
        System.out.printf("%d %d\n", yIdx, xIdx);
    }
}
