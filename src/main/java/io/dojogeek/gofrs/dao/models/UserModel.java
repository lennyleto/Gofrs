package io.dojogeek.gofrs.dao.models;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by Irene on 4/13/16.
 */

@Data
@Entity
@Table(name = "users")
public class UserModel {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "password")
    private String password;

    @Column(name = "email")
    private String email;
}
