package com.example.demo.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Date;

@Entity
@Table(name = "CUST_ID")
public class CustomerIdentification {

    @Id
    @Column(name = "CST_ID")
    private Long cstId;

    @Column(name = "CUSTID_TYPE")
    private String custIdType;

    @Column(name = "CUSTID_ITEM", unique = true)
    private String custIdItem;

    @Column(name = "CSTID_EFCTV_DATE")
    private Date cstIdEffectiveDate;

    @Column(name = "CSTID_CRUD_VALUE")
    private char cstIdCrudValue;

    @Column(name = "CSTID_USER_ID")
    private String cstIdUserId;

    @Column(name = "CSTID_WS_ID")
    private String cstIdWsId;

    @Column(name = "CSTID_PRGM_ID")
    private String cstIdPrgmId;

    @Column(name = "CSTID_HOST_TS")
    private Timestamp cstIdHostTs;

    @Column(name = "CSTID_LOCAL_TS")
    private Timestamp cstIdLocalTs;

    @Column(name = "CSTID_ACPT_TS")
    private Timestamp cstIdAcptTs;

    @Column(name = "CSTID_ACPT_TS_UTC_OFST")
    private Timestamp cstIdAcptTsUtcOfst;

    @Column(name = "CSTID_UUID")
    private String cstIdUuid;

	public Long getCstId() {
		return cstId;
	}

	public void setCstId(Long cstId) {
		this.cstId = cstId;
	}

	public String getCustIdType() {
		return custIdType;
	}

	public void setCustIdType(String custIdType) {
		this.custIdType = custIdType;
	}

	public String getCustIdItem() {
		return custIdItem;
	}

	public void setCustIdItem(String custIdItem) {
		this.custIdItem = custIdItem;
	}

	public Date getCstIdEffectiveDate() {
		return cstIdEffectiveDate;
	}

	public void setCstIdEffectiveDate(Date cstIdEffectiveDate) {
		this.cstIdEffectiveDate = cstIdEffectiveDate;
	}

	public char getCstIdCrudValue() {
		return cstIdCrudValue;
	}

	public void setCstIdCrudValue(char cstIdCrudValue) {
		this.cstIdCrudValue = cstIdCrudValue;
	}

	public String getCstIdUserId() {
		return cstIdUserId;
	}

	public void setCstIdUserId(String cstIdUserId) {
		this.cstIdUserId = cstIdUserId;
	}

	public String getCstIdWsId() {
		return cstIdWsId;
	}

	public void setCstIdWsId(String cstIdWsId) {
		this.cstIdWsId = cstIdWsId;
	}

	public String getCstIdPrgmId() {
		return cstIdPrgmId;
	}

	public void setCstIdPrgmId(String cstIdPrgmId) {
		this.cstIdPrgmId = cstIdPrgmId;
	}

	public Timestamp getCstIdHostTs() {
		return cstIdHostTs;
	}

	public void setCstIdHostTs(Timestamp cstIdHostTs) {
		this.cstIdHostTs = cstIdHostTs;
	}

	public Timestamp getCstIdLocalTs() {
		return cstIdLocalTs;
	}

	public void setCstIdLocalTs(Timestamp cstIdLocalTs) {
		this.cstIdLocalTs = cstIdLocalTs;
	}

	public Timestamp getCstIdAcptTs() {
		return cstIdAcptTs;
	}

	public void setCstIdAcptTs(Timestamp cstIdAcptTs) {
		this.cstIdAcptTs = cstIdAcptTs;
	}

	public Timestamp getCstIdAcptTsUtcOfst() {
		return cstIdAcptTsUtcOfst;
	}

	public void setCstIdAcptTsUtcOfst(Timestamp cstIdAcptTsUtcOfst) {
		this.cstIdAcptTsUtcOfst = cstIdAcptTsUtcOfst;
	}

	public String getCstIdUuid() {
		return cstIdUuid;
	}

	public void setCstIdUuid(String cstIdUuid) {
		this.cstIdUuid = cstIdUuid;
	}
    
    
    
}
