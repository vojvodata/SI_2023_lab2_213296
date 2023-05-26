package org.example;
import java.util.ArrayList;
import java.util.Arrays;
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

    public void setUsername(String username){
        this.username=username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }
}

public class SILab2 {
    public static boolean function (User user, List<User> allUsers) {
        if (user==null || user.getPassword()==null || user.getEmail()==null){ // 1
            throw new RuntimeException("Mandatory information missing!"); // 2 odi na kraj (exception)
        }

        if (user.getUsername()==null){ // 3 odi vo 4 ili 5
            user.setUsername(user.getEmail()); // 4 odi vo 5
        }

        int same = 1;
        if (user.getEmail().contains("@") && user.getEmail().contains(".")) { // 5
            same = 0; // 6 ode vo 7.1
            for (int i=0; i<allUsers.size(); i++) {// 7.1, 7.2, 7.3
                User existingUser = allUsers.get(i);
                if (existingUser.getEmail() == user.getEmail()) { // 8 vo 9 ili 10
                    same += 1; // 9
                }
                if (existingUser.getUsername() == user.getUsername()) { // 10 vo 11 ili 7.3
                    same += 1; // 11 vo 7.3
                }
            }
        }

        String specialCharacters="!#$%&'()*+,-./:;<=>?@[]^_`{|}";
        String password = user.getPassword();
        String passwordLower = password.toLowerCase();
        if (passwordLower.contains(user.getUsername().toLowerCase()) || password.length()<8) { // 12
            return false; // oznacuva kraj 13
        }
        else {
            if (!passwordLower.contains(" ")) { // 14
                for (int i = 0; i < specialCharacters.length(); i++) { // 15.1, 15.2, 15.3
                    if (password.contains(String.valueOf(specialCharacters.charAt(i)))) { // 16
                        return same == 0; // oznacuve kraj 17
                    }
                }
            }
        }
        return false; // oznacuva kraj 18
    } // kraj, tuka se nasoceni tie sho oznacuvaat kraj 19

}
