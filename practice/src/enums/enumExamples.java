package enums;

import org.testng.annotations.Test;

public class enumExamples {

    @Test
    public void printClientData() {
        System.out.println(clients.valueOf("CLIENT1").firstName);
    }

    public enum clients {

        CLIENT1("Leha", "Zavodchanin", "petuh@golub.ru", "proebal");

        private String firstName;
        private String lastName;
        private String email;
        private String phoneNumber;

        clients(String firstName, String lastName, String email, String phoneNumber) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.email = email;
            this.phoneNumber = phoneNumber;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }
    }
}
