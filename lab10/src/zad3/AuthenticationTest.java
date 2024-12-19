package zad3;

public class AuthenticationTest {
    public static void main(String[] args) {
        UserAuthentication u1 = new UserAuthentication();
        AdminAuthentication a1 = new AdminAuthentication();
        System.out.println(u1.login("user1","haslo123"));
        u1.logout();
        a1.logout();
        System.out.println(a1.resetPassword("admin1","Adm1nHasl0","yrWvHDh7%KcZbuFw6os%vrtVv"));
    }
}
