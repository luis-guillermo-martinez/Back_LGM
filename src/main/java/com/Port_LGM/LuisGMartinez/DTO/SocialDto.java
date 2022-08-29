
package com.Port_LGM.LuisGMartinez.DTO;

import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
public class SocialDto {
    private String imgSocial;
    @NotBlank
    private String nameSocial;
    @NotBlank
    private String linkSocial;

    public SocialDto(String imgSocial, String nameSocial, String linkSocial) {
        this.imgSocial = imgSocial;
        this.nameSocial = nameSocial;
        this.linkSocial = linkSocial;
    }
}
