package edu.mum.cs.domain;

import javax.persistence.*;

import java.sql.Date;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "employee", schema = "company")
public class EmployeeEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "emp_id")
    private int empId;
    @Basic
    @Column(name = "first_Name")
    private String firstName;
    @Basic
    @Column(name = "last_Name")
    private String lastName;
    @Basic
    @Column(name = "birth_date")
    private Date birthDate;
    @Basic
    @Column(name = "sex")
    private String sex;
    @Basic
    @Column(name = "salary")
    private Double salary;
    @Basic
    @Column(name = "super_id")
    private Integer superId;
    @Basic
    @Column(name = "branch_id")
    private Integer branchId;
    @ManyToOne
    @JoinColumn(name = "super_id", referencedColumnName = "emp_id")
    private EmployeeEntity employeeBySuperId;
    @OneToMany(mappedBy = "employeeBySuperId")
    private Collection<EmployeeEntity> employeesByEmpId;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Integer getSuperId() {
        return superId;
    }

    public void setSuperId(Integer superId) {
        this.superId = superId;
    }

    public Integer getBranchId() {
        return branchId;
    }

    public void setBranchId(Integer branchId) {
        this.branchId = branchId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeEntity that = (EmployeeEntity) o;
        return empId == that.empId && Objects.equals(firstName, that.firstName) && Objects.equals(lastName, that.lastName) && Objects.equals(birthDate, that.birthDate) && Objects.equals(sex, that.sex) && Objects.equals(salary, that.salary) && Objects.equals(superId, that.superId) && Objects.equals(branchId, that.branchId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empId, firstName, lastName, birthDate, sex, salary, superId, branchId);
    }

    public EmployeeEntity getEmployeeBySuperId() {
        return employeeBySuperId;
    }

    public void setEmployeeBySuperId(EmployeeEntity employeeBySuperId) {
        this.employeeBySuperId = employeeBySuperId;
    }

    public Collection<EmployeeEntity> getEmployeesByEmpId() {
        return employeesByEmpId;
    }

    public void setEmployeesByEmpId(Collection<EmployeeEntity> employeesByEmpId) {
        this.employeesByEmpId = employeesByEmpId;
    }
}
