package com.pos.pos.usermanagement.mapper;

import com.pos.pos.base.mapper.baseMapper;
import com.pos.pos.usermanagement.Dto.AppuserDto;
import com.pos.pos.usermanagement.entity.Appuser;
import org.mapstruct.Mapper;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;


@Mapper
public interface AppuserMapper  extends baseMapper<Appuser, AppuserDto> {
//    @Override
//    @Mapping(Source="",target="")
//    AppuserDto map(Appuser t);



}
