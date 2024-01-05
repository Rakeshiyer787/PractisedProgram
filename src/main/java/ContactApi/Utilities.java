    package ContactApi;

import com.github.javafaker.Faker;

    public class Utilities {
        public static String firstname() {
            Faker faker = new Faker();
            String fn = faker.name().firstName();
            return fn;
        }

        public static String lastname() {
            Faker faker = new Faker();
            String ln = faker.name().lastName();
            return ln;
        }

        public static String fullName() {
            Faker faker = new Faker();
            String fn = faker.name().fullName();
            return fn;
        }

        public static String address() {
            Faker faker = new Faker();
            String ad = faker.address().streetAddress();
            return ad;
        }

        public static String phonenumber() {
            Faker faker = new Faker();
            String ph = faker.phoneNumber().subscriberNumber(10);
            return ph;

        }

        public static String email() {
            Faker faker = new Faker();
            String em = faker.name().fullName().replace(" ", "") + "@testmail.com";
            return em;

        }

        public static String city() {
            Faker faker = new Faker();
            String ct = faker.address().city();
            return ct;
        }

        public static String birthDate() {

            return "1991-12-12";
        }

        public static String street1() {
            Faker faker = new Faker();
            String st1 = faker.address().streetAddress();
            return st1;
        }

        public static String street2() {
            Faker faker = new Faker();
            String st2 = faker.address().streetAddress();
            return st2;
        }
        public static String stateProvince() {
            Faker faker = new Faker();
            String sp = faker.address().state();
            return sp;

    }
        public static String Country() {
            Faker faker = new Faker();
            String co = faker.address().country();
            return co;
        }
        public static String postalCode(){
            Faker faker = new Faker();
            String pc = faker.address().zipCode();
            return pc;
        }
    }