package Test1;

import org.testng.annotations.Test;

public class LoginTest {
    @Test(priority = 1, groups = "bvt1")
    public void loginTest(){
        System.out.println("Login");
    }
    @Test(priority = 2, groups = "bvt2", enabled = true)
    public void Logout(){
        System.out.println("Logout");
    }
}
