package com.pos.pos.base.mapper;

import org.mapstruct.MappingTarget;
import org.springframework.context.annotation.Bean;

import java.util.List;

public interface baseMapper <T ,baseDto>{
    baseDto map(T t);
     T unMap(baseDto baseDto);
     T unMap(@MappingTarget T t , baseDto baseDto);

     List<baseDto>map(List<T> t);
     List<T>unMap (List<baseDto> baseDtos);


}
