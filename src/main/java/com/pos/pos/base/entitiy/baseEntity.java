package com.pos.pos.base.entitiy;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
@MappedSuperclass
public class baseEntity <ID extends Number>{
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private ID id;
    private Integer statusCode;
    @Column(updatable=false)
    private LocalDate createdDate;
    @Column(updatable=false)
    private String createdUser;
    private LocalDate modifiDate;
    private String modifiedUser;





}
