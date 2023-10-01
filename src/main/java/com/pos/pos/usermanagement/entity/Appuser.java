package com.pos.pos.usermanagement.entity;

import com.pos.pos.base.entitiy.baseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
@Entity
@Table(name="sec_Appuser")
public class Appuser extends baseEntity<Long> {
    private  String fristname;
    private String lastname ;

}
