    import java.util.Scanner;
public class Login {
    public static void main(String[] args) {
        String userName, password;
        Scanner inp = new Scanner(System.in);

        System.out.println("Kullanıcı Adınız:");
        userName = inp.nextLine();
        System.out.println("Şifreniz :");
        password = inp.nextLine();

        if(userName.equals("Mert") && password.equals("mert1999"))
            System.out.println("Giriş başarılı");
        else
            System.out.println("Kullanıcı adı veya şifre yanlış");


    }
}
