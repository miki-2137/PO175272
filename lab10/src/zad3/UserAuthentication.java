package zad3;

public class UserAuthentication implements Authentication{
    @Override
    public boolean login(String username, String password) {
        return true;
    }

    @Override
    public void logout() {
        System.out.println("Zostałeś wylogowany");
    }

    @Override
    public boolean resetPassword(String username, String oldPassword, String newPassword) {
        return true;
    }
}
