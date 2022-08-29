package com.Port_LGM.LuisGMartinez.Security.Service;


import com.Port_LGM.LuisGMartinez.Security.Entity.Rol;
import com.Port_LGM.LuisGMartinez.Security.Enums.RolName;
import com.Port_LGM.LuisGMartinez.Security.Repository.IRolRes;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
@Transactional
public class ImpRolService {
    @Autowired 
    IRolRes iRolRes;
    
    public Optional<Rol> getByRolName(RolName rolName){
        return iRolRes.findByRolName(rolName);
    }
    
    public void save(Rol rol){
        iRolRes.save(rol);
    }
    
}
