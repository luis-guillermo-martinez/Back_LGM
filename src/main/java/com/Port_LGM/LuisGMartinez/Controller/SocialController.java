/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Port_LGM.LuisGMartinez.Controller;
import com.Port_LGM.LuisGMartinez.DTO.SocialDto;
import com.Port_LGM.LuisGMartinez.Entity.Social;
import com.Port_LGM.LuisGMartinez.Security.Controller.Mensaje;
import com.Port_LGM.LuisGMartinez.Service.ImpSocialService;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author luism
 */
@RestController
@RequestMapping ("/Social")
@CrossOrigin (origins = "http://http://localhost:4200")
public class SocialController {
        @Autowired
        ImpSocialService impSocialService;
    
    @GetMapping ("/list")
    public ResponseEntity <List<Social>> list(){
        List<Social> list = impSocialService.list();
        return new ResponseEntity (list, HttpStatus.OK);
    }
    
    @GetMapping("/detail/{id}")
    public ResponseEntity<Social> getById(@PathVariable("id") long id){
        if(!impSocialService.existById(id))
            return new ResponseEntity(new Mensaje("El ID no Existe"), HttpStatus.NOT_FOUND);
        Social social = impSocialService.getOne(id).get();
        return new ResponseEntity(social, HttpStatus.OK);
    }
    
    @PostMapping ("/save")
    public ResponseEntity<?> create(@RequestBody SocialDto socialDto){
        if(StringUtils.isBlank(socialDto.getNameSocial()))
            return new ResponseEntity(new Mensaje("El nombre de Red Social es obligatorio"), HttpStatus.BAD_REQUEST);
        if(impSocialService.existsByNameSocial(socialDto.getNameSocial()))
            return new ResponseEntity(new Mensaje("La Red Social ingresada ya existe"), HttpStatus.BAD_REQUEST);
        Social social = new Social(socialDto.getNameSocial(), socialDto.getImgSocial(), socialDto.getLinkSocial());
        impSocialService.save(social);
        return new ResponseEntity(new Mensaje("Nueva Red Social Agregada Correctamente"), HttpStatus.OK);
        
    }
    
    @PutMapping ("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id")long id, @RequestBody SocialDto socialDto){
        if(!impSocialService.existById(id))
            return new ResponseEntity(new Mensaje("El ID no Existe"),HttpStatus.BAD_REQUEST);
        if(impSocialService.existsByNameSocial(socialDto.getNameSocial())
            && 
           impSocialService.getByNameSocial(socialDto.getNameSocial()).get().getId() !=id)
                return new ResponseEntity(new Mensaje("La Red Social ya existe"),HttpStatus.BAD_REQUEST);
        if(StringUtils.isBlank(socialDto.getNameSocial()))
            return new ResponseEntity(new Mensaje("El Nombre de la Red Social es obligatorio"), HttpStatus.BAD_REQUEST);
        Social social = impSocialService.getOne(id).get();
        social.setNameSocial(socialDto.getNameSocial());
        social.setImgSocial(socialDto.getImgSocial());
        social.setLinkSocial(socialDto.getLinkSocial());
            impSocialService.save(social);
            return new ResponseEntity(new Mensaje("Red Social Actualizada Correctamente"), HttpStatus.OK);
    }
    
    @DeleteMapping ("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id")long id){
        if(!impSocialService.existById(id))
            return new ResponseEntity(new Mensaje("El ID no Existe"),HttpStatus.BAD_REQUEST);
        impSocialService.delete(id);
            return new ResponseEntity(new Mensaje("Red Social Eliminada"), HttpStatus.OK);
    }
    
}