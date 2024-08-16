package homeworkString;

import java.util.Scanner;

public class S1 {
    public static void main(String[] args) {
        /*
Store username, password and confirm password from a user and check following requirements:

Username or Password cannot be  empty, if so→ message=”Username or Password cannot be empty”.
Password should be minimum 8 characters, if less → message=”Password is too short”.
Password cannot contain username if so, → message=”Password cannot contain username”.
Password should match confirmed password, if not  → message=“Passwords do not match”.

Only after all requirements met → message “Your username and password has been created”
         */
        String username, password,passwordConfirm;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter username:");
        username=input.nextLine();
        System.out.println("Enter password:");
        password=input.nextLine();
        System.out.println("Confirm your password:");
        passwordConfirm=input.nextLine();
        boolean cond=true;
        if (username.isEmpty() || password.isEmpty()){
            System.out.println("Username or Password cannot be empty");
            cond=false;
        } else if (password.length()<8) {
            System.out.println("Password is too short");
            cond=false;
        } else if (password.contains(username)){
            System.out.println("Password cannot contain username");
            cond=false;
        } else if (!password.equals(passwordConfirm)) {
            System.out.println("Passwords do not match");
            cond=false;
        }
        if (cond){
            System.out.println("Your username and password has been created");
        }
    input.close();
    }
}
