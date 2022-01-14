package com.ecomshop.deskplus.models;

import javax.persistence.*;

/**
 * Author: Sheik Syed Ali
 * Date: 03 Jan 2022
 */
@Entity
@Table(name = "medium_mailgun")
public class MediumMailgunEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long medium_mailgun_id;

    private String mail_id;

    private boolean active;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "reg_id", nullable = false)
    private RegistrationsEntity registration;

    public Long getMedium_mailgun_id() {
        return medium_mailgun_id;
    }

    public void setMedium_mailgun_id(Long medium_mailgun_id) {
        this.medium_mailgun_id = medium_mailgun_id;
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
