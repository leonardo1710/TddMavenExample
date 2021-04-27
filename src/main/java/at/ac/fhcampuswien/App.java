package at.ac.fhcampuswien;

import java.util.ArrayList;

public class App {
    public static void main(String[] args){
        PasswordValidator pw = new PasswordValidator();

        pw.savePassword("pass1");
        pw.savePassword("pass2");

        ArrayList<String> passwords = pw.getSavedPasswords();

        for(String p : passwords){
            System.out.println(p);
        }

        String passAt = pw.findPasswordAtPosition(0);

    }
}
