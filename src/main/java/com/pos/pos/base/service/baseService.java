package com.pos.pos.base.service;

import com.pos.pos.base.repository.baseRepository;
import jakarta.persistence.MappedSuperclass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
//@Service
@MappedSuperclass
//@Service

public abstract class   baseService<T,ID extends Number> {


private baseRepository<T,ID> baseRepository;

    public List<T>findAll(){
        return baseRepository.findAll();

    }

    public T findbyId(ID id){
        return  baseRepository.findById(id).orElse(null);


    }
    public T getOne(ID id ){
        return  baseRepository.getById(id);

    }
    public Optional<T> getById(ID id ){
        return  baseRepository.findById(id);

    }

    public T insert(T entitiy){
        return baseRepository.save(entitiy);

    }
    public T persist(T entity){
        return baseRepository.saveAndFlush(entity);

    }
    public  T update(T entitiy){
        return  baseRepository.save(entitiy);

    }
    public  void  deleteById(ID id ){
        baseRepository.deleteById(id);

    }
    public  void  deleteAll(List<ID> ids){
        ids.forEach(id->{
            baseRepository.deleteById(id);
        });

    }
}
