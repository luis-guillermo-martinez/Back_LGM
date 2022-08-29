
package com.Port_LGM.LuisGMartinez.DTO;

import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
public class ProjectDto {
    private String imgProject;   
    @NotBlank
    private String nameProject; 
    @NotBlank
    private String descriptionProject; 
    @NotBlank
    private String linkProject;

    public ProjectDto(String imgProject, String nameProject, String descriptionProject, String linkProject) {
        this.imgProject = imgProject;
        this.nameProject = nameProject;
        this.descriptionProject = descriptionProject;
        this.linkProject = linkProject;
    }
}
