package web.SpringBoot2.model;


import jakarta.persistence.*;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;


@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @NotEmpty(message = "Имя не должно быть пустым")
    @Size(min = 2, max = 30, message = "Имя должно содержать от 2 до 30 символов")
    @Column(name = "name")
    private String name;

    @Min(value = 0, message = "Возраст должен быть больше 0")
    @Column(name = "age")
    private int age;

    @NotEmpty(message = "Электронная почта не должна быть пустой")
    @Email(message = "Электронная почта должна быть действующей")
    @Column(name = "email")
    private String email;
    @NotEmpty(message = "Фамилия не должна быть пустой")
    @Size(min = 2, max = 30, message = "Фамилия должна содержать от 2 до 30 символов")
    @Column(name = "last_name")
    private String lastName;



    public User() {
    }

    public User(String name, int age, String email, String lastName) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}