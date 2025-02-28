package com.example.demo.entity;

import jakarta.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDate;


@Entity
@Table(name = "CUST_DETAILS")
public class CustDetails {

    @Id
    @Column(name = "CST_ID")
    private Long cstId;

    @Column(name = "CSTDET_TYPE")
    private String cstDetType;

    @Column(name = "CSTDET_DOB")
    private LocalDate cstDetDob;

    @Column(name = "CSTDET_STATUS")
    private String cstDetStatus;

    @Column(name = "CSTDET_CONTACT")
    private String cstDetContact;

    @Column(name = "CSTDET_MOBILE")
    private String cstDetMobile;

    @Column(name = "CSTDET_EMAIL")
    private String cstDetEmail;

    @Column(name = "CSTDET_EFCTV_DATE")
    private LocalDate cstDetEfctvDate;

    @Column(name = "CSTDET_CRUD_VALUE")
    private String cstDetCrudValue;

    @Column(name = "CSTDET_USER_ID")
    private String cstDetUserId;

    @Column(name = "CSTDET_WS_ID")
    private String cstDetWsId;

    @Column(name = "CSTDET_PRGM_ID")
    private String cstDetPrgmId;

    @Column(name = "CSTDET_HOST_TS")
    private Timestamp cstDetHostTs;

    @Column(name = "CSTDET_LOCAL_TS")
    private Timestamp cstDetLocalTs;

    @Column(name = "CSTDET_ACPT_TS")
    private Timestamp cstDetAcptTs;

    @Column(name = "CSTDET_ACPT_TS_UTC_OFST")
    private Timestamp cstDetAcptTsUtcOfst;

    @Column(name = "CSTDET_UUID")
    private String cstDetUuid;

    // Add Getters and Setters


    // Getters and Setters
    public Long getCstId() {
        return cstId;
    }

    public void setCstId(Long cstId) {
        this.cstId = cstId;
    }

    public String getCstDetType() {
        return cstDetType;
    }

    public void setCstDetType(String cstDetType) {
        this.cstDetType = cstDetType;
    }

    public LocalDate getCstDetDob() {
        return cstDetDob;
    }

    public void setCstDetDob(LocalDate cstDetDob) {
        this.cstDetDob = cstDetDob;
    }

    public String getCstDetStatus() {
        return cstDetStatus;
    }

    public void setCstDetStatus(String cstDetStatus) {
        this.cstDetStatus = cstDetStatus;
    }

    public String getCstDetContact() {
        return cstDetContact;
    }

    public void setCstDetContact(String cstDetContact) {
        this.cstDetContact = cstDetContact;
    }

    public String getCstDetMobile() {
        return cstDetMobile;
    }

    public void setCstDetMobile(String cstDetMobile) {
        this.cstDetMobile = cstDetMobile;
    }

    public String getCstDetEmail() {
        return cstDetEmail;
    }

    public void setCstDetEmail(String cstDetEmail) {
        this.cstDetEmail = cstDetEmail;
    }

    public LocalDate getCstDetEfctvDate() {
        return cstDetEfctvDate;
    }

    public void setCstDetEfctvDate(LocalDate cstDetEfctvDate) {
        this.cstDetEfctvDate = cstDetEfctvDate;
    }

    public String getCstDetCrudValue() {
        return cstDetCrudValue;
    }

    public void setCstDetCrudValue(String cstDetCrudValue) {
        this.cstDetCrudValue = cstDetCrudValue;
    }

    public String getCstDetUserId() {
        return cstDetUserId;
    }

    public void setCstDetUserId(String cstDetUserId) {
        this.cstDetUserId = cstDetUserId;
    }

    public String getCstDetWsId() {
        return cstDetWsId;
    }

    public void setCstDetWsId(String cstDetWsId) {
        this.cstDetWsId = cstDetWsId;
    }

    public String getCstDetPrgmId() {
        return cstDetPrgmId;
    }

    public void setCstDetPrgmId(String cstDetPrgmId) {
        this.cstDetPrgmId = cstDetPrgmId;
    }

    public Timestamp getCstDetHostTs() {
        return cstDetHostTs;
    }

    public void setCstDetHostTs(Timestamp cstDetHostTs) {
        this.cstDetHostTs = cstDetHostTs;
    }

    public Timestamp getCstDetLocalTs() {
        return cstDetLocalTs;
    }

    public void setCstDetLocalTs(Timestamp cstDetLocalTs) {
        this.cstDetLocalTs = cstDetLocalTs;
    }

    public Timestamp getCstDetAcptTs() {
        return cstDetAcptTs;
    }

    public void setCstDetAcptTs(Timestamp cstDetAcptTs) {
        this.cstDetAcptTs = cstDetAcptTs;
    }

    public Timestamp getCstDetAcptTsUtcOfst() {
        return cstDetAcptTsUtcOfst;
    }

    public void setCstDetAcptTsUtcOfst(Timestamp cstDetAcptTsUtcOfst) {
        this.cstDetAcptTsUtcOfst = cstDetAcptTsUtcOfst;
    }

    public String getCstDetUuid() {
        return cstDetUuid;
    }

    public void setCstDetUuid(String cstDetUuid) {
        this.cstDetUuid = cstDetUuid;
    }
}
