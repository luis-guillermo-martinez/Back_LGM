
package com.Port_LGM.LuisGMartinez.Service;


import com.Port_LGM.LuisGMartinez.Entity.Skill;
import com.Port_LGM.LuisGMartinez.Repository.ISkillRes;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
@Transactional
public class ImpSkillService{
    @Autowired
    ISkillRes iskillRes;
    
   public List<Skill> list(){
        return iskillRes.findAll();
    }
    
    public Optional<Skill> getOne(long id){
        return iskillRes.findById(id);
    }
    
    public Optional<Skill> getByNameSkill (String nameSkill){
        return iskillRes.findByNameSkill(nameSkill);
    }
    
    public void save(Skill skill){
        iskillRes.save(skill);
    }
    
    public void delete(long id){
        iskillRes.deleteById(id);
    }
    
    public boolean existById(long id){
        return iskillRes.existsById(id);
    }
    
    public boolean existsByNameSkill(String nameSkill){
        return iskillRes.existsByNameSkill(nameSkill);
                
    }
    
}
