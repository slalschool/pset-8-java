public class AccountOwner {
    String salutation;
    String firstName;
    String lastName;
    String emailAddress;
    long phoneNumber;
    MailingAddress mailingAddress;

    public AccountOwner(String salutation, String firstName, String lastName, String emailAddress, long phoneNumber, MailingAddress mailingAddress) {
        this.salutation = salutation;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.mailingAddress = mailingAddress;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getFormattedPhoneNumber() {
        String number = Long.toString(phoneNumber);
        String first = number.substring(0,3);
        String second = number.substring(3,6);
        String third = number.substring(6,10);
        return "(" + first + ") " + second + "-" + third;
    }

    public String getName(int type) {
        if (type == 1) {
            return firstName + " " + lastName;
        }
        else if (type == 2) {
            return salutation + ". " + lastName;
        }
        else if (type == 3) {
            return lastName + ", " + firstName;
        }
        else {
            return null;
        }

    }

    public MailingAddress getMailingAddress() {
        return mailingAddress;
    }

    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public MailingAddress mailingAddress() {
        return mailingAddress;
    }
}