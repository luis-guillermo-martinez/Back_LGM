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
public class Social{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    /*private Long idPersona;*/
    private String imgSocial;
    private String nameSocial;
    private String linkSocial;

    public Social() {
    }

    public Social(String imgSocial, String nameSocial, String linkSocial) {
        this.imgSocial = imgSocial;
        this.nameSocial = nameSocial;
        this.linkSocial = linkSocial;
    }
        
}