package at.ac.fhcampuswien;

public class PasswordValidator {
    public boolean isValid(String password){
        return password.length() >= 5 && password.length() <= 10;
    }

    public String showMessage(boolean passwordIsValid){
        if(passwordIsValid){
            return "Login successful!";
        } else {
            return "Login failed. Password not valid.";
        }
    }
}


