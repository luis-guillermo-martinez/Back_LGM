
package com.Port_LGM.LuisGMartinez.Security.DTO;

import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;



@Getter @Setter
public class LoginUser {
    @NotBlank
    private String userName;
    @NotBlank
    private String password;

    public LoginUser(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
    
}
