package oop.tema.classesandinterfaces.task1uservalidator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Create the UserValidator class which with the validateEmails method will be
 * responsible for validating user data such as: email, alternative email. Within the
 * scope of the validateEmails method, please create the local Email class
 * which will be responsible for formatting the provided email. Validation should
 * cover the following scenarios:
 * if the given email address is empty or it is null, set the value to unknown
 * if the given email address does not meet the email criteria, set the value to
 * unknown (use regular expressions)
 */

public class UserValidator {
    public String[] validateEmails(String email, String alternativeEmail) {
        class Email {
            private String email;

            public Email(String email) {
                if (email == null || email.isEmpty() || !validate(email)) {
                    this.email = "unknown";
                } else {
                    this.email = email;
                }
            }
        }
        Email email1 = new Email(email);
        Email email2 = new Email(alternativeEmail);
        return new String[]{email1.email, email2.email};
    }

    public static final Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

    public static boolean validate(String emailStr) {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailStr);
        return matcher.find();
    }
}
