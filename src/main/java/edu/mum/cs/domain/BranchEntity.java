package edu.mum.cs.domain;


import javax.persistence.*;
import java.sql.Date;


@Entity
public class BranchEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long branchId;
    private String branchName;
    private Integer mgrId;
    private Date mgrStartDate;
    public BranchEntity(){
    }
    public BranchEntity(String branchName) {
        this.branchName = branchName;
    }

    public Long getBranchId() {
        return branchId;
    }

    public void setBranchId(Long branchId) {
        this.branchId = branchId;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }
    public Integer getMgrId() {
        return mgrId;
    }

    public void setMgrId(Integer mgrId) {
        this.mgrId = mgrId;
    }

    public Date getMgrStartDate() {
        return mgrStartDate;
    }
    public void setMgrStartDate(Date mgrStartDate) {
        this.mgrStartDate = mgrStartDate;
    }

    }
