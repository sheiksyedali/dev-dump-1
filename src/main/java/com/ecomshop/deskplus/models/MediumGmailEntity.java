package com.ecomshop.deskplus.models;

import javax.persistence.*;
import java.util.Date;

/**
 * Author: Sheik Syed Ali
 * Date: 03 Jan 2022
 */
@Entity
@Table(name = "medium_gmail")
public class MediumGmailEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long medium_gmail_id;

    private String mail_id;

    private boolean active;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "reg_id", nullable = false)
    private RegistrationsEntity registration;

    @Temporal(TemporalType.TIMESTAMP)
    private Date created_time;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "created_by", nullable = false)
    private UsersEntity createdUser;

    public Long getMedium_gmail_id() {
        return medium_gmail_id;
    }

    public void setMedium_gmail_id(Long medium_gmail_id) {
        this.medium_gmail_id = medium_gmail_id;
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

    public Date getCreated_time() {
        return created_time;
    }

    public void setCreated_time(Date created_time) {
        this.created_time = created_time;
    }

    public UsersEntity getCreatedUser() {
        return createdUser;
    }

    public void setCreatedUser(UsersEntity createdUser) {
        this.createdUser = createdUser;
    }
}
