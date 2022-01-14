package com.ecomshop.deskplus.repositories;

import com.ecomshop.deskplus.models.MediumMailgunEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Author: Sheik Syed Ali
 */
public interface MediumMailgunRepository extends JpaRepository<MediumMailgunEntity, Long> {

    @Query("SELECT md FROM MediumMailgunEntity md " +
            "INNER JOIN RegistrationsEntity r ON r.reg_id = md.registration.reg_id " +
            "WHERE r.reg_unique_id = :regId")
    MediumMailgunEntity getMediumMailgunByReg(@Param("regId") String regId);
}
