package it.univr.applicazioniweb.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "agents")
public class Agent {
    @Id
    private String agentCode;
    private String agentName;
    private String workingArea;
    private BigDecimal commission;
    private String phoneNo;
    private String country;

    public Agent(){
    }

    public Agent(String agentCode, String agentName, String workingArea, BigDecimal commission, String phoneNo, String country){
        this.agentCode = agentCode;
        this.agentName = agentName;
        this.workingArea = workingArea;
        this.commission = commission;
        this.phoneNo = phoneNo;
        this.country = country;
    }

    @Override
    public int hashCode(){
        final int prime = 31;
        int result = 7;
        result = prime * result + ((agentCode == null) ? 0 : agentCode.hashCode());
        result = prime * result + ((agentName == null) ? 0 : agentName.hashCode());
        result = prime * result + ((workingArea == null) ? 0 : workingArea.hashCode());
        result = prime * result + ((commission == null) ? 0 : commission.hashCode());
        result = prime * result + ((phoneNo == null) ? 0 : phoneNo.hashCode());
        result = prime * result + ((country == null) ? 0 : country.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj){
        return obj instanceof Agent
                && Objects.equals(this.agentCode, ((Agent) obj).agentCode)
                && Objects.equals(this.agentName, ((Agent) obj).agentName)
                && Objects.equals(this.workingArea, ((Agent) obj).workingArea)
                && Objects.equals(this.commission, ((Agent) obj).commission)
                && Objects.equals(this.phoneNo, ((Agent) obj).phoneNo)
                && Objects.equals(this.country, ((Agent) obj).country);
    }

    public String getAgentCode() {
        return agentCode;
    }

    public void setAgentCode(String agentCode) {
        this.agentCode = agentCode;
    }

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public String getWorkingArea() {
        return workingArea;
    }

    public void setWorkingArea(String workingArea) {
        this.workingArea = workingArea;
    }

    public BigDecimal getCommission() {
        return commission;
    }

    public void setCommission(BigDecimal commission) {
        this.commission = commission;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
