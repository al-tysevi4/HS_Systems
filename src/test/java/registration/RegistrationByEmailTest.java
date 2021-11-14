package registration;


import org.junit.Test;


public class RegistrationByEmailTest extends TestBase {

    @Test
        public void testRegistrationByEmail () throws Exception {
            page.getTheSource();
            page.initRegistration();
            page.fillEmailField();
            page.fillPassword();
            page.confirmPassword();
            page.checkConsent();
            page.register();
            page.enter();
            page.closePopup();
        }
}
