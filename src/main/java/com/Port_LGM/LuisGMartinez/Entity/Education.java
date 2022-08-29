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
public class Education {
 @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    /*private Long idPersona;*/
    private String imgInstitute;
    private String title;
    private String yearStudied;
    private String duration;
    private String descriptionEducation;

    public Education() {
    }

    public Education(String imgInstitute, String title,
                     String yearStudied, String duration, String descriptionEducation) {
        this.imgInstitute = imgInstitute;
        this.title = title;
        this.yearStudied = yearStudied;
        this.duration = duration;
        this.descriptionEducation = descriptionEducation;
    }
         
}