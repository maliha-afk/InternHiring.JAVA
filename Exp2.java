import javax.security.auth.login.LoginContext;
public class Exp2 {
    public static void Checkage(int age) throws IllegalArgumentException {
            if (age < 18) {
                throw new IllegalArgumentException("Age must be 18 or older");
            }else {
                System.out.println("Age is valid: " + age);
            }
        
}
    public static void main(String[] args) {
        try {
            Checkage(19);
        }catch(Exception e) {
            System.out.println( e);
        }
    }
}