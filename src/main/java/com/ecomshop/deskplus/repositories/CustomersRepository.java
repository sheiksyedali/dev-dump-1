package com.ecomshop.deskplus.repositories;

import com.ecomshop.deskplus.models.CustomersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Author: Sheik Syed Ali
 */
public interface CustomersRepository extends JpaRepository<CustomersEntity, Long> {

    @Query("SELECT m FROM CustomersEntity m WHERE m.customer_email = :email")
    CustomersEntity findCustomerByEmail(@Param("email") String email);
}
