package org.marklen.tests.flightreservation.model;

public class FlightReservationTestData {

    public FlightReservationTestData() {
    }

    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String street;
    private String city;
    private String zip;
    private String passengersCount;
    private String expectedPrice;

    public FlightReservationTestData(String firstName, String lastName, String email, String password,
                                     String street, String city, String zip, String passengersCount,
                                     String expectedPrice) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.street = street;
        this.city = city;
        this.zip = zip;
        this.passengersCount = passengersCount;
        this.expectedPrice = expectedPrice;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getZip() {
        return zip;
    }

    public String getPassengersCount() {
        return passengersCount;
    }

    public String getExpectedPrice() {
        return expectedPrice;
    }
}
