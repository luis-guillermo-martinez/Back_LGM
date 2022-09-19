/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Port_LGM.LuisGMartinez.Controller;
import com.Port_LGM.LuisGMartinez.DTO.PersonaDto;
import com.Port_LGM.LuisGMartinez.Entity.Persona;
import com.Port_LGM.LuisGMartinez.Security.Controller.Mensaje;
import com.Port_LGM.LuisGMartinez.Service.ImpPersonaService;
import java.util.Optional;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
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
@RequestMapping ("/Persona")
@CrossOrigin (origins = "http://localhost:4200") 
public class PersonaController {
    @Autowired
    ImpPersonaService impPersonaService;
    
    @GetMapping ("/list")
    public ResponseEntity<Optional<Persona>> getPersona(){
        return new ResponseEntity(impPersonaService.getOne(1),HttpStatus.OK);
    }
    
    @GetMapping("/detail/{id}")
    public ResponseEntity<Persona> getById(@PathVariable("id") long id){
        if(!impPersonaService.existById(id))
            return new ResponseEntity(new Mensaje("El ID no Existe"), HttpStatus.NOT_FOUND);
        Persona persona = impPersonaService.getOne(id).get();
        return new ResponseEntity(persona, HttpStatus.OK);
    }
    
    @PostMapping ("/save")
    public ResponseEntity<?> create(@RequestBody PersonaDto personaDto){
        if(StringUtils.isBlank(personaDto.getName()))
            return new ResponseEntity(new Mensaje("El Nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        if(StringUtils.isBlank(personaDto.getLastName()))
            return new ResponseEntity(new Mensaje("El Apellido es obligatorio"), HttpStatus.BAD_REQUEST);
        if(impPersonaService.existsByContact(personaDto.getContact()))
            return new ResponseEntity(new Mensaje("El Correo ingresado ya existe"), HttpStatus.BAD_REQUEST);
        Persona persona = new Persona(personaDto.getName(), personaDto.getText(), personaDto.getLastName(),
                                      personaDto.getDescription(), personaDto.getImgPerfil(), personaDto.getImgBanner(),
                                      personaDto.getCountry(), personaDto.getEstate(), personaDto.getContact(), personaDto.getPhone());
        impPersonaService.save(persona);
        return new ResponseEntity(new Mensaje("Nueva Persona Agregada Correctamente"), HttpStatus.OK);
    }
    
    @PutMapping ("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id")long id, @RequestBody PersonaDto personaDto){
        if(!impPersonaService.existById(id))
            return new ResponseEntity(new Mensaje("El ID no Existe"),HttpStatus.BAD_REQUEST);
        if(StringUtils.isBlank(personaDto.getName()))
            return new ResponseEntity(new Mensaje("El Nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        if(StringUtils.isBlank(personaDto.getLastName()))
            return new ResponseEntity(new Mensaje("El Apellido es obligatorio"), HttpStatus.BAD_REQUEST);
        Persona persona = impPersonaService.getOne(id).get();
        persona.setName(personaDto.getName());
        persona.setText(personaDto.getText());
        persona.setLastName(personaDto.getLastName());
        persona.setDescription(personaDto.getDescription());
        persona.setImgPerfil(personaDto.getImgPerfil());
        persona.setImgBanner(personaDto.getImgBanner());
        persona.setCountry(personaDto.getCountry());
        persona.setEstate(personaDto.getEstate());
        persona.setContact(personaDto.getContact());
        persona.setPhone(personaDto.getPhone());
            impPersonaService.save(persona);
            return new ResponseEntity(new Mensaje("Datos Personales Actualizados Correctamente"), HttpStatus.OK);
    }
    
}
