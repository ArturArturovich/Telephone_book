package com.artur.test_exemple.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "numbers")
public class PhoneNumber {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "number")
    private Long number;

    @OneToMany(mappedBy = "phoneNumber")
    private List<User> users ;

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public PhoneNumber(Long numbers) {
        this.number = numbers;
    }

    public PhoneNumber(){}


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }


    @Override
    public String toString() {
        return "PhoneNumber{" +
                "id=" + id +
                ", number=" + number +
                ", users=" + users +
                '}';
    }
}
