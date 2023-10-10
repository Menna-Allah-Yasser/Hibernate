package edu.mum.cs.domain;


import javax.persistence.*;
import java.sql.Date;


@Entity
public class BranchEntity {
    public BranchEntity(String branchName) {
        this.branchName = branchName;
    }

    public BranchEntity(){
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int branchId;

    public int getBranchId() {
        return branchId;
    }

    public void setBranchId(int branchId) {
        this.branchId = branchId;
    }


    private String branchName;

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }


    private Integer mgrId;

    public Integer getMgrId() {
        return mgrId;
    }

    public void setMgrId(Integer mgrId) {
        this.mgrId = mgrId;
    }


    private Date mgrStartDate;

    public Date getMgrStartDate() {
        return mgrStartDate;
    }

    public void setMgrStartDate(Date mgrStartDate) {
        this.mgrStartDate = mgrStartDate;
    }

    }
