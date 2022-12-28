public class main {
    public static void main(String[] args) {
        System.out.println(validatePassword("Test1!test", "Test1!test"));
    }

    public static String validatePassword(String password, String anotherPassword){

        if(isMatch(password, anotherPassword)){
            if(!containsDigit(password)){
                return "The password must contain a number!";
            }
            else if(!containsCapitalLetter(password)){
                return "the password must contain an uppercase letter!";
            }
            else if(!containsSpecialCharacter(password)){
                return "the password must contain a special character";
            }
            else if(!hasEightCharacters(password)){
                return "The password must have at least 8 characters!";
            }
            else{
                return "Password ok!";
            }
        }
        return "Passwords do not match!";
    }

    public static boolean containsDigit(String password){
        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) >= '0' && password.charAt(i) <= '9')
                return true;
        }
        return false;
    }

    public static boolean containsCapitalLetter(String password){

        for (int i = 0; i < password.length(); i++) {
            if(Character.isUpperCase(password.charAt(i)))
                return true;
        }
        return false;
    }

    public static boolean containsSpecialCharacter(String password){
        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) >= '!' && password.charAt(i) <= '/' ||
                    password.charAt(i) >= ':' && password.charAt(i) <= '@' ||
                    password.charAt(i) >= '[' && password.charAt(i) <= '`' ||
                    password.charAt(i) >= '{' && password.charAt(i) <= '~'){
                return true;
            }
        }
        return false;
    }

    public static boolean hasEightCharacters(String password){
        return password.length() >= 8;
    }

    public static boolean isMatch(String p1, String p2){
        return p1.equals(p2);
    }

}
