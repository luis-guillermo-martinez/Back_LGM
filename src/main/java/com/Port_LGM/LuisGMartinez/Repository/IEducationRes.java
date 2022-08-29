/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Port_LGM.LuisGMartinez.Repository;

import com.Port_LGM.LuisGMartinez.Entity.Education;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author luism
 */
@Repository
public interface IEducationRes extends JpaRepository <Education, Long> {
    public Optional<Education> findByTitle (String title);
    
    public boolean existsByTitle(String title);
}
