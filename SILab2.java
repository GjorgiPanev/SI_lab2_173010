import java.util.List;

class User {
    String username;
    String password;
    String email;

    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }
}

public class SILab2 {

    public boolean function (User user, List<String> allUsers) { //1
        if (user==null) { //2
            throw new RuntimeException("The user argument is not initialized!"); //3
        } //4
        else { //5
            if (user.getUsername()==null || allUsers.contains(user.getUsername())) { //6
                throw new RuntimeException("User already exists!"); //7
            } //8
            else {  //9
                if (user.getEmail()==null) //10
                    return false; //11
                boolean atChar = false, dotChar = false; //12
                for (int i=0;i<user.getEmail().length();i++) { //13.1 13.2 13.3
                    if (user.getEmail().charAt(i)=='@') //14
                        atChar = true; //15
                    if (atChar && user.getEmail().charAt(i)=='.') { //16
                        dotChar = true; //17
                    } //18
                } //19
                if (!atChar || !dotChar) { //20
                    return false; //21
                } //22
            } //23
        } //24
        return true; //25
    } //26
}
