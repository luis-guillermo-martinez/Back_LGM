/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Port_LGM.LuisGMartinez.Repository;

import com.Port_LGM.LuisGMartinez.Entity.Persona;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author luism
 */
@Repository
public interface IPersonaRes extends JpaRepository <Persona, Long> {
    public Optional<Persona> findByContact (String contact);
    
    public boolean existsByContact(String contact);
}

