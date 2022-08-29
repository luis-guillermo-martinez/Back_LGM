/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Port_LGM.LuisGMartinez.Repository;

import com.Port_LGM.LuisGMartinez.Entity.Experience;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author luism
 */
@Repository
public interface IExperienceRes extends JpaRepository <Experience, Long> {
    public Optional<Experience> findByPosition (String position);
    
    public boolean existsByPosition(String position);
}