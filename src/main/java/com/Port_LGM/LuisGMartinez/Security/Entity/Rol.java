
package com.Port_LGM.LuisGMartinez.Security.Entity;


import com.Port_LGM.LuisGMartinez.Security.Enums.RolName;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;



@Entity
@Getter @Setter
public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotNull
    @Enumerated(EnumType.STRING)
    private RolName rolName;
    
    public Rol(){}
    
    public Rol(RolName rolName){
        this.rolName = rolName;
    }
    
}
