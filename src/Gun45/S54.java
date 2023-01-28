package Gun45;

public class S54 {
    public static void main(String[] args) {
        int cnt=0;
        String[][] arr = {
                {"A", "B", "C"},
                {"D", "E"}
        };

        for (int i = 0; i < arr.length; i++) { // 0 1

            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " "); // A B

                if (arr[i][j].equals("B")) {
                    break;
                }
            }

            continue;// etkisi yok
            // çünkü kendisinden sonra gelen kod yok
        }
    }
}
// ABDE