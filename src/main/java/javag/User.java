package javag;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table
public class User {

    @Id
    @SequenceGenerator(
            name = "user_sequence",
            sequenceName="user_sequence",
            allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "user_sequence")


    private Long Id;
@NotBlank(message = "First name cannot be blank")
@Size(min = 2,message = "First name is too short")
    private String firstName;
@NotBlank(message = "Last name cannot be blank")
@Size(message ="last name is too short",min = 2)
    private String lastName;
@NotBlank(message = "User name cannot blank")
@Size(min = 2,message = "Username is too short")
    private String UserName;

@Email(message = "Email is invalid ")
@NotBlank(message = "Email cannot be blank")
    private String email;

//@NotBlank(message = "cannot be blank")
@DateTimeFormat(pattern = "YYYY-MM-DD")
    private String dateOfBirth;
// auto generated
//private Long Id;



    public User (String firstName, String lastName, String Username, String email, String dateOfBirth){
        this.firstName=firstName;
        this.lastName=lastName;
        this.UserName=Username;
        this.email=email;
        this.dateOfBirth= dateOfBirth;
    }

     User(){

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

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", UserName='" + UserName + '\'' +
                ", email='" + email + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
