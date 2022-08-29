
package com.Port_LGM.LuisGMartinez.Security.DTO;

import java.util.HashSet;
import java.util.Set;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
public class NewUser {
    private String name;
    private String userName;
    private String email;
    private String password;
    private Set<String> roles = new HashSet<>();

    public NewUser(String name, String userName, String email, String password) {
        this.name = name;
        this.userName = userName;
        this.email = email;
        this.password = password;
    }
    
    
}
