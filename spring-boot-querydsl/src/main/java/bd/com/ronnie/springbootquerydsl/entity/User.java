package bd.com.ronnie.springbootquerydsl.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
public class User extends AbstractAuditingEntity {

    @NotNull
    @Size(min = 1, max = 255)
    private String name;

    @NotNull
    @Size(min = 5, max = 255)
    private String password;

    @NotNull
    @Size(min = 5, max = 255)
    @Column(unique = true)
    private String email;

    @NotNull
    @Size(min = 5, max = 255)
    @Column(unique = true)
    private String phone;

    @DateTimeFormat(pattern = "dd-MMM-yyyy")
    private Date dateOfBirth;

    private String avatar;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @NotNull
    @Enumerated(EnumType.STRING)
    private Role role;

    @NotNull
    @Enumerated(EnumType.STRING)
    private Status status;

    private User() {
    }

    public static User newObjectWithDefaults() {
        User user = new User();
        user.status = Status.INACTIVE;
        user.role = Role.USER;
        return user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public enum Gender {MALE, FEMALE}

    public enum Role {USER, ADMIN}

    public enum Status {PENDING, ACTIVE, INACTIVE}

}
