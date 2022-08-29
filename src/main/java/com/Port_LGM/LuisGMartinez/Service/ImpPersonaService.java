
package com.Port_LGM.LuisGMartinez.Service;


import com.Port_LGM.LuisGMartinez.Entity.Persona;
import com.Port_LGM.LuisGMartinez.Repository.IPersonaRes;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
@Transactional
public class ImpPersonaService{
    @Autowired
    IPersonaRes ipersonaRes;
    
    public List<Persona> list(){
        return ipersonaRes.findAll();
    }
    
    public Optional<Persona> getOne(long id){
        return ipersonaRes.findById(id);
    }
    
    public Optional<Persona> getByContact (String contact){
        return ipersonaRes.findByContact(contact);
    }
    
    public void save(Persona persona){
        ipersonaRes.save(persona);
    }
    
    public void delete(long id){
        ipersonaRes.deleteById(id);
    }
    
    public boolean existById(long id){
        return ipersonaRes.existsById(id);
    }
    
    public boolean existsByContact(String contact){
        return ipersonaRes.existsByContact(contact);
                
    }
}