public class User{
    private String userName;
    private int userAge;

    public User(String userName, int userAge){
        this.userName = userName;
        this.userAge = userAge;
    }

    public String getUserName(){
        return userName;
    }

    public int getUserAge(){
        return userAge;
    }
}