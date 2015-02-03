package ch.makery.address.model;

import javafx.beans.property.*;

import java.time.LocalDate;

/**
 * by j.meier
 * on 06.01.2015
 * All rights reserved.
 */
public class Person
{
    public final StringProperty firstName;
    public final StringProperty lastName;
    public final StringProperty street;
    public final IntegerProperty postalCode;
    public final StringProperty city;
    public final ObjectProperty<LocalDate> birthday;


    public Person()
    {
        this(null, null);
    }

    public Person(String firstName, String lastName)
    {
        this.firstName = new SimpleStringProperty(firstName);
        this.lastName = new SimpleStringProperty(lastName);

        this.street = new SimpleStringProperty("some street");
        this.postalCode = new SimpleIntegerProperty(1234);
        this.city = new SimpleStringProperty("some city");
        this.birthday = new SimpleObjectProperty<LocalDate>(LocalDate.of(1992, 4, 16));
    }

    public String getFirstName()
    {
        return firstName.get();
    }

    public StringProperty firstNameProperty()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName.set(firstName);
    }

    public String getLastName()
    {
        return lastName.get();
    }

    public StringProperty lastNameProperty()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName.set(lastName);
    }

    public String getStreet()
    {
        return street.get();
    }

    public StringProperty streetProperty()
    {
        return street;
    }

    public void setStreet(String street)
    {
        this.street.set(street);
    }

    public int getPostalCode()
    {
        return postalCode.get();
    }

    public IntegerProperty postalCodeProperty()
    {
        return postalCode;
    }

    public void setPostalCode(int postalCode)
    {
        this.postalCode.set(postalCode);
    }

    public String getCity()
    {
        return city.get();
    }

    public StringProperty cityProperty()
    {
        return city;
    }

    public void setCity(String city)
    {
        this.city.set(city);
    }

    public LocalDate getBirthday()
    {
        return birthday.get();
    }

    public ObjectProperty<LocalDate> birthdayProperty()
    {
        return birthday;
    }

    public void setBirthday(LocalDate birthday)
    {
        this.birthday.set(birthday);
    }
}
