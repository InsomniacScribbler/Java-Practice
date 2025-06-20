package oops;

//data hiding
class ATM{
    private String userName;
    private String pass;
    private String bal;
 // getters and setters aid data hiding but only if used correctly
    // what that means is that if you make them public there is no way they are hidding data
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getBal() {
        return bal;
    }

    public void setBal(String bal) {
        this.bal = bal;
    }
}

public class DataHidingDemo {
    public static void main(String[] args) {
        ATM atm=new ATM();
        atm.setBal("1000");
        atm.setPass("123");
        atm.setUserName("ashwani");
        System.out.println(atm.getPass());
    }
}
