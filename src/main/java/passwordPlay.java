import org.mindrot.jbcrypt.BCrypt;
import java.util.Scanner;

public class passwordPlay {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please create a new password");
        String password = sc.nextLine();

        String hash = BCrypt.hashpw(password, BCrypt.gensalt());

        System.out.println("Enter your Password for verification.");
        String pwVerification = sc.nextLine();
        boolean answer = BCrypt.checkpw(pwVerification, hash);
        System.out.println("answer = " + answer);

    }




}
