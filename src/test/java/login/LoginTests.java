package login;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

import static org.testng.Assert.assertTrue;


public class LoginTests extends BaseTests {

//    @BeforeClass
//    public void setUpLogin(){
//        setUp();
//    }
//    @AfterClass
//    public void tearDownLogin(){
//        tearDown();
//    }

    @Test
    public void testSuccessfulLogin(){
        LoginPage loginPage = homePage.clickFormAuthentication();
        loginPage.setUsername("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
        assertTrue(secureAreaPage.getAlertText()
                .contains("You logged into a secure area!"),
                "Alert text is incorrect");
        System.out.println("Login");
    }

}
