/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Port_LGM.LuisGMartinez.Entity;
import java.util.Date;
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
public class Experience{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    /*private long idPersona;*/
    private String imgBusiness;
    private String business;
    private String position;
    private Date yearIn;
    private Date yearOut;
    private String descriptionPosition;

    public Experience() {
    }

    public Experience(String imgBusiness, String business, String position,
                      Date yearIn, Date yearOut, String descriptionPosition) {
        this.imgBusiness = imgBusiness;
        this.business = business;
        this.position = position;
        this.yearIn = yearIn;
        this.yearOut = yearOut;
        this.descriptionPosition = descriptionPosition;
    }
      
}