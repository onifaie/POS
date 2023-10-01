package com.pos.pos.base.repository;

import jakarta.transaction.Transactional;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.query.Param;


@NoRepositoryBean
public interface baseRepository<T,ID  extends Number > extends JpaRepository<T,ID> {

    @Modifying
    @Transactional
    @Query("update #{#entityName} T SET T.statusCode=:statusCode Where T.id=:id")
//    @Query(value="SELECT T FROM  sec_appuser t  WHERE t.id =:id",nativeQuery = true);
    void updateStatus(@Param("id") Long id,@Param("statusCode") Integer statusCode);






}
