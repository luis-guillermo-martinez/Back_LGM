
package com.Port_LGM.LuisGMartinez.Security.Service;


import com.Port_LGM.LuisGMartinez.Security.Entity.PrincipalUser;
import com.Port_LGM.LuisGMartinez.Security.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;



@Service

public class ImpUserDetailsService implements UserDetailsService{
    @Autowired
    ImpUserService impUserService;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        User user = impUserService.getByUserName(userName).get();
        return PrincipalUser.build(user);
    }
    
    
}
