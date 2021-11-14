package registration;

import org.junit.Test;


public class ResumeCreationTest extends TestBase {


        @Test
        public void testResumeCreation() throws Exception {
            page.goToHomePage();
            page.signIn();
            page.goToResumeConstructor();
            page.fillResumeTitle();
            page.fillFirstName();
            page.fillLastName();
            page.fillSecondName();
            page.fillCityName();
            page.fillEmail();
            page.fillPhone();
            page.fillSkype();
            page.fillTelegram();
            page.tellAboutYourself();
            page.clickNextButton();
            page.clickEducationNextButton();
            page.saveResume();
        }
}
