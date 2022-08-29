
package com.Port_LGM.LuisGMartinez.Security.Repository;


import com.Port_LGM.LuisGMartinez.Security.Entity.User;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface IUserRes extends JpaRepository<User, Long>{
    Optional<User> findByUserName (String userName);
    
    boolean existsByUserName (String userName);
    boolean existsByEmail (String email);
}
