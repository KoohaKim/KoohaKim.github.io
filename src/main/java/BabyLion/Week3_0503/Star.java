package BabyLion.Week3_0503;

public class Star {
    public static void main(String[] args) {

        int starNum = 5;

        for(int i=1;i<=starNum;i++){             //1<5   //2<5,  2<5     //3<5
            for(int j=0;j<i;j++){               //0<1   //0<2,  1<2     //4<5
                System.out.print("*");          // *    //**
            }        System.out.println("");    //줄띄움 //줄띄움

        }

    }
}