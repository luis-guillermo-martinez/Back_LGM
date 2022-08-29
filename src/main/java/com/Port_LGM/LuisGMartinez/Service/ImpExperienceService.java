
package com.Port_LGM.LuisGMartinez.Service;


import com.Port_LGM.LuisGMartinez.Entity.Experience;
import com.Port_LGM.LuisGMartinez.Repository.IExperienceRes;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
@Transactional
public class ImpExperienceService{
    @Autowired
    IExperienceRes iexperienceRes;
    
    public List<Experience> list(){
        return iexperienceRes.findAll();
    }
    
    public Optional<Experience> getOne(long id){
        return iexperienceRes.findById(id);
    }
    
    public Optional<Experience> getByPosition (String position){
        return iexperienceRes.findByPosition(position);
    }
    
    public void save(Experience experience){
        iexperienceRes.save(experience);
    }
    
    public void delete(long id){
        iexperienceRes.deleteById(id);
    }
    
    public boolean existById(long id){
        return iexperienceRes.existsById(id);
    }
    
    public boolean existsByPosition(String position){
        return iexperienceRes.existsByPosition(position);
                
    }
    
}