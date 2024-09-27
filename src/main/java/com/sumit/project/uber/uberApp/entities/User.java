package com.sumit.project.uber.uberApp.entities;

import com.sumit.project.uber.uberApp.entities.enums.Role;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.apache.catalina.users.GenericRole;

import java.util.Set;

@Entity
@Getter
@Setter
@Table(name= "app_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String email;
    private String password;

    @Enumerated(EnumType.STRING)
    @ElementCollection(fetch = FetchType.LAZY)
    private Set<Role> roles;
}
