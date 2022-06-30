package it.univr.applicazioniweb.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    private BigInteger ordNum;
    private BigDecimal ordAmount;
    private BigDecimal advanceAmount;
    private LocalDate ordDate;
    private String custCode;
    private String agentCode;
    private String ordDescription;

    public Order(){
    }

    public Order(BigInteger ordNum, BigDecimal ordAmount, BigDecimal advanceAmount, LocalDate ordDate, String custCode, String agentCode, String ordDescription){
        this.ordNum = ordNum;
        this.ordAmount = ordAmount;
        this.advanceAmount = advanceAmount;
        this.ordDate = ordDate;
        this.custCode = custCode;
        this.agentCode = agentCode;
        this.ordDescription = ordDescription;
    }

    @Override
    public int hashCode(){
        final int prime = 31;
        int result = 7;
        result = prime * result + ((ordNum == null) ? 0 : ordNum.hashCode());
        result = prime * result + ((ordAmount == null) ? 0 : ordAmount.hashCode());
        result = prime * result + ((advanceAmount == null) ? 0 : advanceAmount.hashCode());
        result = prime * result + ((ordDate == null) ? 0 : ordDate.hashCode());
        result = prime * result + ((custCode == null) ? 0 : custCode.hashCode());
        result = prime * result + ((agentCode == null) ? 0 : agentCode.hashCode());
        result = prime * result + ((ordDescription == null) ? 0 : ordDescription.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj){
        return obj instanceof Order
                && Objects.equals(this.ordNum, ((Order) obj).ordNum)
                && Objects.equals(this.ordAmount, ((Order) obj).ordAmount)
                && Objects.equals(this.advanceAmount, ((Order) obj).advanceAmount)
                && Objects.equals(this.ordDate, ((Order) obj).ordDate)
                && Objects.equals(this.custCode, ((Order) obj).custCode)
                && Objects.equals(this.agentCode, ((Order) obj).agentCode)
                && Objects.equals(this.ordDescription, ((Order) obj).ordDescription);
    }

    public BigInteger getOrdNum() {
        return ordNum;
    }

    public BigDecimal getOrdAmount() {
        return ordAmount;
    }

    public BigDecimal getAdvanceAmount() {
        return advanceAmount;
    }

    public LocalDate getOrdDate() {
        return ordDate;
    }

    public String getCustCode() {
        return custCode;
    }

    public String getAgentCode() {
        return agentCode;
    }

    public String getOrdDescription() {
        return ordDescription;
    }

    public void setOrdNum(BigInteger ordNum) {
        this.ordNum = ordNum;
    }

    public void setOrdAmount(BigDecimal ordAmount) {
        this.ordAmount = ordAmount;
    }

    public void setAdvanceAmount(BigDecimal advanceAmount) {
        this.advanceAmount = advanceAmount;
    }

    public void setOrdDate(LocalDate ordDate) {
        this.ordDate = ordDate;
    }

    public void setCustCode(String custCode) {
        this.custCode = custCode;
    }

    public void setAgentCode(String agentCode) {
        this.agentCode = agentCode;
    }

    public void setOrdDescription(String ordDescription) {
        this.ordDescription = ordDescription;
    }
}
