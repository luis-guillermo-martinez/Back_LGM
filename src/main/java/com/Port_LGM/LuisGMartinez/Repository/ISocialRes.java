/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Port_LGM.LuisGMartinez.Repository;

import com.Port_LGM.LuisGMartinez.Entity.Social;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author luism
 */
@Repository
public interface ISocialRes extends JpaRepository <Social, Long> {
    public Optional<Social> findByNameSocial (String nameSocial);
    
    public boolean existsByNameSocial(String nameSocial);  
}
