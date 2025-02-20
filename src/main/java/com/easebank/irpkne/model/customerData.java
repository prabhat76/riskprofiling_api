package com.easebank.irpkne.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "customerData")
public class customerData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Long getId() {
        return id;
    }

    public int getCustomerId() {
        return customerId;
    }

//    public customerData(Long id, int customerId, String username, String password, LocalDateTime lastLoggedIn, LocalDateTime idCreatedOn) {
//        this.id = id;
//        this.customerId = customerId;
//        this.username = username;
//        this.password = password;
//        this.lastLoggedIn = lastLoggedIn;
//        this.idCreatedOn = idCreatedOn;
//    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public LocalDateTime getLastLoggedIn() {
        return lastLoggedIn;
    }

    public LocalDateTime getIdCreatedOn() {
        return idCreatedOn;
    }

    @Column(nullable = false, name = "customer_Id")
    private int customerId;

    @Column(nullable = false, unique = true, name = "username")
    private String username;

    @Column(nullable = false, name = "password")
    private String password;

    @Column(name = "last_logged_in")
    private LocalDateTime lastLoggedIn;

    @Column(name = "id_created_on")
    private LocalDateTime idCreatedOn;
}
