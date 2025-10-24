
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserValidationTest {

    @Test void testValidEmail_ReturnsTrue() {
        assertTrue(UserValidation.validateEmail("user@example.com"));
    }

    @Test void testEmailMissingAtSymbol_ReturnsFalse() {
        assertFalse(UserValidation.validateEmail("userexample.com"));
    }

    @Test void testEmailMissingDomain_ReturnsFalse() {
        assertFalse(UserValidation.validateEmail("user@"));
    }

    @Test void testEmailInvalidTld_ReturnsFalse() {
        assertFalse(UserValidation.validateEmail("user@mail.c"));
    }

    @Test void testEmailWithSubdomain_ReturnsTrue() {
        assertTrue(UserValidation.validateEmail("user@mail.company.com"));
    }

    @Test void testEmailWithSpecialCharacters_ReturnsTrue() {
        assertTrue(UserValidation.validateEmail("ramy.gomaa_21@mail.co"));
    }

    @Test void testUppercaseEmail_ReturnsTrue() {
        assertTrue(UserValidation.validateEmail("USER@MAIL.COM"));
    }

    @Test void testEmailWithSpace_ReturnsFalse() {
        assertFalse(UserValidation.validateEmail("user name@mail.com"));
    }

    @Test void testEmailEmptyString_ReturnsFalse() {
        assertFalse(UserValidation.validateEmail(""));
    }

    @Test void testEmailNull_ReturnsFalse() {
        assertFalse(UserValidation.validateEmail(null));
    }

    @Test void testValidUsername_ReturnsTrue() {
        assertTrue(UserValidation.validateUsername("ramy_gomaa"));
    }

    @Test void testUsernameTooShort_ReturnsFalse() {
        assertFalse(UserValidation.validateUsername("ab"));
    }

    @Test void testUsernameTooLong_ReturnsFalse() {
        assertFalse(UserValidation.validateUsername("ramygomaaisaverylongusername"));
    }

    @Test void testUsernameWithSpaces_ReturnsFalse() {
        assertFalse(UserValidation.validateUsername("ramy gomaa"));
    }

    @Test void testUsernameWithSymbols_ReturnsFalse() {
        assertFalse(UserValidation.validateUsername("ramy@123"));
    }

    @Test void testUsernameWithDigits_ReturnsTrue() {
        assertTrue(UserValidation.validateUsername("ramy123"));
    }

    @Test void testUsernameEmptyString_ReturnsFalse() {
        assertFalse(UserValidation.validateUsername(""));
    }

    @Test void testUsernameNull_ReturnsFalse() {
        assertFalse(UserValidation.validateUsername(null));
    }

    @Test void testValidVodafone_ReturnsTrue() {
        assertTrue(UserValidation.validatePhoneNumber("01012345678"));
    }

    @Test void testValidOrange_ReturnsTrue() {
        assertTrue(UserValidation.validatePhoneNumber("01234567890"));
    }

    @Test void testValidEtisalat_ReturnsTrue() {
        assertTrue(UserValidation.validatePhoneNumber("01198765432"));
    }

    @Test void testValidWE_ReturnsTrue() {
        assertTrue(UserValidation.validatePhoneNumber("01555555555"));
    }

    @Test void testValidVodafoneWithCountryCode_ReturnsTrue() {
        assertTrue(UserValidation.validatePhoneNumber("201012345678"));
    }

    @Test void testValidOrangeWithCountryCode_ReturnsTrue() {
        assertTrue(UserValidation.validatePhoneNumber("201234567890"));
    }

    @Test void testInvalidPrefix_ReturnsFalse() {
        assertFalse(UserValidation.validatePhoneNumber("01812345678"));
    }

    @Test void testTooShort_ReturnsFalse() {
        assertFalse(UserValidation.validatePhoneNumber("0101234567"));
    }

    @Test void testTooLong_ReturnsFalse() {
        assertFalse(UserValidation.validatePhoneNumber("010123456789"));
    }

    @Test void testContainsCharacters_ReturnsFalse() {
        assertFalse(UserValidation.validatePhoneNumber("01012abc678"));
    }

    @Test void testEmptyPhone_ReturnsFalse() {
        assertFalse(UserValidation.validatePhoneNumber(""));
    }

    @Test void testNullPhone_ReturnsFalse() {
        assertFalse(UserValidation.validatePhoneNumber(null));
    }

    @Test void testValidNationalId_ReturnsTrue() {
        assertTrue(UserValidation.validateNationalId("29812251234567"));
    }

    @Test void testNationalIdTooShort_ReturnsFalse() {
        assertFalse(UserValidation.validateNationalId("2981225123456"));
    }

    @Test void testNationalIdTooLong_ReturnsFalse() {
        assertFalse(UserValidation.validateNationalId("298122512345678"));
    }

    @Test void testNationalIdContainsLetters_ReturnsFalse() {
        assertFalse(UserValidation.validateNationalId("2981225AB34567"));
    }

    @Test void testInvalidCenturyCode_ReturnsFalse() {
        assertFalse(UserValidation.validateNationalId("19812251234567"));
    }

    @Test void testInvalidMonth_ReturnsFalse() {
        assertFalse(UserValidation.validateNationalId("29813251234567"));
    }

    @Test void testInvalidDay_ReturnsFalse() {
        assertFalse(UserValidation.validateNationalId("29812323234567"));
    }

    @Test void testInvalidGovernorate_ReturnsFalse() {
        assertFalse(UserValidation.validateNationalId("29812380034567"));
    }

    @Test void testEmptyNationalId_ReturnsFalse() {
        assertFalse(UserValidation.validateNationalId(""));
    }

    @Test void testNullNationalId_ReturnsFalse() {
        assertFalse(UserValidation.validateNationalId(null));
    }
}
