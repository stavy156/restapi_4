package com.example.demo.entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "CUST_POI")
public class CustomerProofOfId {

    @Id
    @Column(name = "CST_ID")
    private Long customerId;

    @Column(name = "CSTPOI_CLS_ID")
    private Long proofClassId;

    @Column(name = "CSTPOI_VALUE", unique = true)
    private String proofValue;

    @Column(name = "CSTPOI_START")
    private Date startDate;

    @Column(name = "CSTPOI_END")
    private Date endDate;

    @Column(name = "CSTPOI_EFCTV_DATE")
    private Date effectiveDate;

    @Column(name = "CSTPOI_CRUD_VALUE")
    private char crudValue;

    @Column(name = "CSTPOI_USER_ID")
    private String userId;

    @Column(name = "CSTPOI_WS_ID")
    private String workstationId;

    @Column(name = "CSTPOI_PRGM_ID")
    private String programId;

    @Column(name = "CSTPOI_HOST_TS")
    private Date hostTimestamp;

    @Column(name = "CSTPOI_LOCAL_TS")
    private Date localTimestamp;

    @Column(name = "CSTPOI_ACPT_TS")
    private Date acceptedTimestamp;

    @Column(name = "CSTPOI_ACPT_TS_UTC_OFST")
    private Date acceptedTimestampUtcOffset;

    @Column(name = "CSTPOI_UUID")
    private String uuid;

    // Getters and Setters

    public Long getCustomerId() { return customerId; }
    public void setCustomerId(Long customerId) { this.customerId = customerId; }

    public Long getProofClassId() { return proofClassId; }
    public void setProofClassId(Long proofClassId) { this.proofClassId = proofClassId; }

    public String getProofValue() { return proofValue; }
    public void setProofValue(String proofValue) { this.proofValue = proofValue; }

    public Date getStartDate() { return startDate; }
    public void setStartDate(Date startDate) { this.startDate = startDate; }

    public Date getEndDate() { return endDate; }
    public void setEndDate(Date endDate) { this.endDate = endDate; }
}
