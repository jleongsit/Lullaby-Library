
public abstract class Person {
    String username;
    String password;
    private void changePassword(){
        password = LibraryGUI.changePasswordBox.getText();
    }//end changePassword
    public boolean checkPassword(String pass){
        if(pass.equals(password)){
            return true;
        } else {
            return false;
        }//end if
    }//end checkPassword
    public String getUsername(){
        return username;
    }//end getUsername
}//end class
