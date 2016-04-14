package io.dojogeek.gofrs.rest.entities;

import lombok.Data;

/**
 * Created by Irene on 4/13/16.
 */
@Data
public class User {

    private Integer id;
    private String userName;
    private String password;
    private String email;
}
