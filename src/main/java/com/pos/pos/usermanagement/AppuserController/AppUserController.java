package com.pos.pos.usermanagement.AppuserController;
import com.pos.pos.usermanagement.mapper.AppuserMapper;
import com.pos.pos.usermanagement.Dto.AppuserDto;
import com.pos.pos.usermanagement.entity.Appuser;
import com.pos.pos.usermanagement.mapper.AppuserMapper;
import com.pos.pos.usermanagement.repository.AppuserRepository;
import com.pos.pos.usermanagement.service.AppUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.management.openmbean.ArrayType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@RestController
@RequiredArgsConstructor
@RequestMapping(value= "/api/v1/user",method = RequestMethod.GET)

@Controller
public class AppUserController {


    private   AppUserService appUserService;

//    @Autowired(required=true)
//
@Autowired
    private   AppuserMapper appuserMapper;
//    private AppuserRepository appuserRepository;
//    @Autowired
//    private  AppuserDto  appuserDto;



    @GetMapping("/test")
    public List<Appuser> findAll( AppuserDto  AppuserDto ){
        List<AppuserDto> dtos=appuserMapper.map(appUserService.findAll());


            return   this.appUserService.findAll();

            }

    @GetMapping("/obeid")

    public String getobeid(){
        return  "obeid is funny";
    }



    @GetMapping("/test2")
    public ResponseEntity<?>findAll2(){
//        return this.appUserService.findAll();
     List<AppuserDto> dtos=appuserMapper.map(appUserService.findAll());
      return   ResponseEntity.ok(dtos);










    }
}
