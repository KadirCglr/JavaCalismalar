package Gun46;

public class S17 {
    public static void main(String[] args) {
        //*** tek boyutlularda yöntem aynı ilk oluşturma anında {} değer ataması yapılabilir
        //*** sonrasında {} atamak için new int[] kullanılmalı
        int[] dizi1=new int[]{2,5,6,7};
        int[] dizi={2,5,6,7}; // 4 elemnalıydı
        dizi=new int[]{1,2,3,4,5,6,7,77}; // 8 elemanlı

        int [][] tablo = {
                {3, 25,55},
                {234,22,33}
        };

        //*** 2 boyutlularda durum aynı
        int[][] arr= new int[2][40];  // 2.boyut yani sutun aşağıda yeniden boyutlandırılıyor

        arr[0] = new int[]{1,3,5,7};  // satir 0   ; bu satırı yeniden oluşturuyor
        arr[1] = new int[]{1,3};      // satir 1   ; bu satırı yeniden oluşturuyor

//
//        for (int i = 0; i < arr.length; i++) {
//
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j]+" ");
//            }
//
//            System.out.println();
//        }

        System.out.println("******");

        for(int[] satir: arr) // arr SATIRLARDAN oluşuyor arr[0] , arr[1]
        {

            for(int eleman : satir){
                System.out.print(eleman+" ");
            }

            System.out.println();
        }


    }
}














