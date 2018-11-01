package ZFDServer.springapp.dto;

import java.io.Serializable;
import java.sql.Date;

public class CashTurnoverDTO implements Serializable {


    private Long idCashTurnover;
    private String cashTurnoverType;
    private String type;
    private float amount;
    private String currency;
    private float exchangeRate;
    private float valueAfter;
    private float valueBefore;
    private Date turnoverDate;
    private String description;
    private SourceDTO source;
    private WalletDTO wallet;

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

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
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

    public SourceDTO getSource() {
        return source;
    }

    public void setSource(SourceDTO source) {
        this.source = source;
    }

    public WalletDTO getWallet() {
        return wallet;
    }

    public void setWallet(WalletDTO wallet) {
        this.wallet = wallet;
    }
}
