package com.ecomshop.deskplus.models;

import javax.persistence.*;

/**
 * Author: Sheik Syed Ali
 * Date: 03 Jan 2022
 */
@Entity
@Table(name = "primary_mail")
public class PrimaryMailEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long primary_mail_id;

    private String mail_id;

    private boolean active;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "reg_id", nullable = false)
    private RegistrationsEntity registration;

    public Long getPrimary_mail_id() {
        return primary_mail_id;
    }

    public void setPrimary_mail_id(Long primary_mail_id) {
        this.primary_mail_id = primary_mail_id;
    }

    public String getMail_id() {
        return mail_id;
    }

    public void setMail_id(String mail_id) {
        this.mail_id = mail_id;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public RegistrationsEntity getRegistration() {
        return registration;
    }

    public void setRegistration(RegistrationsEntity registration) {
        this.registration = registration;
    }
}
