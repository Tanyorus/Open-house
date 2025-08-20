public class HardII {
    public static void main(String[] args) {
        int J = 0 ;
        for (int i = 0; i < 2 ; i++){
            for(int j = 0 ; j >= 0 ; j++){
                System.out.println("Nested" + i + ","+ j);
                J++;
            }
        }
        if(J>=0){
            System.out.println("\nHere is your hint :");
            Hints.hardHint();
        }

    }
}
//แก้เงื่อนไขให้ถูกต้อง