
package com.Port_LGM.LuisGMartinez.Security.Service;


import com.Port_LGM.LuisGMartinez.Security.Entity.User;
import com.Port_LGM.LuisGMartinez.Security.Repository.IUserRes;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
@Transactional
public class ImpUserService {
    @Autowired
    IUserRes iUserRes;
    
    public Optional<User> getByUserName (String userName){
        return iUserRes.findByUserName(userName);
    }
    
    public boolean existsByUserName (String userName){
        return iUserRes.existsByUserName(userName);
    }
    
    public boolean existsByEmail (String email){
        return iUserRes.existsByEmail(email);
    }
    
    public void save(User user){
        iUserRes.save(user);
    }
    
}
