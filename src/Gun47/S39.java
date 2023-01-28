package Gun47;

public class S39 {
    public static void main(String[] args) {
        String shirts[][] = new String[2][2];
        shirts[0][0] = "red";
        shirts[0][1] = "blue";
        shirts[1][0] = "small";
        shirts[1][1] = "medium";

        // a)  medium:
        for (int index = 1; index < 2; index++) {
            for (int idx = 1; idx < 2; idx++) {
                System.out.println(shirts[index][idx] + ":");
            }
        }

        // b)  small
        for (int index = 0; index < 2; ++index) {
            for (int idx = 0; idx < index; ++idx) {   // 0 çalışmaz , 1 de sadece 10 çalışır
                System.out.println(shirts[index][idx] + ":");
            }
        }

//        ++index;
//        index++;
//        a=a+ index++; burda önce işlem sonra artış
//        a=a+ ++index; burda önce artış sonra işlem

         //  c) doğru cevap hepsini yazar
        for (String[] c : shirts) {  // shirts içindeki satırları al c ismini ver ve döngüye gönder
            for (String s : c) { // satırdaki elemanları al s adını vererek döngüye gönder
                System.out.println(s + ":");
            }
        }


        // d) 2 sınır index değerini aştığı için RunTime hatası verir
        for (int index = 0; index <= 2; ) {
            for (int idx = 0; idx <= 2; ) {
                System.out.println(shirts[index][idx] + ":"); // 02 de patlar
                idx++;
            }
            index++;
        }


    }
}
