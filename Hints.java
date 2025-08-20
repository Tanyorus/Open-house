import java.util.Base64;

public class Hints {

    public static void easyHint() {
        String base64 = "VGhlIHdvdW5kIG9uIHRoZSByaWdodCBzaWRlIGlzIGltcG9ydGFudCBldmlkZW5jZS4=";
        String decoded = new String(Base64.getDecoder().decode(base64));
        System.out.println("""
                -------------------------------------------------- 
                %s
                --------------------------------------------------""".formatted(decoded));
    }

    public static void midHint() {
        String base64 = "VGhlIHdvdW5kIG9uIHRoZSByaWdodCBzaWRlIGlzIGltcG9ydGFudCBldmlkZW5jZS4=";
        String decoded = new String(Base64.getDecoder().decode(base64));
        System.out.println("""
                -------------------------------------------------- 
                %s
                --------------------------------------------------""".formatted(decoded));
    }
    

    public static void hardHint() {
        String base64 = "eWh1cUFuZ3l0ZnYgLS0gVGhpcyBpcyBub3QgdGhlIG5hbWUgb2YgbXVyZGVyZXItLQ==";
        String decoded = new String(Base64.getDecoder().decode(base64));
        System.out.println("""
                -------------------------------------------------- 
                %s
                --------------------------------------------------""".formatted(decoded));
    }
}
