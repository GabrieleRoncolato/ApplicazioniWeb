package it.univr.applicazioniweb.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;

@Entity
@Table(name = "customer")
public class Customer {
    @Id
    private String custCode;
    private String custName;
    private String custCity;
    private String workingArea;
    private String custCountry;
    private BigInteger grade;
    private BigDecimal openingAmt;
    private BigDecimal receiveAmt;
    private BigDecimal paymentAmt;
    private BigDecimal outstandingAmt;
    private String phoneNo;
    private String agentCode;

    public Customer(){

    }

    public Customer(String custCode, String custName, String custCity, String workingArea, String custCountry,
                    BigInteger grade, BigDecimal openingAmt, BigDecimal receiveAmt, BigDecimal paymentAmt,
                    BigDecimal outstandingAmt, String phoneNo, String agentCode){
        this.custCode = custCode;
        this.custName = custName;
        this.custCity = custCity;
        this.workingArea = workingArea;
        this.custCountry = custCountry;
        this.grade = grade;
        this.openingAmt = openingAmt;
        this.receiveAmt = receiveAmt;
        this.paymentAmt = paymentAmt;
        this.outstandingAmt = outstandingAmt;
        this.phoneNo = phoneNo;
        this.agentCode = agentCode;
    }

    @Override
    public int hashCode(){
        final int prime = 31;
        int result = 7;
        result = prime * result + ((custCode == null) ? 0 : custCode.hashCode());
        result = prime * result + ((custName == null) ? 0 : custName.hashCode());
        result = prime * result + ((custCity == null) ? 0 : custCity.hashCode());
        result = prime * result + ((workingArea == null) ? 0 : workingArea.hashCode());
        result = prime * result + ((custCountry == null) ? 0 : custCountry.hashCode());
        result = prime * result + ((grade == null) ? 0 : grade.hashCode());
        result = prime * result + ((openingAmt == null) ? 0 : openingAmt.hashCode());
        result = prime * result + ((receiveAmt == null) ? 0 : receiveAmt.hashCode());
        result = prime * result + ((paymentAmt == null) ? 0 : paymentAmt.hashCode());
        result = prime * result + ((outstandingAmt == null) ? 0 : outstandingAmt.hashCode());
        result = prime * result + ((phoneNo == null) ? 0 : phoneNo.hashCode());
        result = prime * result + ((agentCode == null) ? 0 : agentCode.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj){
        return obj instanceof Customer
                && Objects.equals(this.custCode, ((Customer) obj).agentCode)
                && Objects.equals(this.custName, ((Customer) obj).custName)
                && Objects.equals(this.custCity, ((Customer) obj).custCity)
                && Objects.equals(this.workingArea, ((Customer) obj).workingArea)
                && Objects.equals(this.custCountry, ((Customer) obj).custCountry)
                && Objects.equals(this.grade, ((Customer) obj).grade)
                && Objects.equals(this.openingAmt, ((Customer) obj).openingAmt)
                && Objects.equals(this.receiveAmt, ((Customer) obj).receiveAmt)
                && Objects.equals(this.paymentAmt, ((Customer) obj).paymentAmt)
                && Objects.equals(this.outstandingAmt, ((Customer) obj).outstandingAmt)
                && Objects.equals(this.phoneNo, ((Customer) obj).phoneNo)
                && Objects.equals(this.agentCode, ((Customer) obj).agentCode);
    }

    public String getCustCode() {
        return custCode;
    }

    public String getCustName() {
        return custName;
    }

    public String getCustCity() {
        return custCity;
    }

    public String getWorkingArea() {
        return workingArea;
    }

    public String getCustCountry() {
        return custCountry;
    }

    public BigInteger getGrade() {
        return grade;
    }

    public BigDecimal getOpeningAmt() {
        return openingAmt;
    }

    public BigDecimal getReceiveAmt() {
        return receiveAmt;
    }

    public BigDecimal getPaymentAmt() {
        return paymentAmt;
    }

    public BigDecimal getOutstandingAmt() {
        return outstandingAmt;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public String getAgentCode() {
        return agentCode;
    }

    public void setCustCode(String custCode) {
        this.custCode = custCode;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public void setCustCity(String custCity) {
        this.custCity = custCity;
    }

    public void setWorkingArea(String workingArea) {
        this.workingArea = workingArea;
    }

    public void setCustCountry(String custCountry) {
        this.custCountry = custCountry;
    }

    public void setGrade(BigInteger grade) {
        this.grade = grade;
    }

    public void setOpeningAmt(BigDecimal openingAmt) {
        this.openingAmt = openingAmt;
    }

    public void setReceiveAmt(BigDecimal receiveAmt) {
        this.receiveAmt = receiveAmt;
    }

    public void setPaymentAmt(BigDecimal paymentAmt) {
        this.paymentAmt = paymentAmt;
    }

    public void setOutstandingAmt(BigDecimal outstandingAmt) {
        this.outstandingAmt = outstandingAmt;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void setAgentCode(String agentCode) {
        this.agentCode = agentCode;
    }
}
