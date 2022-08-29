
package com.Port_LGM.LuisGMartinez.DTO;

import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
public class EducationDto {
    private String imgInstitute;
    @NotBlank
    private String title;
    @NotBlank
    private String yearStudied;
    @NotBlank
    private String duration;
    @NotBlank
    private String descriptionEducation;

    public EducationDto(String imgInstitute, String title,
                     String yearStudied, String duration, String descriptionEducation) {
        this.imgInstitute = imgInstitute;
        this.title = title;
        this.yearStudied = yearStudied;
        this.duration = duration;
        this.descriptionEducation = descriptionEducation;
    }
}
