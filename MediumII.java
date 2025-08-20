public class MediumII {
    public static void main(String[] args) {
        int j = 0; 
        while (j < 3){
            System.out.println("HI"+j);
            j--;
        }
        if(j < 4){
            System.out.println("\nHere is your hint :");
            Hints.midHint();
        }
    }
}

//ทำให้ Loop ทำงานให้ถูกต้อง