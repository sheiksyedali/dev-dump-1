package com.ecomshop.deskplus.repositories;

import com.ecomshop.deskplus.models.PrimaryMailEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Author: Sheik Syed Ali
 * Date: 03 Jan 2022
 */
public interface PrimaryMailRepository extends JpaRepository<PrimaryMailEntity, Long> {

    @Query("SELECT p FROM PrimaryMailEntity p " +
            "INNER JOIN RegistrationsEntity r ON r.reg_id = p.registration.reg_id " +
            "WHERE r.reg_unique_id = :regId")
    PrimaryMailEntity getPrimaryMailByReg(@Param("regId") String regId);
}
