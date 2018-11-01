package ZFDServer.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "CASHTURNOVER")
public class CashTurnover {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CASHTURNOVERSEQUENCE")
    @SequenceGenerator(name="CASHTURNOVERSEQUENCE", sequenceName="CASHTURNOVERSEQUENCE", allocationSize=1)
    @Column(name = "ID")
    private Long idCashTurnover;

    @Column(name = "CASHTURNOVERTYPE", nullable = false)
    private String cashTurnoverType;

    @Column(name = "TYPE", nullable = false)
    private String type;

    @Column(name = "AMOUNT", nullable = false)
    private float amount;

    @Column(name = "EXCHANGERATE")
    private float exchangeRate;

    @Column(name = "VALUEAFTER", nullable = false)
    private float valueAfter;

    @Column(name = "VALUEBEFORE", nullable = false)
    private float valueBefore;

    @Column(name = "TURNOVERDATE", nullable = false)
    private Date turnoverDate;

    @Column(name = "DESCRIPTION")
    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IDSOURCE")
    private Source source;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IDWALLET")
    private Wallet wallet;

    public CashTurnover(String cashTurnoverType, String type, float amount, float exchangeRate, float valueAfter, float valueBefore, Date turnoverDate, String description, Source source, Wallet wallet) {
        this.cashTurnoverType = cashTurnoverType;
        this.type = type;
        this.amount = amount;
        this.exchangeRate = exchangeRate;
        this.valueAfter = valueAfter;
        this.valueBefore = valueBefore;
        this.turnoverDate = turnoverDate;
        this.description = description;
        this.source = source;
        this.wallet = wallet;
    }

    public CashTurnover() {
    }

    public Long getIdCashTurnover() {
        return idCashTurnover;
    }

    public void setIdCashTurnover(Long idCashTurnover) {
        this.idCashTurnover = idCashTurnover;
    }

    public String getCashTurnoverType() {
        return cashTurnoverType;
    }

    public void setCashTurnoverType(String cashTurnoverType) {
        this.cashTurnoverType = cashTurnoverType;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public float getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(float exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public float getValueAfter() {
        return valueAfter;
    }

    public void setValueAfter(float valueAfter) {
        this.valueAfter = valueAfter;
    }

    public float getValueBefore() {
        return valueBefore;
    }

    public void setValueBefore(float valueBefore) {
        this.valueBefore = valueBefore;
    }

    public Date getTurnoverDate() {
        return turnoverDate;
    }

    public void setTurnoverDate(Date turnoverDate) {
        this.turnoverDate = turnoverDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }

    public Wallet getWallet() {
        return wallet;
    }

    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }
}
