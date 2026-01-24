package ex_17_OOPs;

public class LoginPage {

    LoginPage(){
        System.out.println("DC");
    }

    public LoginPage(String email,String password) {
        this.email = email;
        this.password = password;
    }

    String email;

    public LoginPage(String email, String password, String submitButton) {
//        this.email = email;
//        this.password = password;
        this(email,password); //Constructor Chaining
        this.submitButton = submitButton;
    }

    String password;
    String submitButton;
}
