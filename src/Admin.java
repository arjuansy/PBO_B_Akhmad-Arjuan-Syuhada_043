public class Admin {
    String username = "Admin043";
    String password = "Password043";

    public boolean login (String inputUsername, String inputPassword) {
        return inputUsername.equals(username) && inputPassword.equals(password);
    }
}
