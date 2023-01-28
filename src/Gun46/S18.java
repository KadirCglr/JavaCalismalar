package Gun46;

public class S18 {
    public static void main(String[] args) {

        String[][] chs=new String[5][2];  // 5 satır her satır 2 elemandan oluşuyor
        chs[0]=new String[4]; // 0,1,2,3
        chs[1]=new String[5];
        int i=97;

        System.out.println("chs.length = " + chs.length);
        System.out.println("chs[0].length = " + chs[0].length); // 0.Satır uzunluğu
        System.out.println("chs[1].length = " + chs[1].length); // 1.Satır uzunluğu
        System.out.println("chs[2].length = " + chs[2].length); // 2.Satır uzunluğu
        System.out.println("chs[3].length = " + chs[3].length); // 3.Satır uzunluğu
        System.out.println("chs[4].length = " + chs[4].length); // 4.Satır uzunluğu

        for (int a=0;a< chs.length;a++){  // 5  a: 0,1,2,3,4
            for (int b=0; b< chs.length;b++){  //b:  chs[a].length olmalı: 5,4,2,2,2
                chs[a][b]=""+i; // 00 -> 44  // 0.Satırın 4 elemanı  yok
                i++;
            }
        }

        for (String[] ca:chs){
            for (String c:ca){
                System.out.println(c+" ");
            }
            System.out.println();
        }

    }
}
