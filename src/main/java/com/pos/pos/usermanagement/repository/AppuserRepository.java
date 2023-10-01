package com.pos.pos.usermanagement.repository;

import com.pos.pos.base.repository.baseRepository;
import com.pos.pos.usermanagement.entity.Appuser;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AppuserRepository extends baseRepository<Appuser,Long> {
//   @Query(value="SELECT Appuser.id, Appuser.created_date, Appuser.created_user, Appuser.modifi_date, Appuser.modified_user, Appuser.status_code, Appuser.fristname,Appuser.lastname FROM Appuser WHERE ID=:id",nativeQuery = true)
//    Appuser findAllById(Long Id);

}
