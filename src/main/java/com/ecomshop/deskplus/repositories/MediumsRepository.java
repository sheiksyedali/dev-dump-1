package com.ecomshop.deskplus.repositories;

import com.ecomshop.deskplus.models.MediumsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Author: Sheik Syed Ali
 */
public interface MediumsRepository extends JpaRepository<MediumsEntity, Long> {

    @Query("SELECT m FROM MediumsEntity m WHERE m.source = :source")
    MediumsEntity findMediumBySource(@Param("source") String source);
}
