/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Port_LGM.LuisGMartinez.Entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;
/**
 *
 * @author luism
 */
@Entity
@Setter @Getter
public class Skill{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
   /* private Long idPersona;*/
    private String imgSkill;
    private String colorIn;
    private String colorOut;
    private String nameSkill;
    private int progress;

    public Skill() {
    }

    public Skill(String imgSkill, String colorIn, String colorOut, String nameSkill, int progress) {
        this.imgSkill = imgSkill;
        this.colorIn = colorIn;
        this.colorOut = colorOut;
        this.nameSkill = nameSkill;
        this.progress = progress;
    }
          
}