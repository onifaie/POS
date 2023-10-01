package com.pos.pos.usermanagement.Dto;

import com.pos.pos.base.dto.baseDto;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Setter
@Getter
@Service
@Component
public class AppuserDto extends baseDto {

    private String fristname;
    private String lastname;

}
