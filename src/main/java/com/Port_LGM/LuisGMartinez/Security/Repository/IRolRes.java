
package com.Port_LGM.LuisGMartinez.Security.Repository;


import com.Port_LGM.LuisGMartinez.Security.Entity.Rol;
import com.Port_LGM.LuisGMartinez.Security.Enums.RolName;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface IRolRes extends JpaRepository<Rol, Long>{
    Optional<Rol> findByRolName (RolName rolName);
}
